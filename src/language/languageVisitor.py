# Generated from language.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .languageParser import languageParser
else:
    from languageParser import languageParser
import os,sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath('MediumGP'))))
from antlr.MediumGP import Program, NonTerms, Terms
# This class defines a complete generic visitor for a parse tree produced by languageParser.

class languageVisitor(ParseTreeVisitor):

    program: Program
    parent_stack = []

    def __init__(self) -> None:
        super().__init__()
        self.program = Program()

    def pop_stack(self):
        if len(self.parent_stack) > 0:
            self.parent_stack.pop(-1)

    def add_not_term(self, non_term):
        parent_node = self.parent_stack[-1]
        self.program.add_node(self.program.node_count, non_terminal_name=non_term.value, parent=parent_node)
        self.program.add_edge(parent_node, self.program.last_node)
        self.parent_stack.append(self.program.last_node)
        
    def add_term(self, term_name):
        parent_node = self.parent_stack[-1]
        self.program.add_node(self.program.node_count, terminal_node=term_name.name, parent=parent_node, value=term_name.value())
        self.program.add_edge(parent_node, self.program.last_node)
    
    def add_term_with_value(self, term_name, term_value):
        parent_node = self.parent_stack[-1]
        self.program.add_node(self.program.node_count, terminal_node=term_name, parent=parent_node, value=term_value)
        self.program.add_edge(parent_node, self.program.last_node)


    # Visit a parse tree produced by languageParser#start.
    def visitStart(self, ctx:languageParser.StartContext):
        self.program.add_node(self.program.node_count, non_terminal_name='start', parent=-1)
        self.parent_stack.append(self.program.last_node)
        self.visitChildren(ctx)
        self.pop_stack()
        return True


    # Visit a parse tree produced by languageParser#program.
    def visitProgram(self, ctx:languageParser.ProgramContext):
        self.add_not_term(NonTerms.program)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#openScope.
    def visitOpenScope(self, ctx:languageParser.OpenScopeContext):
        self.add_not_term(NonTerms.open_scope)
        self.add_term(Terms.LEFT_BRACKET)
        self.visitChildren(ctx)
        self.pop_stack()

    # Visit a parse tree produced by languageParser#closeScope.
    def visitCloseScope(self, ctx:languageParser.CloseScopeContext):
        self.add_not_term(NonTerms.close_scope)
        self.add_term(Terms.RIGHT_BRACKET)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#scopeBlock.
    def visitScopeBlock(self, ctx:languageParser.ScopeBlockContext):
        self.add_not_term(NonTerms.scope_block)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#instruction.
    def visitInstruction(self, ctx:languageParser.InstructionContext):
        self.add_not_term(NonTerms.instruction)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#eol.
    def visitEol(self, ctx:languageParser.EolContext):
        self.add_not_term(NonTerms.eol)
        self.add_term(Terms.EOL)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#variableAssignment.
    def visitVariableAssignment(self, ctx:languageParser.VariableAssignmentContext):
        self.add_not_term(NonTerms.variable_assignment)
        self.visit(ctx.variableName())
        self.add_term(Terms.OP_ASSIGN)
        self.visit(ctx.variableValue())
        self.visit(ctx.eol())
        self.pop_stack()

    # Visit a parse tree produced by languageParser#variableName.
    def visitVariableName(self, ctx:languageParser.VariableNameContext):
        self.add_not_term(NonTerms.variable_name)
        self.add_term_with_value(Terms.ALPHANUMERIC.name, ctx.getText())
        #self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#variableValue.
    def visitVariableValue(self, ctx:languageParser.VariableValueContext):
        self.add_not_term(NonTerms.variable_value)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#condition.
    def visitCondition(self, ctx:languageParser.ConditionContext):
        self.add_not_term(NonTerms.condition)
        self.add_term(Terms.IF)
        self.visit(ctx.comparison())
        self.visit(ctx.scopeBlock(0))
        if(ctx.ELSE() is not None):
            self.add_term(Terms.ELSE)
            self.visit(ctx.scopeBlock(1))
        self.pop_stack()


    # Visit a parse tree produced by languageParser#whileLoop.
    def visitWhileLoop(self, ctx:languageParser.WhileLoopContext):
        self.add_not_term(NonTerms.while_loop)
        self.add_term(Terms.WHILE)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#loopBody.
    def visitLoopBody(self, ctx:languageParser.LoopBodyContext):
        self.add_not_term(NonTerms.loop_body)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#tcontinue.
    def visitTcontinue(self, ctx:languageParser.TcontinueContext):
        self.add_not_term(NonTerms.tcontinue)
        self.add_term(Terms.CONT)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#tbreak.
    def visitTbreak(self, ctx:languageParser.TbreakContext):
        self.add_not_term(NonTerms.tbreak)
        self.add_term(Terms.BRK)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#input.
    def visitInput(self, ctx:languageParser.InputContext):
        self.add_not_term(NonTerms.input)
        self.visit(ctx.variableName())
        self.add_term(Terms.OP_ASSIGN)
        self.add_term(Terms.INPUT)
        self.add_term(Terms.LEFT_PARENTHESIS)
        self.add_term(Terms.RIGHT_PARENTHESIS)
        self.visit(ctx.eol())
        self.pop_stack()


    # Visit a parse tree produced by languageParser#out.
    def visitOut(self, ctx:languageParser.OutContext):
        self.add_not_term(NonTerms.out)
        self.add_term(Terms.OUT)
        self.add_term(Terms.LEFT_PARENTHESIS)
        self.visit(ctx.expression())
        self.add_term(Terms.RIGHT_PARENTHESIS)
        self.visit(ctx.eol())
        self.pop_stack()


    # Visit a parse tree produced by languageParser#expression.
    def visitExpression(self, ctx:languageParser.ExpressionContext):
        self.add_not_term(NonTerms.expression)
        
        for child in ctx.getChildren():
            text = child.getText()
            if(text == '+'):
                self.add_term(Terms.OP_ADD)
            elif text == '-':
                self.add_term(Terms.OP_SUBTRACT)
            else:
                self.visit(child)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#term.
    def visitTerm(self, ctx:languageParser.TermContext):
        self.add_not_term(NonTerms.term)
        
        for child in ctx.getChildren():
            text = child.getText()
            if(text == Terms.OP_MULTIPLY.value()):
                self.add_term(Terms.OP_MULTIPLY)
            elif text == Terms.OP_DIVIDE.value():
                self.add_term(Terms.OP_DIVIDE)
            elif text == Terms.OP_MODE.value():
                self.add_term(Terms.OP_MODE)
            else:
                self.visit(child)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#factor.
    def visitFactor(self, ctx:languageParser.FactorContext):
        self.add_not_term(NonTerms.factor)
        
        for child in ctx.getChildren():
            text = child.getText()
            if(text == Terms.LEFT_PARENTHESIS.value()):
                self.add_term(Terms.LEFT_PARENTHESIS)
            elif text == Terms.RIGHT_PARENTHESIS.value():
                self.add_term(Terms.RIGHT_PARENTHESIS)
            elif text == Terms.OP_SUBTRACT.value():
                self.add_term(Terms.OP_SUBTRACT)
            else:
                self.visit(child)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#comparison.
    def visitComparison(self, ctx:languageParser.ComparisonContext):
        self.add_not_term(NonTerms.comparison)
        
        for child in ctx.getChildren():
            text = child.getText()
            if(text == Terms.LEFT_PARENTHESIS.value()):
                self.add_term(Terms.LEFT_PARENTHESIS)
            elif text == Terms.RIGHT_PARENTHESIS.value():
                self.add_term(Terms.RIGHT_PARENTHESIS)
            elif text == Terms.OP_NOT.value():
                self.add_term(Terms.OP_NOT)
            else:
                self.visit(child)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#comparisonOperator.
    def visitComparisonOperator(self, ctx:languageParser.ComparisonOperatorContext):
        self.add_not_term(NonTerms.comparison_operator)
        operator = ctx.getText()
        term_name = ''
        if operator == '<':
            term_name = Terms.OP_LESS
        elif operator == '<=':
            term_name = Terms.OP_LESSEQUAL
        elif operator == '>=':
            term_name = Terms.OP_MOREEQUAL
        elif operator == Terms.OP_MORE.value():
            term_name = Terms.OP_MORE
        elif operator == '==':
            term_name = Terms.OP_EQUALS
        elif operator == '!=':
            term_name = Terms.OP_NOTEQUALS
        
        self.add_term(term_name)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#logicalOperator.
    def visitLogicalOperator(self, ctx:languageParser.LogicalOperatorContext):
        self.add_not_term(NonTerms.logical_operator)
        operator = ctx.getText()
        term_name = ''
        if operator == '||':
            term_name = Terms.OP_OR
        elif operator == '&&':
            term_name = Terms.OP_AND
        elif operator == '^':
            term_name = Terms.OP_XOR
        
        self.add_term(term_name)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#literal.
    def visitLiteral(self, ctx:languageParser.LiteralContext):
        self.add_not_term(NonTerms.literal)
        self.visitChildren(ctx)
        self.pop_stack()


    # Visit a parse tree produced by languageParser#intLiteral.
    def visitIntLiteral(self, ctx:languageParser.IntLiteralContext):
        self.add_not_term(NonTerms.int_literal)
        self.add_term_with_value(Terms.INT.name, ctx.getText())
        self.pop_stack()


    # Visit a parse tree produced by languageParser#floatLiteral.
    def visitFloatLiteral(self, ctx:languageParser.FloatLiteralContext):
        self.add_not_term(NonTerms.float_literal)
        self.add_term_with_value(Terms.FLOAT.name, ctx.getText())
        self.pop_stack()


    # Visit a parse tree produced by languageParser#strLiteral.
    def visitStrLiteral(self, ctx:languageParser.StrLiteralContext):
        pass



del languageParser