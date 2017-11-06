package cn.huat.entity;

import java.util.HashSet;
import java.util.Set;

public class Clazz {

	private int cid;
	private String cname;
	
	private Set<Student> stuList =  new HashSet<Student>();
	
	public Set<Student> getStuList() {
		return stuList;
	}
	public void setStuList(Set<Student> stuList) {
		this.stuList = stuList;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
