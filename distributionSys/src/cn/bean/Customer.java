package cn.bean;

public class Customer {
/*
 * customer_id int primary key,
name varchar2(50) not null,
phone varchar2(15),
invatenum int,
 */
	private int customer_id;
	private String name;
	private String phone;
	private int invatenum;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getInvatenum() {
		return invatenum;
	}
	public void setInvatenum(int invatenum) {
		this.invatenum = invatenum;
	}
	
	
}
