package com.db.stu;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Student {
	private int id;
	private String name;
	private String sex;
	private String date;
	public Student(){
		id=0;
		name="������";
		sex="δ֪";
		date="00000000";
	}
	public Student(int ID,String Name,String Sex,String d){
		id=ID;
		name=Name;
		sex=Sex;
		date=d;
	}
	public String toString(){
		return "ѧ��:"+id+"����:"+name+"�Ա�"+sex+"����"+date;
	}
	public static void main(String[] args) {
		System.out.println("HELLO WORLD!!!");
		Student stu=new Graduate();
		Student stu1=new Student();
		Set<Student> setStu=new HashSet<Student>();
		stu1.setId(123);
		setStu.add(stu);
		setStu.add(stu1);
		Vector<Student> vecStu=new Vector();
		vecStu.add(stu);
		vecStu.add(stu1);
		System.out.println("Set Size:"+setStu.size());
		System.out.println("Vec Size:"+vecStu.size());
		System.out.println("������������ÿ��Ҫ��̭�ļ������:");
		int n=10,m=3;
		for(int i=0;i<n;i++){
			Student stu2=new Student(i,"��"+i,i%2==0?"��":"Ů","20201015");
			vecStu.add(stu2);
		}
		int pos=0;
		for(int i=0;i<n-1;i++){
			pos=(pos+m-1)%vecStu.size();
			//ɾ��ָ��Ԫ�أ����Ѻ���һ��Ԫ����ǰ�ƶ�
			vecStu.removeElementAt(pos);
		}
		System.out.println("��ʤ��Ϊ:"+vecStu.get(0));
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public String getDate() {
		return date;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
}
