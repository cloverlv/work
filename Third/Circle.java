package Third;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		double r=0;
		try{
			System.out.println("请输入圆的半径：");
			r=reader.nextDouble();
			System.out.println("圆的面积是"+Math.PI*r*r);
		}catch(InputMismatchException e)	
		{
			System.out.println("需要输入一个数！");
		}
		finally
		{System.out.println("你会回来找我的！");}
	}
}
