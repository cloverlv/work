package ���Ĵ���ҵ;

public class StringTest2 {
	public static void main(String[] args) {
		Long statDate = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String str = "this is hello.";
		}
		Long endDate = System.currentTimeMillis();
		System.out.println("ֱ����string='' ʹ��ʱ�� : "
				+ (endDate - statDate) + " milli seconds");
 
		
		Long statDate1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String str = new String("this is hello.");
		}
		
		Long endDate1 = System.currentTimeMillis();
		System.out.println("��String str = new String('')ʹ��ʱ�� : "
				+ (endDate1 - statDate1) + " milli seconds");
 
		
		
		Long statDate2 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			StringBuffer str = new StringBuffer();
			str.append("this is hello.");
		}
		
		Long endDate2 = System.currentTimeMillis();
		System.out.println("��StringBuffer append('')ʹ��ʱ�� : "
				+ (endDate2 - statDate2) + " milli seconds");
		
		//**************���������ٶ�*****************
		System.out.println("\r\n**************String��StringBuffer���������ٶ�*****************\r\n");
		
		Long statDate3 = System.currentTimeMillis();
		String str="";
		for (int i = 0; i < 10000; i++) {//����������ѭ������,100000̫����
			str+="this is hello.";
		}
		
		Long endDate3 = System.currentTimeMillis();
		System.out.println("ʹ��str�����Լ�ʹ��ʱ�� : "
				+ (endDate3 - statDate3) + " milli seconds");
		
		
		Long statDate4 = System.currentTimeMillis();
		StringBuffer strBf=new StringBuffer();
		for (int i = 0; i < 10000; i++) {//����������ѭ������,100000̫����
			strBf.append("this is hello.");
		}
		
		Long endDate4 = System.currentTimeMillis();
		System.out.println("ʹ��StringBuffer�����Լ�ʹ��ʱ�� : "
				+ (endDate4 - statDate4) + " milli seconds");
		
		
		Long statDate5 = System.currentTimeMillis();
		StringBuffer strBf1=new StringBuffer(150000);
		for (int i = 0; i < 10000; i++) {//����������ѭ������,100000̫����
			strBf1.append("this is hello.");
		}
		
		Long endDate5 = System.currentTimeMillis();
		System.out.println("ʹ��StringBuffer��ʼ������ֵ�����Լ�ʹ��ʱ��: "
				+ (endDate5 - statDate5) + " milli seconds");
	}

}
