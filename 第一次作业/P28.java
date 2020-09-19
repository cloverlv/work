package 第一次作业;

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
		System.out.println("布尔类型变量		flag = " + flag);
		System.out.println("字符类型变量		yeschar = " + yeschar);
		System.out.println("字节类型变量		finbyte	= " + finbyte);
		System.out.println("整形变量			intvalue = " + intvalue);
		System.out.println("长整形变量			longvalue = "+ longvalue);
		System.out.println("短整形变量			shortvalue = " + shortvalue);
		System.out.println("浮点型变量			floatvalue = " + floatvalue);
		System.out.println("双精度浮点型变量		doublevalue = " + doublevalue);
	}
}

