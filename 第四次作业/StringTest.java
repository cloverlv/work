package 第四次作业;
 
public class StringTest {
	 public static void main(String[] args) {
		  String result="";
		  StringBuffer sbResult=new StringBuffer();
		  int count=5000;//代表连接字符串的次数
		  
		  long startTime=System.currentTimeMillis();
		  for (int i = 0; i <count; i++) {
		   result=result+"a";
		  }
		  System.out.println("string时间差:"+(System.currentTimeMillis()-startTime));
		  
		   startTime=System.currentTimeMillis();
		  for (int i = 0; i <count; i++) {
		   sbResult.append("a");
		  }
		  System.out.println("stringbuffer时间差:"+(System.currentTimeMillis()-startTime));
		 }
}

