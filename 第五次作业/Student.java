package �������ҵ;

public class Student extends People {

	private String stuNo;
	private String department;
	public Student(String name,int age,String sex,String sn,String stuno,String department)
	{
	    super(name,age,sex,sn);    //���ø����к���4�������Ĺ��췽��
	    this.stuNo=stuno;
	    this.department=department;
	}
	public Student(String name,String sn,String stuNo)
	{
	    super(name,sn);    //���ø����к������������Ĺ��췽��
	    this.stuNo=stuNo;
	}

}
