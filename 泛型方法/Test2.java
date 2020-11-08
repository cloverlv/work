package 泛型方法实例;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator fg=new FruitGenerator();
		for(int i=0;i<10;i++)
			System.out.println(fg.next());
	}

}
