package Third;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		double r=0;
		try{
			System.out.println("������Բ�İ뾶��");
			r=reader.nextDouble();
			System.out.println("Բ�������"+Math.PI*r*r);
		}catch(InputMismatchException e)	
		{
			System.out.println("��Ҫ����һ������");
		}
		finally
		{System.out.println("���������ҵģ�");}
	}
}
