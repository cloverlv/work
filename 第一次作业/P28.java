package ��һ����ҵ;

public class P28 {
	public static void main(String[] args) {
		boolean flag;
		char	yeschar;
		byte	finbyte;
		int		intvalue;
		long	longvalue;
		short	shortvalue;
		float	floatvalue;
		double	doublevalue;
		
		flag		=	true;
		yeschar		=	'y';
		finbyte		=	30;
		intvalue	=	-70000;
		longvalue	=	2001;
		shortvalue	=	20000;
		floatvalue	=	9.997E-5f;
		doublevalue	=	floatvalue	*	floatvalue;
		
		System.out.println("The values are:");
		System.out.println("�������ͱ���		flag = " + flag);
		System.out.println("�ַ����ͱ���		yeschar = " + yeschar);
		System.out.println("�ֽ����ͱ���		finbyte	= " + finbyte);
		System.out.println("���α���			intvalue = " + intvalue);
		System.out.println("�����α���			longvalue = "+ longvalue);
		System.out.println("�����α���			shortvalue = " + shortvalue);
		System.out.println("�����ͱ���			floatvalue = " + floatvalue);
		System.out.println("˫���ȸ����ͱ���		doublevalue = " + doublevalue);
	}
}

