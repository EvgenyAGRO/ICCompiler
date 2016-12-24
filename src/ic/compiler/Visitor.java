package ic.compiler;
import ic.ast.*;

/** An interface for traversing the AST received from the parser.
 * The visitor passes down objects of type ResultType
 * and propagates up objects of type ContextType.
 */
public interface Visitor<ContextType, ResultType> {

	public ResultType visit(AST_Exp expr, ContextType d); // V
	public ResultType visit(AST_ExpBinop expr, ContextType d); // V
	public ResultType visit(AST_ExpFunctionCall expr, ContextType d);
	public ResultType visit(AST_ExpNewClass expr, ContextType d); // V
	public ResultType visit(AST_ExpNewTypeArray expr, ContextType d);
	
	public ResultType visit(AST_StmtVarAssignment stmt, ContextType d); // V
	public ResultType visit(AST_StmtList stmts, ContextType d); // V
	public ResultType visit(AST_Stmt stmt, ContextType d); // V
	public ResultType visit(AST_StmtCall call, ContextType d); // V
	public ResultType visit(AST_StmtVariableDeclaration stmt, ContextType d); // V
	public ResultType visit(AST_StmtReturn stmt, ContextType d); // V
	public ResultType visit(AST_StmtIf stmt, ContextType d); // V
	public ResultType visit(AST_StmtWhile stmt, ContextType d); // V

	public ResultType visit(AST_VirtualCall call, ContextType d);

	public ResultType visit(AST_Variable var,  ContextType d);
	public ResultType visit(AST_VariableExpField var,  ContextType d);
	public ResultType visit(AST_VariableExpArray var,  ContextType d);
	public ResultType visit(AST_VariableID var,  ContextType d);
	
	public ResultType visit(AST_Type type, ContextType d);
	
	public ResultType visit(AST_FuncArgument funcArg, ContextType d); // V
	
	public ResultType visit(AST_Field field, ContextType d); // V
	
	public ResultType visit(AST_Method method, ContextType d); //  V
	
	public ResultType visit(AST_Literal call, ContextType d); 
	
	public ResultType visit(AST_ClassDecl classDecl, ContextType d); // V
	
	public ResultType visit(AST_Program program, ContextType d); // V

}