package com.test1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("user1")
public class DbInfo {

//	@Value("#{user}") ɨ��������
	private String user;
	
//	@Value("#{password}")
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
