package ic.ir;

public class TempLabel {
	
	public String _name;
	private static int counter = 0 ;
	private static final String LABEL_PREFIX = "Label_";

	
	public TempLabel(String name){
		_name =LABEL_PREFIX + ++counter + "_" + name;
	}

}