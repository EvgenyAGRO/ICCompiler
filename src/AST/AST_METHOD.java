package AST;

import java.util.ArrayList;

public class AST_Method extends AST_FieldOrMethod
{
	public AST_Type methodType;
	public String methodName;
	public ArrayList<AST_FuncArgument> methodArgs;
	public ArrayList<AST_Stmt> methodStmtList;
	
	public AST_Method(AST_Type methodType, String methodName, ArrayList<AST_FuncArgument> methodArgs, ArrayList<AST_Stmt> methodStmtList)
	{
		this.methodType = methodType;
		this.methodName = methodName;
		this.methodArgs = methodArgs;
		this.methodStmtList = methodStmtList;
	}
	
}