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
			System.out.println("����һ��������");
		}
	}
	public static void ExceptionTest () throws NumberRangeException,
												InputMismatchException
	{
		Scanner reader=new Scanner(System.in);
		double a,b;
		System.out.println("��������������0������");
		a=reader.nextDouble();
		b=reader.nextDouble();
		if(a<=0||b<=0){
			throw new NumberRangeException("��һ����"+a+",�ڶ�����"+b);
		}
		System.out.println("����֮��Ϊ��"+(a+b));
	}
}
