package Third;

public class NumberRangeException extends Exception {
	public NumberRangeException(String msg){
		super(msg+"数值范围不对！");
	}
}
