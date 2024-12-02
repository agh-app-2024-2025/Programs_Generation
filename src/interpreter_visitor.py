import antlr4.tree.Tree
from antlr4 import ParseTreeVisitor

from language.languageParser import languageParser


class InterpreterVisitor(ParseTreeVisitor):
    def __init__(self, input_file_path: str, output_file_path: str):
        self.input_file_path = input_file_path
        self.output_file_path = output_file_path
        self.program_code_py: str = ""
        self.actual_indent_level: int = 0
        self.prev_indent_level: int = 0
        self.variableNames: set[str] = set()

    def get_parsed_program_code(self):
        default_value = 1

        base_funs = (
            '''
def mod(*factors):
    result = factors[0]
    for i in range(1, len(factors)):
        if factors[i] != 0:
            result %= factors[i]
    return result
    
def div(*factors):
    result = factors[0]
    for i in range(1, len(factors)):
        if factors[i] != 0:
            result /= factors[i]
    return result\n

initOutputFile("'''
            + self.output_file_path
            + """")
"""
        )

        variable_initial_values = "\n"
        for v in self.variableNames:
            variable_initial_values += f"{v}={default_value}\n"

        return base_funs + "counter = [0]\n" + variable_initial_values + self.program_code_py

    def _get_indent(self) -> str:
        return "\t" * self.actual_indent_level

    def add_to_program(self, code: str):
        self.program_code_py += f"{self._get_indent()}{code}"

    def indent(self):
        self.actual_indent_level += 1

    def deindent(self):
        self.actual_indent_level -= 1

    def reset_indent(self):
        self.prev_indent_level = self.actual_indent_level
        self.actual_indent_level = 0

    def back_to_prev_indent(self):
        self.actual_indent_level = self.prev_indent_level
        self.prev_indent_level = 0

    def visitVariableAssignment(self, ctx: languageParser.VariableAssignmentContext):
        self.add_to_program(f"{ctx.variableName().getText()} = ")
        self.reset_indent()
        self.visit(ctx.variableValue())
        self.add_to_program("\n")
        self.back_to_prev_indent()
        return

    def visitVariableValue(self, ctx: languageParser.VariableValueContext):
        self.visitChildren(ctx)
        return

    def visitCondition(self, ctx: languageParser.ConditionContext):
        self.add_to_program("if ")
        self.reset_indent()
        self.visit(ctx.comparison())
        self.add_to_program(":\n")
        self.back_to_prev_indent()

        self.indent()
        self.visit(ctx.scopeBlock(0))
        self.deindent()

        if ctx.getChildCount() == 3:
            return

        self.add_to_program("else:\n")
        self.indent()
        self.visit(ctx.scopeBlock(1))
        self.deindent()

        return

    def visitScopeBlock(self, ctx: languageParser.ScopeBlockContext):
        self.visitChildren(ctx)
        return

    def visitInstruction(self, ctx: languageParser.InstructionContext):
        self.visitChildren(ctx)
        return

    def visitWhileLoop(self, ctx: languageParser.WhileLoopContext):
        self.add_to_program("while ")
        self.reset_indent()
        self.visit(ctx.comparison())
        self.add_to_program(":\n")
        self.back_to_prev_indent()

        self.visit(ctx.loopBody())

        return

    def visitLoopBody(self, ctx: languageParser.LoopBodyContext):
        self.indent()
        self.visitChildren(ctx)
        self.deindent()
        return

    def visitInput(self, ctx: languageParser.InputContext):
        self.add_to_program(f"{ctx.variableName().getText()} = readLineFromInputFile('{self.input_file_path}', counter)\n")
        return

    def visitOut(self, ctx: languageParser.OutContext):
        self.add_to_program("writeLineToOutputFile(")
        self.reset_indent()
        self.visit(ctx.expression())
        self.add_to_program(f", '{self.output_file_path}')\n")
        self.back_to_prev_indent()

        return

    def visitTcontinue(self, ctx: languageParser.TcontinueContext):
        self.add_to_program("continue\n")
        return

    def visitTbreak(self, ctx: languageParser.TbreakContext):
        self.add_to_program("break\n")
        return

    def visitVariableName(self, ctx: languageParser.VariableNameContext):
        self.variableNames.add(ctx.getText())
        self.add_to_program(ctx.getText())
        return

    def visitComparison(self, ctx: languageParser.ComparisonContext):
        for child in ctx.getChildren():
            if type(child) is antlr4.tree.Tree.TerminalNodeImpl:
                self.add_to_program(child.getText() if child.getText() != "!" else " not ")
            else:
                self.visit(child)

        return

    def visitExpression(self, ctx: languageParser.ExpressionContext):
        for child in ctx.getChildren():
            if type(child) is antlr4.tree.Tree.TerminalNodeImpl:
                self.add_to_program(child.getText())
            else:
                self.visit(child)

        return

    def visitTerm(self, ctx: languageParser.TermContext):
        div_fun_name = "div("
        mod_fun_name = "mod("
        fun_end = ")"

        children = [child for child in ctx.getChildren()]

        fun_names_at_beginning = [[] for _ in range(len(children))]
        fun_names_at_endings = [[] for _ in range(len(children))]
        seq_start = None
        for i, child in enumerate(children):
            if i + 1 == len(children):
                continue
            if children[i].getText() == "*":
                seq_start = None

            if children[i + 1].getText() == "/":
                if seq_start is None:
                    seq_start = i

                fun_names_at_beginning[seq_start].insert(0, div_fun_name)

                index_to_end = i + 2

                while index_to_end + 1 < len(children) and children[index_to_end + 1] == "/":
                    index_to_end += 2

                fun_names_at_endings[index_to_end].append(fun_end)
                continue

            if children[i + 1].getText() == "%":
                if seq_start is None:
                    seq_start = i

                fun_names_at_beginning[seq_start].insert(0, mod_fun_name)
                index_to_end = i + 2

                while index_to_end + 1 < len(children) and children[index_to_end + 1] == "%":
                    index_to_end += 2

                fun_names_at_endings[index_to_end].append(fun_end)
                continue

        for i, child in enumerate(children):
            if child.getText() in ["/", "%"]:
                self.add_to_program(", ")
                continue

            if child.getText() == "*":
                self.add_to_program(" * ")
                continue

            for thing in fun_names_at_beginning[i]:
                self.add_to_program(thing)

            self.visit(child)

            for thing in fun_names_at_endings[i]:
                self.add_to_program(thing)

    def visitFactor(self, ctx: languageParser.FactorContext):
        if ctx.getChildCount() == 1:
            self.visit(ctx.getChild(0))
            return

        if ctx.getChildCount() == 4:
            self.add_to_program("(-")
            self.visit(ctx.getChild(2))
            self.add_to_program(")")
            return

        if ctx.getChildCount() == 3:
            self.add_to_program("(")
            self.visit(ctx.getChild(1))
            self.add_to_program(")")
            return

        return

    def visitLiteral(self, ctx: languageParser.LiteralContext):
        self.add_to_program(ctx.getText())
        return

    def visitLogicalOperator(self, ctx: languageParser.LogicalOperatorContext):
        value = ctx.getText()

        if value == "&&":
            self.add_to_program(" and ")
        if value == "||":
            self.add_to_program(" or ")
        if value == "^^":
            self.add_to_program(" ^ ")
        return

    def visitComparisonOperator(self, ctx: languageParser.ComparisonOperatorContext):
        self.add_to_program(ctx.getText())
        return
