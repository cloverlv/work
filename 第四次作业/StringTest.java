package ���Ĵ���ҵ;
 
public class StringTest {
	 public static void main(String[] args) {
		  String result="";
		  StringBuffer sbResult=new StringBuffer();
		  int count=5000;//���������ַ����Ĵ���
		  
		  long startTime=System.currentTimeMillis();
		  for (int i = 0; i <count; i++) {
		   result=result+"a";
		  }
		  System.out.println("stringʱ���:"+(System.currentTimeMillis()-startTime));
		  
		   startTime=System.currentTimeMillis();
		  for (int i = 0; i <count; i++) {
		   sbResult.append("a");
		  }
		  System.out.println("stringbufferʱ���:"+(System.currentTimeMillis()-startTime));
		 }
}

