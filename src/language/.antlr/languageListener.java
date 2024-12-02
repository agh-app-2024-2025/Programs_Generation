// Generated from c:/dominik/uczelnia/sem9/Advanced_Python_Programming/Programs_Generation/src/language/language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link languageParser}.
 */
public interface languageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link languageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(languageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(languageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(languageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(languageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#openScope}.
	 * @param ctx the parse tree
	 */
	void enterOpenScope(languageParser.OpenScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#openScope}.
	 * @param ctx the parse tree
	 */
	void exitOpenScope(languageParser.OpenScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#closeScope}.
	 * @param ctx the parse tree
	 */
	void enterCloseScope(languageParser.CloseScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#closeScope}.
	 * @param ctx the parse tree
	 */
	void exitCloseScope(languageParser.CloseScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#scopeBlock}.
	 * @param ctx the parse tree
	 */
	void enterScopeBlock(languageParser.ScopeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#scopeBlock}.
	 * @param ctx the parse tree
	 */
	void exitScopeBlock(languageParser.ScopeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(languageParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(languageParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(languageParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(languageParser.EolContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(languageParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(languageParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(languageParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(languageParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue(languageParser.VariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue(languageParser.VariableValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(languageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(languageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(languageParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(languageParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(languageParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(languageParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#tcontinue}.
	 * @param ctx the parse tree
	 */
	void enterTcontinue(languageParser.TcontinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#tcontinue}.
	 * @param ctx the parse tree
	 */
	void exitTcontinue(languageParser.TcontinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#tbreak}.
	 * @param ctx the parse tree
	 */
	void enterTbreak(languageParser.TbreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#tbreak}.
	 * @param ctx the parse tree
	 */
	void exitTbreak(languageParser.TbreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(languageParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(languageParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(languageParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(languageParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(languageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(languageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(languageParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(languageParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(languageParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(languageParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(languageParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(languageParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(languageParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(languageParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(languageParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(languageParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(languageParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(languageParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(languageParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(languageParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(languageParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(languageParser.FloatLiteralContext ctx);
}