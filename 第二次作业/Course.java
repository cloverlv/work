package �ڶ�����ҵ;

public class Course{
	 public String classname;// �γ���
	 public int num;// ���
	 public String firstclass;// ���޿γ���
	 public int fnum;// ���޿γ̱��

	 public Course(String classname,int num,String firstclass,int fnum){
		 this.classname = classname;
		 this.num = num;
		 this.firstclass = firstclass;
		 this.fnum = fnum;
	 }
	 
	 public String getclassname() {
		 return classname;
	 }

	 public int getnum() {
		 return num;
	 }

	 public String getfirstclass() {
		 return firstclass;
	 }

	 public int getfnum() {
		 return fnum;
	 }
}
