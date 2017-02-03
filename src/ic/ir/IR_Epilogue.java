package ic.ir;

import ic.compiler.PrinterVisitor;
import ic.compiler.Visitor;
import ir.mipsgen.IRVisitor;

public class IR_Epilogue extends IR_Exp{
	
	int frameSize;
	
	public IR_Epilogue(int frameSize)
	{
		this.frameSize = frameSize;
	}

	@Override
	public void accept(PrinterVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <ResultType> ResultType accept(IRVisitor<ResultType> visitor) {
		return visitor.visit(this);
	}

}