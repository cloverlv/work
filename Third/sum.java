package Third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		double a,b;
		try{
			System.out.println("��������������0������");
			a=reader.nextDouble();
			b=reader.nextDouble();
			if(a<=0||b<=0){
				throw new NumberRangeException("��һ����"+a+",�ڶ�����"+b);
			}
			System.out.println("����֮��Ϊ��"+(a+b));
		}catch(InputMismatchException e)	
		{
			System.out.println("��Ҫ����һ������");
		}catch(NumberRangeException e){
			System.out.println(e.toString());
		}
		finally
		{System.out.println("���������ҵģ�");}
	}
}
