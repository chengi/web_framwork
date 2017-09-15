package com.test1;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Example1 {

	
	private Phone p1;
	private Computer c;
	
	@Resource
	public void setP1(Phone p1) {
		this.p1 = p1;
	}

	@Resource
	public void setC(Computer c) {
		this.c = c;
		
		
	}


	public void print(){
		System.err.println("我正在执行！");
		p1.print();
		c.print();
	}
}
