package com.db.stu;

public class Graduate extends Student {
	private String subject;
	private String adviser;
	public Graduate(){
		super();
		subject="רҵδ��";
		adviser="��ʦδ��";
	}
	public Graduate(int Id,String Name,
			String Sex,String d,
			String sub,String adv){
		super(Id,Name,Sex,d);
		subject=sub;
		adviser=adv;
	}
	public String toString(){
		return super.toString()+"\tרҵ"+subject+"\t��ʦ:"+adviser;
	}
}
