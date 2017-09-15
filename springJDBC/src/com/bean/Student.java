package com.bean;

public class Student {

//	sno number primary key,
//    sname varchar2(12),
//    age int,
//    sclass varchar2(50)
	private Integer sno;
	private String sname;
	private Integer age;
	private String sclass;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", age=" + age + ", sclass=" + sclass + "]";
	}
	
	
}
