package cn.huat;

import com.opensymphony.xwork2.ActionSupport;

public class Demo1 extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	public String add(){
		System.out.println("µ˜”√¡Àadd");
		return SUCCESS;
	}
	
}
