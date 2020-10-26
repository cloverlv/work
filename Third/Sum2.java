package Third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum2 {
	public static void main(String[] args) {
		
		try{
			ExceptionTest();
		}catch(NumberRangeException e){
			System.out.println(e.toString());
		}catch(InputMismatchException e)
		{
			System.out.println("输入一个正数！");
		}
	}
	public static void ExceptionTest () throws NumberRangeException,
												InputMismatchException
	{
		Scanner reader=new Scanner(System.in);
		double a,b;
		System.out.println("请输入两个大于0的数：");
		a=reader.nextDouble();
		b=reader.nextDouble();
		if(a<=0||b<=0){
			throw new NumberRangeException("第一个数"+a+",第二个数"+b);
		}
		System.out.println("两数之和为："+(a+b));
	}
}
