package 第四次作业;

public class StringTest2 {
	public static void main(String[] args) {
		Long statDate = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String str = "this is hello.";
		}
		Long endDate = System.currentTimeMillis();
		System.out.println("直接用string='' 使用时间 : "
				+ (endDate - statDate) + " milli seconds");
 
		
		Long statDate1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String str = new String("this is hello.");
		}
		
		Long endDate1 = System.currentTimeMillis();
		System.out.println("用String str = new String('')使用时间 : "
				+ (endDate1 - statDate1) + " milli seconds");
 
		
		
		Long statDate2 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			StringBuffer str = new StringBuffer();
			str.append("this is hello.");
		}
		
		Long endDate2 = System.currentTimeMillis();
		System.out.println("用StringBuffer append('')使用时间 : "
				+ (endDate2 - statDate2) + " milli seconds");
		
		//**************测试连接速度*****************
		System.out.println("\r\n**************String和StringBuffer测试连接速度*****************\r\n");
		
		Long statDate3 = System.currentTimeMillis();
		String str="";
		for (int i = 0; i < 10000; i++) {//这里缩短了循环次数,100000太慢了
			str+="this is hello.";
		}
		
		Long endDate3 = System.currentTimeMillis();
		System.out.println("使用str连续自加使用时间 : "
				+ (endDate3 - statDate3) + " milli seconds");
		
		
		Long statDate4 = System.currentTimeMillis();
		StringBuffer strBf=new StringBuffer();
		for (int i = 0; i < 10000; i++) {//这里缩短了循环次数,100000太慢了
			strBf.append("this is hello.");
		}
		
		Long endDate4 = System.currentTimeMillis();
		System.out.println("使用StringBuffer连续自加使用时间 : "
				+ (endDate4 - statDate4) + " milli seconds");
		
		
		Long statDate5 = System.currentTimeMillis();
		StringBuffer strBf1=new StringBuffer(150000);
		for (int i = 0; i < 10000; i++) {//这里缩短了循环次数,100000太慢了
			strBf1.append("this is hello.");
		}
		
		Long endDate5 = System.currentTimeMillis();
		System.out.println("使用StringBuffer初始化容量值连续自加使用时间: "
				+ (endDate5 - statDate5) + " milli seconds");
	}

}
