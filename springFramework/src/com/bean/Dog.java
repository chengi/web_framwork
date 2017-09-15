package com.bean;

public class Dog {

	private String name;
	private String color;
	
	public Dog(String name,String color){
		this.name = name;
		this.color = color;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show(){
		
		System.out.println(this.name+" "+this.color);
	}
}
