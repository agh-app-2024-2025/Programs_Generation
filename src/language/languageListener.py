# Generated from language.g4 by ANTLR 4.11.1
from antlr4 import *

if __name__ is not None and "." in __name__:
    from .languageParser import languageParser
else:
    from languageParser import languageParser

import os, sys

sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath("MediumGP"))))
from antlr.MediumGP import Program, NonTerms, Terms


# This class defines a complete listener for a parse tree produced by languageParser.
class languageListener(ParseTreeListener):
    program: Program
    parent_stack = []

    def __init__(self) -> None:
        super().__init__()
        self.program = Program()

    def pop_stack(self):
        if len(self.parent_stack) > 0:
            self.parent_stack.pop(-1)

    def add_not_term(self, non_term_name):
        parent_node = self.parent_stack[-1] if len(self.parent_stack) > 0 else self.program.last_node
        self.program.add_node(self.program.node_count, non_terminal_name=non_term_name, parent=parent_node)
        self.program.add_edge(parent_node, self.program.last_node)
        self.parent_stack.append(self.program.last_node)

    def add_term(self, term_name):
        parent_node = self.parent_stack[-1] if len(self.parent_stack) > 0 else self.program.last_node
        self.program.add_node(self.program.node_count, terminal_node=term_name.name, parent=parent_node, value=term_name.value())
        self.program.add_edge(parent_node, self.program.node_count - 1)

    def add_term_with_value(self, term_name, term_value):
        parent_node = self.parent_stack[-1] if len(self.parent_stack) > 0 else self.program.last_node
        self.program.add_node(self.program.node_count, terminal_node=term_name, parent=parent_node, value=term_value)
        self.program.add_edge(parent_node, self.program.node_count - 1)

    # Enter a parse tree produced by languageParser#start.
    def enterStart(self, ctx: languageParser.StartContext):
        self.program.add_node(self.program.node_count, non_terminal_name="start", parent=-1)
        self.parent_stack.append(self.program.last_node)

    # Exit a parse tree produced by languageParser#start.
    def exitStart(self, ctx: languageParser.StartContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#program.
    def enterProgram(self, ctx: languageParser.ProgramContext):
        self.add_not_term(NonTerms.program)

    # Exit a parse tree produced by languageParser#program.
    def exitProgram(self, ctx: languageParser.ProgramContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#openScope.
    def enterOpenScope(self, ctx: languageParser.OpenScopeContext):
        self.add_not_term(NonTerms.open_scope)
        self.add_term(Terms.LEFT_BRACKET)

    # Exit a parse tree produced by languageParser#openScope.
    def exitOpenScope(self, ctx: languageParser.OpenScopeContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#closeScope.
    def enterCloseScope(self, ctx: languageParser.CloseScopeContext):
        self.add_not_term(NonTerms.close_scope)
        self.add_term(Terms.RIGHT_BRACKET)

    # Exit a parse tree produced by languageParser#closeScope.
    def exitCloseScope(self, ctx: languageParser.CloseScopeContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#scopeBlock.
    def enterScopeBlock(self, ctx: languageParser.ScopeBlockContext):
        self.add_not_term(NonTerms.scope_block)

    # Exit a parse tree produced by languageParser#scopeBlock.
    def exitScopeBlock(self, ctx: languageParser.ScopeBlockContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#instruction.
    def enterInstruction(self, ctx: languageParser.InstructionContext):
        self.add_not_term(NonTerms.instruction)

    # Exit a parse tree produced by languageParser#instruction.
    def exitInstruction(self, ctx: languageParser.InstructionContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#eol.
    def enterEol(self, ctx: languageParser.EolContext):
        self.add_not_term(NonTerms.eol)
        self.add_term(Terms.EOL)

    # Exit a parse tree produced by languageParser#eol.
    def exitEol(self, ctx: languageParser.EolContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#variableAssignment.
    def enterVariableAssignment(self, ctx: languageParser.VariableAssignmentContext):
        self.add_not_term(NonTerms.variable_assignment)

    # Exit a parse tree produced by languageParser#variableAssignment.
    def exitVariableAssignment(self, ctx: languageParser.VariableAssignmentContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#variableName.
    def enterVariableName(self, ctx: languageParser.VariableNameContext):
        self.add_not_term(NonTerms.variable_name)
        self.add_term_with_value(Terms.ALPHANUMERIC.name, "")

    # Exit a parse tree produced by languageParser#variableName.
    def exitVariableName(self, ctx: languageParser.VariableNameContext):
        self.program.graph.nodes()[self.parent_stack[-1]]["value"] = ctx.getText()
        self.pop_stack()

    # Enter a parse tree produced by languageParser#variableValue.
    def enterVariableValue(self, ctx: languageParser.VariableValueContext):
        self.add_not_term(NonTerms.variable_value)

    # Exit a parse tree produced by languageParser#variableValue.
    def exitVariableValue(self, ctx: languageParser.VariableValueContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#condition.
    def enterCondition(self, ctx: languageParser.ConditionContext):
        self.add_term(Terms.IF)
        self.add_not_term(NonTerms.condition)

    # Exit a parse tree produced by languageParser#condition.
    def exitCondition(self, ctx: languageParser.ConditionContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#whileLoop.
    def enterWhileLoop(self, ctx: languageParser.WhileLoopContext):
        self.add_not_term(NonTerms.while_loop)

    # Exit a parse tree produced by languageParser#whileLoop.
    def exitWhileLoop(self, ctx: languageParser.WhileLoopContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#loopBody.
    def enterLoopBody(self, ctx: languageParser.LoopBodyContext):
        self.add_not_term(NonTerms.loop_body)

    # Exit a parse tree produced by languageParser#loopBody.
    def exitLoopBody(self, ctx: languageParser.LoopBodyContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#tcontinue.
    def enterTcontinue(self, ctx: languageParser.TcontinueContext):
        self.add_not_term(NonTerms.tcontinue)

    # Exit a parse tree produced by languageParser#tcontinue.
    def exitTcontinue(self, ctx: languageParser.TcontinueContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#tbreak.
    def enterTbreak(self, ctx: languageParser.TbreakContext):
        self.add_not_term(NonTerms.tbreak)

    # Exit a parse tree produced by languageParser#tbreak.
    def exitTbreak(self, ctx: languageParser.TbreakContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#input.
    def enterInput(self, ctx: languageParser.InputContext):
        self.add_not_term(NonTerms.input)

    # Exit a parse tree produced by languageParser#input.
    def exitInput(self, ctx: languageParser.InputContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#out.
    def enterOut(self, ctx: languageParser.OutContext):
        self.add_not_term(NonTerms.out)

    # Exit a parse tree produced by languageParser#out.
    def exitOut(self, ctx: languageParser.OutContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#expression.
    def enterExpression(self, ctx: languageParser.ExpressionContext):
        self.add_not_term(NonTerms.expression)

    # Exit a parse tree produced by languageParser#expression.
    def exitExpression(self, ctx: languageParser.ExpressionContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#term.
    def enterTerm(self, ctx: languageParser.TermContext):
        self.add_not_term(NonTerms.term)

    # Exit a parse tree produced by languageParser#term.
    def exitTerm(self, ctx: languageParser.TermContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#factor.
    def enterFactor(self, ctx: languageParser.FactorContext):
        self.add_not_term(NonTerms.factor)

    # Exit a parse tree produced by languageParser#factor.
    def exitFactor(self, ctx: languageParser.FactorContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#comparison.
    def enterComparison(self, ctx: languageParser.ComparisonContext):
        self.add_not_term(NonTerms.comparison)

    # Exit a parse tree produced by languageParser#comparison.
    def exitComparison(self, ctx: languageParser.ComparisonContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#comparisonOperator.
    def enterComparisonOperator(self, ctx: languageParser.ComparisonOperatorContext):
        self.add_not_term(NonTerms.comparison_operator)

    # Exit a parse tree produced by languageParser#comparisonOperator.
    def exitComparisonOperator(self, ctx: languageParser.ComparisonOperatorContext):
        operator = ctx.getText()
        term_name = ""
        if operator == "<":
            term_name = Terms.OP_LESS
        elif operator == "<=":
            term_name = Terms.OP_LESSEQUAL
        elif operator == ">=":
            term_name = Terms.OP_MOREEQUAL
        elif operator == "<":
            term_name = Terms.OP_MORE
        elif operator == "==":
            term_name = Terms.OP_EQUALS
        elif operator == "!=":
            term_name = Terms.OP_NOTEQUALS

        self.add_term_with_value(term_name, operator)
        self.pop_stack()

    # Enter a parse tree produced by languageParser#logicalOperator.
    def enterLogicalOperator(self, ctx: languageParser.LogicalOperatorContext):
        self.add_not_term(NonTerms.logical_operator)

    # Exit a parse tree produced by languageParser#logicalOperator.
    def exitLogicalOperator(self, ctx: languageParser.LogicalOperatorContext):
        operator = ctx.ALPHANUMERIC()
        term_name = ""
        if operator == "||":
            term_name = Terms.OP_OR
        elif operator == "&&":
            term_name = Terms.OP_AND
        elif operator == "^":
            term_name = Terms.OP_XOR

        self.add_term_with_value(term_name, operator)
        self.pop_stack()

    # Enter a parse tree produced by languageParser#literal.
    def enterLiteral(self, ctx: languageParser.LiteralContext):
        self.add_not_term(NonTerms.literal)

    # Exit a parse tree produced by languageParser#literal.
    def exitLiteral(self, ctx: languageParser.LiteralContext):
        self.pop_stack()

    # Enter a parse tree produced by languageParser#intLiteral.
    def enterIntLiteral(self, ctx: languageParser.IntLiteralContext):
        self.add_not_term(NonTerms.int_literal)

    # Exit a parse tree produced by languageParser#intLiteral.
    def exitIntLiteral(self, ctx: languageParser.IntLiteralContext):
        self.add_term_with_value(Terms.INT.name, ctx.getText())
        self.pop_stack()

    # Enter a parse tree produced by languageParser#floatLiteral.
    def enterFloatLiteral(self, ctx: languageParser.FloatLiteralContext):
        self.add_not_term(NonTerms.float_literal)

    # Exit a parse tree produced by languageParser#floatLiteral.
    def exitFloatLiteral(self, ctx: languageParser.FloatLiteralContext):
        self.add_term_with_value(Terms.FLOAT.name, ctx.getText())
        self.pop_stack()

    # Enter a parse tree produced by languageParser#strLiteral.
    def enterStrLiteral(self, ctx: languageParser.StrLiteralContext):
        pass

    # Exit a parse tree produced by languageParser#strLiteral.
    def exitStrLiteral(self, ctx: languageParser.StrLiteralContext):
        pass


del languageParser
