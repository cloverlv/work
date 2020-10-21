package com.db.stu;

public class Graduate extends Student {
	private String subject;
	private String adviser;
	public Graduate(){
		super();
		subject="专业未定";
		adviser="导师未定";
	}
	public Graduate(int Id,String Name,
			String Sex,String d,
			String sub,String adv){
		super(Id,Name,Sex,d);
		subject=sub;
		adviser=adv;
	}
	public String toString(){
		return super.toString()+"\t专业"+subject+"\t导师:"+adviser;
	}
}
