package cn.service;

import cn.dao.Dao1;

public class Service1 {

	private Dao1 dao1;
	public void setDao1(Dao1 dao1) {
		this.dao1 = dao1;
	}

	public void say(){
		dao1.say("hello");
	}
	
}
