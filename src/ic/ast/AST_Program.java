package ic.ast;
import ic.compiler.PrinterVisitor;
import ic.compiler.Visitor;

import java.util.ArrayList;
import java.util.List;

public class AST_Program extends AST_Node
{
	public ArrayList<AST_ClassDecl> classList;

	public AST_Program(ArrayList<AST_ClassDecl> lst)
	{
		this.classList = lst;
	}
	
	@Override
	public <ContextType, ResultType> ResultType accept(
			Visitor<ContextType, ResultType>  visitor, ContextType context) {
		return visitor.visit(this, context);
	}
	
	@Override
	public void accept(PrinterVisitor visitor) {
		visitor.visit(this);
	}

	public List<AST_ClassDecl> getClasses() {
		return classList;
	}

	@Override
	public String toString() {
		return "AST_Program [classList=" + classList + "]";
	}
	
	

}