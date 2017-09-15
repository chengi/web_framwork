package com.bean;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Person {
	
	private String name;
	private int age;
	private List<String> friends;
	private Map<String,String> map;
	private Properties db;
	
	
	public void setDb(Properties db) {
		this.db = db;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show(){
		System.out.println("list集合加字符串注入");
		for(String s:friends)
			System.out.println(s);
		
		System.out.println("map结合遍历");
		Set<Entry<String,String>> set = map.entrySet();
		for(Entry<String,String> i:set)
			System.out.println(i.getKey()+":"+i.getValue());
		
		System.out.println("properties 注入");
		Set<Object> keys = db.keySet();
		for(Object i:keys){
			System.out.println(i.toString()+":"+db.getProperty(i.toString()));
			
		}
	}
}
