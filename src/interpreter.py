import multiprocessing
import time

from antlr4 import CommonTokenStream, InputStream
from loguru import logger as log

from interpreter_visitor import InterpreterVisitor
from language.languageLexer import languageLexer
from language.languageParser import languageParser
from medium_gp import MediumGP, Program


def run(code: str):
    try:
        exec(code)
    except Exception as e:
        log.error(f"Unexpected error: {e}")


with open("inputs/input_0.txt") as f:
    lines = f.readlines()[:-1]
    lines = [float(x) for x in lines]


def readLineFromInputFile(file: str, line_index: list[int]):
    line = lines[line_index[0]]
    line_index[0] = (line_index[0] + 1) % len(lines)
    return line


def writeLineToOutputFile(value, file: str):
    with open(file, "a") as f:
        f.write(str(value) + "\n")


def initOutputFile(file: str):
    with open(file, "w") as f:
        f.write("")


def get_output(program: Program):
    try:
        with open(f"./outputs/output_{program.index}.txt", "r") as f:
            return f.readlines()
    except Exception:
        return ""


def get_outputs(programs: list[Program]):
    processes: list[multiprocessing.Process] = []

    for program in programs:
        chars = InputStream(program.stringify())
        lexer = languageLexer(chars)
        tokens = CommonTokenStream(lexer=lexer)
        parser = languageParser(tokens)
        parser.buildParseTrees = True
        tree = parser.start()

        visitor = InterpreterVisitor(f"./inputs/input_{0}.txt", f"./outputs/output_{program.index}.txt")
        visitor.visit(tree)
        code = visitor.get_parsed_program_code()

        p = multiprocessing.Process(target=run, args=(code,))
        p.start()
        processes.append(p)

    for p in processes:
        p.join(timeout=1)

    for p in processes:
        p.kill()


def interpreter_test():
    mediumGP = MediumGP(depth=20)

    processes: list[multiprocessing.Process] = []
    n = 2
    mediumGP.create_generation(10)
    get_outputs(mediumGP.programs_list)

    for _ in range(n):
        mediumGP.generate_new_program(mediumGP.depth, True)
        program = mediumGP.programs_list[-1].stringify()

        chars = InputStream(program)
        lexer = languageLexer(chars)
        tokens = CommonTokenStream(lexer=lexer)
        parser = languageParser(tokens)
        parser.buildParseTrees = True
        tree = parser.start()

        log.info("Code in our programming language:")
        log.info(program)

        visitor = InterpreterVisitor(f"inputs/input_{0}.txt", f"outputs/output_{0}.txt")
        visitor.visit(tree)
        code = visitor.get_parsed_program_code()
        log.info("Code translated to Python:")
        log.info(code)

        p = multiprocessing.Process(target=run, args=(code,))
        p.start()
        processes.append(p)

    time.sleep(0.5)

    for p in processes:
        if p.is_alive():
            p.terminate()
        p.join()
