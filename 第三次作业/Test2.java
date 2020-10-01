package ��������ҵ;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test2
{
	
	public Test2(){
		// TODO Auto-generated constructor stub
	}
 
	public static void main(String[] args)	{
		// TODO Auto-generated method stub
		new Test2().print();
	}
 
 //��ӡ����  �����Ե�ǰ����������Ĵ�ӡ �Լ����������Ĵ�ӡ

	public void print(){//��ѯ�����·�����
  
		scanner = new Scanner(System.in);
  
		System.out.println("1.����������Ҫ��ѯ���·�:");
		int month = scanner.nextInt();
  
		while(month <= 0 || month >12){
			System.out.println("1.���������������������Ҫ��ѯ���·�:");
			month = scanner.nextInt();
		}
    
		int days = days(month);
  
		String[] weeks = {"sun","mon","tue","wed","thr","Frd","sat"};
  
		for (int i = 0; i < weeks.length; i++){
			System.out.print(weeks[i]);
   
			for (int j = 0; j < 2; j++)  {
				System.out.print(" ");
			}
		}
	System.out.println();
  
	int weekOfday = getWeekOfday(month,1); //��õ�һ�������
  
	for (int i = 0; i < (weekOfday - 1) * 5; i++){
		System.out.print(" ");
	}

	for (int i = 1; i <= days; i++,weekOfday +=1) {
		if(weekOfday == 8){
			weekOfday = 1;
			System.out.println();
			System.out.print(i);
		}
		
		else   {    
			System.out.print(i);
		}
   
		for (int j = 0; j <  5 - (String.valueOf(i).length()); j++){
			System.out.print(" ");
		}
	}
  
	System.out.println("\n");
  
	System.out.println("2.����������Ҫ��ѯ������(����:20030204):");
	String date = scanner.next();
  
	while(date.length() < 8) {
		System.out.println("2.���������������������Ҫ��ѯ������(����:20030204):");
		date = scanner.next();
	}
  
	System.out.println("����������ڹ�������:" + (getWeekDayStr(getWeekOfday(date)))+"\n");
  
	System.out.println("3.����������Ҫ�Ƚϵ�����֮һ(����:20030204):");
	String date1 = scanner.next();
  
	while(date.length() < 8) {
		System.out.println("3.���������������������Ҫ�Ƚϵ�����֮һ(����:20030204):");
		date1 = scanner.next();
	}
  
	System.out.println("3.����������Ҫ�Ƚϵ���һ����(����:20030204):");
	String date2 = scanner.next();
  
	while(date.length() < 8){
		System.out.println("3.���������������������Ҫ�Ƚϵ���һ����(����:20030204):");
		date2 = scanner.next();
	}
  
	int xiangchadays = daysxiangcha(date1, date2);
  
	System.out.println("�������Ϊ:" + xiangchadays);
}
 
// ͨ��׼ȷ�������ղ�ѯ���ڼ���������ʾ
 
public int getWeekOfday(int year,int month, int day){
	 Calendar c = Calendar.getInstance();
  
	 c.set(Calendar.YEAR, year);
  
	 c.set(Calendar.MONTH, month - 1);
  
	 c.set(Calendar.DAY_OF_MONTH, day);
	 
	 return c.get(Calendar.DAY_OF_WEEK);
 }
 
  // function: ͨ���������� ��ѯ���ڼ���������ʾ Ĭ���ǵ�ǰ�ꡢ

public int getWeekOfday(int month, int day){
	 Calendar c = Calendar.getInstance();
  
	 c.setTime(new Date());
  
	 int year = c.get(Calendar.YEAR);
  
	 return getWeekOfday(year, month, day);
 }
 
 
//ͨ�������ַ���������ڼ���������ʾ

public int getWeekOfday(String dateStr){
  
	 int year =Integer.parseInt(dateStr.substring(0, 4)) ;
	 int month =Integer.parseInt(dateStr.substring(4, 6)) ;
	 int day =Integer.parseInt(dateStr.substring(6, 8)) ;
  
	 return getWeekOfday(year, month, day);
}
 
// �������ڼ������ı�ʾ

public String getWeekDayStr(int weekday){
	return weekDayStrs[weekday - Calendar.SUNDAY];
}
 
String[] weekDayStrs = {"������","����һ","���ڶ�","������","������","������","������"};
private Scanner scanner;
  //�������ڵ��������  

public int daysxiangcha(String dateStr1,String dateStr2){
	int year1 =Integer.parseInt(dateStr1.substring(0, 4)) ;
	int month1 =Integer.parseInt(dateStr1.substring(4, 6)) ;
	int day1 =Integer.parseInt(dateStr1.substring(6, 8)) ;
  
	int year2 =Integer.parseInt(dateStr2.substring(0, 4)) ;
	int month2 =Integer.parseInt(dateStr2.substring(4, 6)) ;
	int day2 =Integer.parseInt(dateStr2.substring(6, 8)) ;
  
	Calendar c1 = Calendar.getInstance();
  
	c1.set(Calendar.YEAR, year1);
  
	c1.set(Calendar.MONTH, month1 -1);
  
	c1.set(Calendar.DAY_OF_MONTH, day1);
  
	Calendar c2 = Calendar.getInstance();
  
	c2.set(Calendar.YEAR, year2);
  
	c2.set(Calendar.MONTH, month2 - 1);
  
	c2.set(Calendar.DAY_OF_MONTH, day2);
 
	long mills = c1.getTimeInMillis() > c2.getTimeInMillis()?
	c1.getTimeInMillis() - c2.getTimeInMillis():
    c2.getTimeInMillis() - c1.getTimeInMillis();
    
	return (int)(mills/1000/3600/24);
}
 
  // ĳ��ĳ�µ�����
public static int days(int year,int month) {
	int days = 0;
    if(month!=2) {
    	switch(month){
    		case 1:
    		case 3:
    		case 5:
    		case 7:
    		case 8:
    		case 10:
    		case 12:days = 31 ;break;
    		case 4:
    		case 6:
    		case 9:
    		case 11:days = 30;
    	}
    }
    else{
    	if(year%4==0 && year%100!=0 || year%400==0)
    		days = 29;
    	else  days = 28;
    }
    return days;
}
  
public static int days(int month){//��ѯĳ�µ����� Ĭ���ǵ�ǰ���
   Calendar c = Calendar.getInstance();
   
   c.setTime(new Date());
   
   int year = c.get(Calendar.YEAR);
   
   return days(year, month);
   }

}