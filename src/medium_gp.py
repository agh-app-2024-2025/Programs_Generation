from copy import deepcopy
from enum import Enum
from functools import partial
from random import choice, random, randrange
from string import ascii_letters

import networkx as nx
from loguru import logger as log

INT_VALUE_MAX = 4
STR_LEN_MIN = 3
STR_LEN_MAX = 5


class NonTerms(Enum):
    start = "start"
    program = "program"
    # scopes
    open_scope = "openScope"
    close_scope = "closeScope"
    # functions
    scope_block = "scopeBlock"
    instruction = "instruction"
    eol = "eol"
    # variables
    variable_assignment = "variableAssignment"
    variable_name = "variable_name"
    variable_value = "variableValue"
    # if and loops
    condition = "condition"
    while_loop = "whileLoop"
    loop_body = "loopBody"
    tcontinue = "tcontinue"
    tbreak = "tbreak"
    # input and output
    input = "input"
    out = "out"
    # expression
    expression = "expression"
    term = "term"
    factor = "factor"
    # comparison
    comparison = "comparison"
    comparison_operator = "comparisonOperator"
    logical_operator = "logicalOperator"
    # literal
    literal = "literal"
    int_literal = "intLiteral"
    float_literal = "floatLiteral"
    str_literal = "strLiteral"


class Terms(Enum):
    ALPHANUMERIC = partial(lambda: f"v{MediumGP.get_new_variable_number()}")
    OP_ASSIGN = partial(lambda: "=")
    OP_ADD = partial(lambda: "+")
    OP_SUBTRACT = partial(lambda: "-")
    OP_NOT = partial(lambda: "!")
    OP_EQUALS = partial(lambda: "==")
    OP_MORE = partial(lambda: ">")
    EOL = partial(lambda: ";")
    IF = partial(lambda: "if")
    ELSE = partial(lambda: "else")
    LEFT_PARENTHESIS = partial(lambda: "(")
    RIGHT_PARENTHESIS = partial(lambda: ")")
    LEFT_BRACKET = partial(lambda: "{")
    RIGHT_BRACKET = partial(lambda: "}")
    LITERAL = partial(lambda: str(randrange(INT_VALUE_MAX)))
    INT = partial(lambda: "int")
    FLOAT = partial(lambda: "float")
    STR = partial(lambda: "str")
    STR_QUOTE = partial(lambda: '"')
    WHILE = partial(lambda: "while")
    CONT = partial(lambda: "continue")
    BRK = partial(lambda: "break")
    OP_MULTIPLY = partial(lambda: "*")
    OP_DIVIDE = partial(lambda: "/")
    OP_MODE = partial(lambda: "%")
    OP_NOTEQUALS = partial(lambda: "!=")
    OP_LESS = partial(lambda: "<")
    OP_LESSEQUAL = partial(lambda: "<=")
    OP_MOREEQUAL = partial(lambda: ">=")
    OP_OR = partial(lambda: "||")
    OP_AND = partial(lambda: "&&")
    OP_XOR = partial(lambda: "^")
    OUT = partial(lambda: "out")
    INPUT = partial(lambda: "input")
    DOT = partial(lambda: ".")
    NUMBER = partial(lambda: randrange(0, INT_VALUE_MAX))
    STR_LITERAL = partial(lambda: "".join([choice(ascii_letters + "0123456789") for _ in range(randrange(STR_LEN_MIN, STR_LEN_MAX))]))


grammar = {
    NonTerms.start.value: [[NonTerms.program]],
    NonTerms.program.value: [
        [NonTerms.instruction, NonTerms.instruction, NonTerms.instruction],
    ],
    # Scopes
    NonTerms.open_scope.value: [
        [Terms.LEFT_BRACKET],
    ],
    NonTerms.close_scope.value: [
        [Terms.RIGHT_BRACKET],
    ],
    # Functions
    NonTerms.scope_block.value: [
        [NonTerms.open_scope, NonTerms.instruction, NonTerms.close_scope],
    ],
    NonTerms.instruction.value: [
        [NonTerms.variable_assignment],
        [NonTerms.condition],
        [NonTerms.while_loop],
        [NonTerms.scope_block],
        [NonTerms.input],
        [NonTerms.out],
        [NonTerms.instruction, NonTerms.instruction],
    ],
    NonTerms.eol.value: [[Terms.EOL]],
    # Variables
    NonTerms.variable_assignment.value: [
        [NonTerms.variable_name, Terms.OP_ASSIGN, NonTerms.variable_value, NonTerms.eol],
    ],
    NonTerms.variable_name.value: [
        [Terms.ALPHANUMERIC],
    ],
    NonTerms.variable_value.value: [
        [NonTerms.expression],
        [NonTerms.comparison],
        [NonTerms.literal],
    ],
    # If and Loops
    NonTerms.condition.value: [
        [Terms.IF, NonTerms.comparison, NonTerms.scope_block],
        [Terms.IF, NonTerms.comparison, NonTerms.scope_block],
        [Terms.IF, NonTerms.comparison, NonTerms.scope_block],
        [Terms.IF, NonTerms.comparison, NonTerms.scope_block, Terms.ELSE, NonTerms.scope_block],
    ],
    NonTerms.while_loop.value: [
        [Terms.WHILE, NonTerms.comparison, NonTerms.loop_body],
    ],
    NonTerms.loop_body.value: [
        [NonTerms.open_scope, NonTerms.instruction, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.tcontinue, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.tbreak, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.instruction, NonTerms.instruction, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.tcontinue, NonTerms.instruction, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.tbreak, NonTerms.instruction, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.instruction, NonTerms.tcontinue, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.tcontinue, NonTerms.tcontinue, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.tbreak, NonTerms.tcontinue, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.instruction, NonTerms.tbreak, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.tcontinue, NonTerms.tbreak, NonTerms.close_scope],
        [NonTerms.open_scope, NonTerms.tbreak, NonTerms.tbreak, NonTerms.close_scope],
    ],
    NonTerms.tcontinue.value: [
        [Terms.CONT, NonTerms.eol],
    ],
    NonTerms.tbreak.value: [
        [Terms.BRK, NonTerms.eol],
    ],
    # IO
    NonTerms.input.value: [[NonTerms.variable_name, Terms.OP_ASSIGN, Terms.INPUT, Terms.LEFT_PARENTHESIS, Terms.RIGHT_PARENTHESIS, NonTerms.eol]],
    NonTerms.out.value: [
        [Terms.OUT, Terms.LEFT_PARENTHESIS, NonTerms.expression, Terms.RIGHT_PARENTHESIS, NonTerms.eol],
    ],
    NonTerms.out.value: [
        [Terms.OUT, Terms.LEFT_PARENTHESIS, NonTerms.expression, Terms.RIGHT_PARENTHESIS, NonTerms.eol],
    ],
    # Expression
    NonTerms.expression.value: [
        [NonTerms.term],
        [NonTerms.term],
        [NonTerms.term],
        [NonTerms.expression, Terms.OP_ADD, NonTerms.term],
        [NonTerms.expression, Terms.OP_SUBTRACT, NonTerms.term],
    ],
    NonTerms.term.value: [
        [NonTerms.factor],
        [NonTerms.factor],
        [NonTerms.factor],
        [NonTerms.factor],
        [NonTerms.term, Terms.OP_MULTIPLY, NonTerms.factor],
        [NonTerms.term, Terms.OP_DIVIDE, NonTerms.factor],
        [NonTerms.term, Terms.OP_MODE, NonTerms.factor],
    ],
    NonTerms.factor.value: [
        [NonTerms.literal],
        [NonTerms.variable_name],
        [Terms.LEFT_PARENTHESIS, Terms.OP_SUBTRACT, NonTerms.factor, Terms.RIGHT_PARENTHESIS],
        [Terms.LEFT_PARENTHESIS, NonTerms.expression, Terms.RIGHT_PARENTHESIS],
    ],
    # Comparison
    NonTerms.comparison.value: [
        [Terms.LEFT_PARENTHESIS, NonTerms.expression, NonTerms.comparison_operator, NonTerms.expression, Terms.RIGHT_PARENTHESIS],
        [Terms.LEFT_PARENTHESIS, NonTerms.comparison, NonTerms.logical_operator, NonTerms.comparison, Terms.RIGHT_PARENTHESIS],
        [Terms.LEFT_PARENTHESIS, Terms.OP_NOT, NonTerms.comparison, Terms.RIGHT_PARENTHESIS],
        [Terms.LEFT_PARENTHESIS, NonTerms.comparison, Terms.RIGHT_PARENTHESIS],
        [Terms.LEFT_PARENTHESIS, NonTerms.variable_name, Terms.RIGHT_PARENTHESIS],
    ],
    NonTerms.comparison_operator.value: [
        [Terms.OP_EQUALS],
        [Terms.OP_NOTEQUALS],
        [Terms.OP_LESS],
        [Terms.OP_LESSEQUAL],
        [Terms.OP_MORE],
        [Terms.OP_MOREEQUAL],
    ],
    NonTerms.logical_operator.value: [
        [Terms.OP_OR],
        [Terms.OP_AND],
        # [Terms.OP_XOR],
    ],
    # Literals
    NonTerms.literal.value: [
        [NonTerms.int_literal],
        [NonTerms.float_literal],  # ,
        # [NonTerms.str_literal],
    ],
    NonTerms.int_literal.value: [
        [Terms.NUMBER],
    ],
    NonTerms.float_literal.value: [
        [Terms.NUMBER, Terms.DOT, Terms.NUMBER],
    ],
    NonTerms.str_literal.value: [
        [Terms.STR_QUOTE, Terms.STR_LITERAL, Terms.STR_QUOTE],
    ],
}

minimal_depths2 = {
    NonTerms.start: (6, False),
    NonTerms.program: (5, False),
    NonTerms.open_scope: (2, False),
    NonTerms.close_scope: (2, False),
    NonTerms.scope_block: (5, True),
    NonTerms.instruction: (4, True),
    NonTerms.eol: (2, False),
    NonTerms.variable_assignment: (5, False),
    NonTerms.variable_name: (2, False),
    NonTerms.variable_value: (4, False),
    NonTerms.condition: (6, True),
    NonTerms.while_loop: (6, True),
    NonTerms.loop_body: (5, True),
    NonTerms.tcontinue: (3, False),
    NonTerms.tbreak: (3, False),
    NonTerms.input: (3, False),
    NonTerms.out: (6, False),
    NonTerms.expression: (5, False),
    NonTerms.term: (4, False),
    NonTerms.factor: (3, False),
    NonTerms.comparison: (3, False),
    NonTerms.comparison_operator: (2, False),
    NonTerms.logical_operator: (2, False),
    NonTerms.literal: (3, False),
    NonTerms.int_literal: (2, False),
    NonTerms.float_literal: (2, False),
    NonTerms.str_literal: (2, False),
}


class Program:
    def __init__(self, *depth):
        self.graph = nx.DiGraph()
        self.depth = 0

        self.variable_counter = 0
        self.node_count = 0
        self.last_node = -1
        self.score: float = 0
        self.index = None

        if len(depth) > 0:
            self.depth = depth[0]

            self.add_node(self.node_count, non_terminal_name="start", parent=-1, depth=1)

            parent_node = self.get_index_newest_node()
            self.add_node(self.node_count, non_terminal_name="program", parent=parent_node, depth=2)
            self.add_edge(parent_node, self.get_index_newest_node())

    def add_node(self, node_for_adding, **attr):
        self.graph.add_node(node_for_adding, **attr)
        self.node_count += 1
        self.last_node += 1

    def add_edge(self, u_of_edge, v_of_edge, **attr):
        self.graph.add_edge(u_of_edge, v_of_edge, **attr)

    def get_index_newest_node(self):
        return self.node_count - 1

    def get_number_for_new_node(self):
        num = self.node_count
        self.node_count += 1
        self.last_node += 1
        return num

    def get_new_variable_number(self):
        var_num = randrange(0, self.variable_counter + 1)
        if var_num == self.variable_counter:
            self.variable_counter += 1
        return var_num

    def stringify(self):
        prog = ""

        for i in range(len(self.graph.nodes())):
            if "value" in self.graph.nodes()[i]:
                prog += str(self.graph.nodes()[i]["value"])

        return prog

    def relabel_parents(self, mapping: dict):
        for node in self.graph.nodes():
            parent = self.graph.nodes()[node]["parent"]
            if parent in mapping.keys():
                self.graph.nodes()[node]["parent"] = mapping[parent]

    def extend_program(self, sub_graph: nx.DiGraph, parent: int):
        self.graph.add_nodes_from(sub_graph.nodes())
        self.node_count = len(self.graph.nodes())
        self.graph.add_edges_from(sub_graph.edges())
        nx.set_node_attributes(self.graph, {node: sub_graph.nodes()[node] for node in sub_graph.nodes()})
        sub_graph_root = min(sub_graph.nodes())
        self.graph.add_edge(parent, sub_graph_root)
        self.graph.nodes()[sub_graph_root]["parent"] = parent

        self.last_node = max(self.graph.nodes())
        self.variable_counter = self.count_variables()

    def relabel(self, my_dict: dict):
        self.graph = nx.relabel_nodes(self.graph, my_dict)
        self.last_node = max(self.graph.nodes())
        self.relabel_parents(my_dict)

    def generate_program(self, parent_node: int, depth: int, maximise_depth: bool = False):
        depth += 1
        parent_name: str = self.graph.nodes()[parent_node]["non_terminal_name"]

        possible_values = MediumGP.possible_children[parent_name]

        good_possible_values = []
        big_possible_values = []
        for possible_val in possible_values:
            depth_requirement = max([1 if isinstance(symbol, Terms) else MediumGP.minimal_depths[symbol][0] for symbol in possible_val])
            if depth_requirement <= (self.depth - depth):
                good_possible_values.append(possible_val)

                if not maximise_depth:
                    continue
                if True in [False if isinstance(symbol, Terms) else MediumGP.minimal_depths[symbol][1] for symbol in possible_val]:
                    big_possible_values.append(possible_val)

        if big_possible_values:
            good_possible_values = big_possible_values

        for possible_val in good_possible_values[randrange(len(good_possible_values))]:
            # NonTerms
            if not Program.is_term(possible_val):  # enum.name[0].islower():
                self.add_node(self.node_count, non_terminal_name=possible_val.value, parent=parent_node, depth=self.graph.nodes()[parent_node]["depth"])
                self.add_edge(parent_node, self.get_index_newest_node())
                self.generate_program(self.get_index_newest_node(), depth)
            # Terms
            else:
                self.add_node(
                    self.node_count,
                    terminal_node=possible_val.name,
                    parent=parent_node,
                    value=possible_val.value(),
                    depth=self.graph.nodes()[parent_node]["depth"],
                )
                self.add_edge(parent_node, self.get_index_newest_node())

    def mutate(self, start_node: int = -1, mutation_count=1):
        for i in range(mutation_count):
            if start_node != -1 and start_node < self.node_count and not Program.is_term(self.get_symbol_name(start_node)):
                nonterminal_node = start_node
            else:
                starting_node = choice(range(1, self.node_count))

                nonterminal_node = self.graph.nodes()[starting_node]["parent"]

            nodes_to_delete = nx.nodes(nx.dfs_tree(self.graph, nonterminal_node))
            nodes_to_delete = set(nodes_to_delete)
            nodes_to_delete = nodes_to_delete.symmetric_difference({nonterminal_node})
            old_node_max = max(nodes_to_delete)
            num_of_nodes_before_removing = max(self.graph.nodes())
            self.graph.remove_nodes_from(nodes_to_delete)

            depth = 1
            parent = self.graph.nodes()[nonterminal_node]["parent"]
            while parent != -1:
                parent = self.graph.nodes()[parent]["parent"]
                depth += 1

            self.generate_program(nonterminal_node, depth)

            num_of_nodes_after_adding = max(self.graph.nodes())
            diff_dict_newly_added = {
                i: nonterminal_node + i - num_of_nodes_before_removing for i in range(num_of_nodes_before_removing, num_of_nodes_after_adding + 1)
            }
            difference_in_node_count = (num_of_nodes_after_adding - num_of_nodes_before_removing) - (old_node_max - nonterminal_node)

            diff_dict_old_ones = {i: i + difference_in_node_count for i in range(old_node_max + 1, num_of_nodes_before_removing + 1)}
            diff_dict_newly_added.update(diff_dict_old_ones)
            self.graph = nx.relabel_nodes(self.graph, diff_dict_newly_added)

            self.relabel_parents(diff_dict_newly_added)
            self.node_count = len(self.graph)

            test_nodes_numbers(self.graph)

    def get_symbol_name(self, node):
        if "non_terminal_name" in self.graph.nodes()[node]:
            return self.graph.nodes()[node]["non_terminal_name"]
        elif "terminal_node" in self.graph.nodes()[node]:
            return self.graph.nodes()[node]["terminal_node"]
        else:
            return ""

    def is_term_node_number(self, node):
        return "terminal_node" in self.graph.nodes()[node]

    def test_empty_nodes(self, write_errors=True):
        bad_nodes = []
        for node in self.graph.nodes():
            node_details = self.graph.nodes()[node]
            if "parent" not in node_details or self.get_symbol_name(node) == "":
                bad_nodes.append(node)
                if write_errors:
                    log.debug("Vulnerable node:", node_details)

        return bad_nodes

    def count_variables(self):
        counter = 0
        counter += sum([self.get_symbol_name(node) == NonTerms.variable_name.value for node in nx.dfs_tree(self.graph, 0)])
        return counter

    def count_depths(self):
        v = (0, 1)
        queue = [v]

        while len(queue) > 0:
            node = queue.pop(-1)

            self.graph.nodes()[node[0]]["depth"] = node[1]
            queue.append(())

    def test(self, write_errors=True):
        tests = {
            "node_count": [self.node_count, len(self.graph.nodes())],
            "node_numbers": [test_nodes_numbers(self.graph), ""],
            "last_node": [self.last_node, max(self.graph.nodes())],
            "variable_counter": [self.variable_counter, self.count_variables()],
            "bad_nodes": [self.test_empty_nodes(), []],
        }
        tests["node_count"].append(tests["node_count"][0] == tests["node_count"][1])
        tests["node_numbers"].append(tests["node_numbers"][0] == tests["node_numbers"][1])
        tests["last_node"].append(tests["last_node"][0] == tests["last_node"][1])
        tests["variable_counter"].append(tests["variable_counter"][0] == tests["variable_counter"][1])
        tests["bad_nodes"].append(tests["bad_nodes"][0] == tests["bad_nodes"][1])

        ok = True
        for key, test in tests.items():
            if not test[2]:
                if write_errors:
                    log.error(key, "is:", test[0], "should be:", test[1])
                ok = False

        return ok

    @staticmethod
    def is_term(symbol):
        return isinstance(symbol, Terms)


class MediumGP:
    current_program: Program = None
    possible_children = grammar
    minimal_depths = minimal_depths2

    def __init__(self, depth: int, maximise_depth: bool = False):
        self.programs_list: list[Program] = []
        self.best_program: Program = None
        self.depth: int = depth
        self.maximise_depth: bool = maximise_depth
        self.program_index = 0
        self.mutation_probability = 0.40
        self.cross_probability = 0.40
        self.create_new_probability = 0.20
        self.nothing_probability = 0
        self.mutation_count = False

    @staticmethod
    def get_index_newest_node(graph: nx.DiGraph):
        return list(graph.nodes())[-1]

    def generate_new_program(self, max_depth, maximise_depth: bool = False):
        self.maximise_depth = maximise_depth

        program = Program(max_depth)
        MediumGP.current_program = program

        program.generate_program(program.get_index_newest_node(), 2)

        self.add_program(program)

    def add_program(self, program: Program):
        program.index = self.program_index
        self.program_index += 1
        self.programs_list.append(program)

    @classmethod
    def get_new_variable_number(cls):
        return cls.current_program.get_new_variable_number()

    @classmethod
    def get_number_for_new_node(cls):
        return cls.current_program.get_number_for_new_node()

    def create_generation(self, programs_count):
        for _ in range(programs_count):
            self.generate_new_program(self.depth, self.maximise_depth)

    @staticmethod
    def fitness_helper(program: Program, fitness):
        program.score = 0

        try:
            with open(f"./outputs/output_{program.index}.txt", "r") as f:
                lines = f.readlines()

                program.score = fitness(lines)
        except Exception:
            program.score = -1000
            return -1000

        return program.score

    def score_programs(self, fitness_fun):
        for program in self.programs_list:
            program.score = MediumGP.fitness_helper(program, fitness_fun)

        self.programs_list.sort(key=lambda x: x.score, reverse=True)

    def next_generation(self):
        for i, program in enumerate(self.programs_list):
            if i == 0:
                continue

            rand = random()

            if rand < self.cross_probability:
                program = MediumGP.cross(program, self.programs_list[0])
            elif rand < self.cross_probability + self.mutation_probability:
                program.mutate(mutation_count=self.mutation_count)
            elif rand < self.cross_probability + self.mutation_probability + self.create_new_probability:
                program.mutate(1)
            else:
                pass

    def run_evolution(self, iterations=10, programs_count=10, fitness_fun=None):
        self.create_generation(programs_count)
        for i in range(iterations):
            self.next_generation(fitness_fun)

    @staticmethod
    def calc_fitness(program: Program):
        return -len(program.graph.nodes())

    @staticmethod
    def select_best(programs: list[Program]) -> Program:
        best = 0
        best_program: Program = None
        for prog in programs:
            actual_prog_fitness = MediumGP.calc_fitness(prog)
            if best < actual_prog_fitness:
                best = actual_prog_fitness
                best_program = prog

        return best_program

    @staticmethod
    def get_swapable_nodes(program1: Program, program2: Program):
        node1, node2 = None, None
        while node2 is None:
            p1_graph_nodes = program1.graph.nodes()
            while True:
                node1 = randrange(2, program1.node_count)
                if "non_terminal_name" in p1_graph_nodes[node1]:
                    break

            p2_graph_nodes = program2.graph.nodes()
            for node in p2_graph_nodes:
                if "non_terminal_name" not in p2_graph_nodes[node]:
                    continue
                if p2_graph_nodes[node]["non_terminal_name"] == p1_graph_nodes[node1]["non_terminal_name"]:
                    node2 = node
                    break
        return node1, node2

    @staticmethod
    def cross(program1: Program, program2: Program) -> Program:
        node1, node2 = MediumGP.get_swapable_nodes(program1, program2)

        new_program: Program = deepcopy(program1)

        paste_nodes_in_program2 = deepcopy(nx.bfs_tree(program1.graph, node1))
        paste_nodes_in_program1 = deepcopy(nx.bfs_tree(program2.graph, node2))

        nx.set_node_attributes(paste_nodes_in_program1, {node: program2.graph.nodes()[node].copy() for node in paste_nodes_in_program1.nodes()})
        nx.set_node_attributes(paste_nodes_in_program2, {node: program1.graph.nodes()[node].copy() for node in paste_nodes_in_program2.nodes()})

        parent1 = program1.graph.nodes()[node1]["parent"]

        len_before_cut1 = len(program1.graph.nodes())

        new_program.graph.remove_nodes_from(paste_nodes_in_program2.nodes())

        relabel_dict1 = {node: min(paste_nodes_in_program2) + i for i, node in enumerate(sorted(paste_nodes_in_program1.nodes()))}
        relabel_dict2 = {node: min(paste_nodes_in_program1) + i for i, node in enumerate(sorted(paste_nodes_in_program2.nodes()))}

        paste_nodes_in_program1_relabeled = Program()
        paste_nodes_in_program1_relabeled.graph = paste_nodes_in_program1
        paste_nodes_in_program1_relabeled.relabel(relabel_dict1)

        paste_nodes_in_program2_relabeled = Program()
        paste_nodes_in_program2_relabeled.graph = paste_nodes_in_program2
        paste_nodes_in_program2_relabeled.relabel(relabel_dict2)

        len_after_cut1 = len(new_program.graph.nodes()) + len(paste_nodes_in_program1.nodes())

        new_program.relabel({i: i + len_after_cut1 - len_before_cut1 for i in range(max(paste_nodes_in_program2.nodes()) + 1, len_before_cut1)})

        new_program.extend_program(paste_nodes_in_program1_relabeled.graph, parent1)

        new_program.test()

        return new_program


def test_nodes_numbers(graph: nx.DiGraph, write_errors=True):
    nodes_list = list(graph.nodes())
    is_in_graph = set(nodes_list)
    control_set = set([i for i in range(len(nodes_list))])
    not_existing_but_should = control_set.difference(is_in_graph)
    exist_but_bad_indexes = is_in_graph.difference(control_set)

    s = ""
    if len(not_existing_but_should) != 0:
        s += "\n--------------TEST NODES NUMBERS -----------------------------"
        s += f"\nTych wierzcholkow nie ma w grafie a powinny:  {not_existing_but_should}"
        s += f"\nObecne wierzcholki: {is_in_graph}"
        s += f"\nWierzcholki ze zlymi numerami: {exist_but_bad_indexes}"
        s += "\n--------------TEST NODES NUMBERS END-----------------------------\n"
        if write_errors:
            log.error(s)
    return s
