package com.bean;

public class Student {

	private Integer sno;
	private String sname;
	private Integer age;
//	private String sclass;
	private StuClass stuClass;
	
	public StuClass getStuClass() {
		return stuClass;
	}
	public void setStuClass(StuClass stuClass) {
		this.stuClass = stuClass;
	}
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
//	public String getSclass() {
//		return sclass;
//	}
//	public void setSclass(String sclass) {
//		this.sclass = sclass;
//	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", age=" + age +"]";
	}
	
}
