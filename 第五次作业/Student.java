package 第五次作业;

public class Student extends People {

	private String stuNo;
	private String department;
	public Student(String name,int age,String sex,String sn,String stuno,String department)
	{
	    super(name,age,sex,sn);    //调用父类中含有4个参数的构造方法
	    this.stuNo=stuno;
	    this.department=department;
	}
	public Student(String name,String sn,String stuNo)
	{
	    super(name,sn);    //调用父类中含有两个参数的构造方法
	    this.stuNo=stuNo;
	}

}
