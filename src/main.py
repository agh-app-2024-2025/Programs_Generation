import sys

from loguru import logger as log
from interpreter import interpreter_test
from evolution import evolve_programs
from logging_config import LoggingConfig

EVOLUTION_MODE = "e"
INTERPRETER_TEST_MODE = "i"
CLI_INFO_MESSAGE = (
    f"First parameter to the program has to be the mode: '{EVOLUTION_MODE}' for evolution mode '{INTERPRETER_TEST_MODE}' for interpreter test mode"
)


if __name__ == "__main__":
    if len(sys.argv) <= 1:
        LoggingConfig.config(None)
        log.critical(CLI_INFO_MESSAGE)
        exit(-1)

    program_mode = sys.argv[1]
    logging_level = sys.argv[2] if len(sys.argv) >= 3 else ""
    fitness_file_path = sys.argv[3] if len(sys.argv) >= 4 else None

    LoggingConfig.config(logging_level)

    match program_mode:
        case "e":
            evolve_programs(fitness_file_path)
        case "i":
            interpreter_test()
        case _:
            log.critical(CLI_INFO_MESSAGE)
