package Third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		double a,b;
		try{
			System.out.println("请输入两个大于0的数：");
			a=reader.nextDouble();
			b=reader.nextDouble();
			if(a<=0||b<=0){
				throw new NumberRangeException("第一个数"+a+",第二个数"+b);
			}
			System.out.println("两数之和为："+(a+b));
		}catch(InputMismatchException e)	
		{
			System.out.println("需要输入一个数！");
		}catch(NumberRangeException e){
			System.out.println(e.toString());
		}
		finally
		{System.out.println("你会回来找我的！");}
	}
}
