package com.yash.jdbc.entities;

public class Student {

	private int stid;
	private String sname;
	private int age;
	private int rollno;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", sname=" + sname + ", age=" + age + ", rollno=" + rollno + "]";
	}
}
