package ic.compiler;
import ic.ast.*;

public class ASTPrinter implements PrinterVisitor {
	
	protected final AST_Node root;
	protected int numberOfTabs;

	
	public ASTPrinter(AST_Node root) {
		this.root = root;
	}
	
	public void print() {
		root.accept(this);
	}

	
	//--------HELLO-KITTY---------------
	
	//创创创炊抖洞创创创创创创创创� 
	//创创创抖创创抖抖洞炊抖洞抖抖创
	//创创创洞创创创创炊抖洞抖创创洞
	//创创创洞创创创创炊炊抖抖洞创洞
	//创创炊创创创创创抖抖洞创抖抖洞
	//创创洞创创创创创创创炊抖抖抖洞
	//创炊创创创创创创创创创炊抖抖创
	//炊抖创创炊创创创创创创创创炊创
	//创炊创创抖创创创创创创创创炊创
	//创炊洞创创创创创创创炊洞创炊创
	//创抖洞创创创创抖洞创炊洞创抖创
	//创创炊洞创创创创创创创创炊抖创
	//创创创炊抖创创创创创创炊抖创创
	//创炊抖抖炊抖抖抖抖抖抖抖创创创
	//创炊创创抖抖洞创炊抖洞创洞创创
	//创炊创创抖洞抖抖抖抖创炊抖创创
	//创炊抖抖抖抖抖抖创抖抖洞创抖创
	//创洞创创炊抖抖抖抖抖创创创炊创
	//炊创创创创炊抖抖抖洞创创创炊创
	//创洞创创创炊抖抖抖洞创创创炊创
	//创抖创创创炊洞创炊洞创创炊洞创
	//创创抖抖抖洞创创创炊抖抖洞创创

	

	@Override
	public void visit(AST_Exp expr) {
		//
	}

	@Override
	public void visit(AST_ExpBinop expr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AST_ExpNewClass expr) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void visit(AST_ExpNewTypeArray expr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AST_StmtVarAssignment stmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AST_StmtList stmts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AST_Stmt stmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AST_StmtCall call) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void visit(AST_StmtVariableDeclaration stmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AST_StmtReturn stmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AST_StmtIf stmt) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void visit(AST_StmtWhile stmt) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void visit(AST_VirtualCall call) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AST_Variable var) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AST_VariableExpField var) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AST_VariableExpArray var) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AST_VariableID var) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AST_Type type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AST_FuncArgument funcArg) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void visit(AST_Field field) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AST_Method method) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AST_ClassDecl classDecl) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void visit(AST_Program program) {
		// TODO Auto-generated method stub

	}

	
}


