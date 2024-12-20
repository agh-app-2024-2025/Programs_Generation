# Genetic Programming Framework

## Overview

This project implements a **Genetic Programming (GP)** framework, designed to evolve programs written in a [custom programming language](/src/language/language.g4). These programs are generated, evaluated, and refined over successive generations to solve a given problem or optimize a specific objective.

## Key Features

### Custom language for program representation

The system uses a [unique programming language](/src/language/language.g4) designed specifically for the GP process. Programs are generated in this language to simplify the process of generation and lower the chance of incorrect programs.

#### Features of the language:

- variables (`int` and `float`)
- while loops
- if statements
- I/O
- algebraic operators: `+`, `-`, `*`, `/`, `%`
- boolean operators: `<`, `>`, `!=`, `==`, `&&`, `||`, `!`, `<=`, `>=`
- built-in functions `mod` and `div` that return `0` when divisor is equal to `0`

### Program evaluation and fitness measurement

Each generated program is translated to **Python**, executed, and its output is evaluated against predefined criteria. The evaluation process assigns a fitness score, which quantifies how well the program performs on the given task.

### Selection and elimination

Programs are sorted by their fitness scores, with weaker candidates being eliminated. The fittest programs are preserved for further genetic operations.

### Genetic operations

The best-performing programs undergo genetic transformations to create the next generation:

- Mutation: Small, random changes are made to program code to introduce variability.

- Crossover: Parts of two or more programs are combined to produce new programs, fostering diversity and innovation.

### Iterative evolution

The cycle of generation, evaluation, selection, and genetic transformation continues until a stopping condition is met (e.g., reaching a satisfactory fitness level or a predefined number of generations).

## Goals and applications

This framework serves as a foundation for exploring genetic programming concepts, such as:

- Automating the discovery of algorithms.

- Solving optimization problems with minimal human intervention.

- Experimenting with artificial evolution in the context of programming.

By iteratively evolving program behavior, the system demonstrates the power of Darwinian principles applied to computational problem-solving.

## Getting started

1. Clone the repository
2. Navigate to `/src/` in a terminal
3. Install Python packages from requirements.txt: `pip install -r ./requirements.txt`
4. Define your evaluation criteria and objective inside of `evolution.py`
5. Run the program with correct arguments e.g. `python ./main.py e d`

### Program arguments

#### Program mode
* `e` for evolution mode, the main mode of the program. It uses genetic algorithms to create the best program according to a fitness function.

* `i` for interpreter test mode, which allows for seeing some of the program abilities in more detail.

# Authors

**Melisa Bektas**, **Dominik Kikla**, **Julian Górski**
