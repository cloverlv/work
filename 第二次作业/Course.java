package 第二次作业;

public class Course{
	 public String classname;// 课程名
	 public int num;// 编号
	 public String firstclass;// 先修课程名
	 public int fnum;// 先修课程编号

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
