package test1;

public class StaticVar{
	public static int number;
}
class OtherClass {
	public void method() {
		int x = StaticVar.number;
	}
}


