from copy import deepcopy
from random import random

from loguru import logger as log

import interpreter
from medium_gp import MediumGP, Program

input_lines = []


def fitness(lines):
    """Fitness function that expects sum of numbers to be at least 7"""
    score = 0

    num_sum = sum([float(line) for line in lines])
    score += 0 if num_sum > 7 else num_sum / 7

    return score


def example_fitness1(lines):
    """Fitness function that expects at least one number 31415 in the output"""
    score = 0

    if len(lines) > 0:
        score = 1 / (min([abs(float(line) - 31415.0) for line in lines]) + 1)

    return score


def example_fitness2(lines):
    """Fitness function that expects at least one number 1 in the output"""
    score = 0

    if len(lines) > 0:
        score = 1 / (abs(float(lines[0]) - 1.0) + 1)

    return score


def example_fitness3(lines):
    """Fitness function that expects at least one numbers 1"""
    score = 0

    for line in lines:
        if "." in line:
            too_many_chars = len(line) - 2
        else:
            too_many_chars = len(line)
        score += abs(float(line) - 1.0) * too_many_chars**3

    if abs(score) < 0.001:
        return 1000

    return 1 / (score * len(lines))


def example_fitness4(lines):
    """Fitness function that expects 2 numbers in every line and their sum to be the same as numbers in input vector"""
    score = 0

    for line_in, line_out in zip(input_lines, lines):
        a, b = [int(x) for x in line_in.split(" ")]
        a_b_sum = int(line_out)
        if a + b == a_b_sum:
            score += 1

    score /= len(input_lines)

    return score


def show_best_program(best_program):
    log.success(f"best code: {best_program.stringify()}")
    log.success(f"best output: {interpreter.get_output(best_program)}")
    log.success(f"best score: {best_program.score:.2f}")


def run_evolution(
    mediumGP: MediumGP,
    fitness_fun=None,
    iterations=10,
    programs_count=10,
    stagnation_tolerance=5,
    stagnation_min_value=1e-9,
    create_generation=True,
):
    best_gen = 0
    best_scores = []

    if create_generation:
        mediumGP.create_generation(programs_count)
    else:
        for i in range(len(mediumGP.programs_list), programs_count):
            mediumGP.generate_new_program(max_depth=mediumGP.depth, maximise_depth=mediumGP.maximise_depth)

    interpreter.get_outputs(mediumGP.programs_list)
    mediumGP.score_programs(fitness_fun)

    the_best: Program = mediumGP.programs_list[0]
    best_scores.append(the_best.score)
    if abs(the_best.score - 1.0) < 1e-9:
        log.success("PROBLEM SOLVED")
        show_best_program(the_best)
        return

    log.debug(f"Generation: 0 best score (this gen): {the_best.score:.2f} best general: {the_best.score:.2f} from 0 generation")
    log.trace(the_best.stringify())

    ignore_weak_results_count = 0

    for i in range(1, iterations):
        mediumGP.next_generation()
        interpreter.get_outputs(mediumGP.programs_list)
        mediumGP.score_programs(fitness_fun)

        best = mediumGP.programs_list[0]
        if the_best is None or the_best.score < best.score:
            the_best = deepcopy(best)
            best_gen = i

        best_scores.append(best.score)

        if the_best.score == 1:
            log.info("PROBLEM SOLVED")
            show_best_program(the_best)
            return

        if (
            ignore_weak_results_count <= 0
            and len(best_scores) > stagnation_tolerance
            and (best_scores[-stagnation_tolerance] - best_scores[-1]) < stagnation_min_value
        ):
            rand = random()
            ignore_weak_results_count = stagnation_tolerance
            if rand < 0.5:
                mediumGP.mutation_count = 3
                log.info(f"Next generation will contain more aggressive mutations ({mediumGP.mutation_count}x more)")
            else:
                mediumGP.depth = int(mediumGP.depth * 1.15)
                log.info("Increased possible size of programs for next generation")
        else:
            mediumGP.mutation_count = 1

        log.debug(f"Generation: {i} best score (this gen): {best.score:.2f} best general: {the_best.score:.2f} from {best_gen} generation")
        log.trace(the_best.stringify())
        ignore_weak_results_count -= 1

    show_best_program(the_best)


def evolve_programs(fitness_file_path):
    with open("./inputs/input_0.txt", "r") as f:
        global input_lines
        input_lines = f.readlines()

    generator = MediumGP(30, True)

    if fitness_file_path is not None:
        namespace = {}
        with open(fitness_file_path) as f:
            code = f.read()
            exec(code, namespace)

        global fitness
        log.success(f"Using custom fitness function:\n{code}")
    else:
        log.success("Using default fitness function")

    run_evolution(generator, fitness_fun=fitness, iterations=10, programs_count=5)
