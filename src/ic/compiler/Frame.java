package ic.compiler;

import ic.ir.Label;

public class Frame {
	public Label label;
	public static final int WORD_SIZE = 4;
	
	public Frame(Label label){
		this.label = label;
	}
}
