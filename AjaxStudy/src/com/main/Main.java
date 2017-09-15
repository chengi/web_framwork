package com.main;

import java.util.ArrayList;
import java.util.List;

import com.bean.City;
import com.google.gson.Gson;

public class Main {

	public static void main(String []args){
		
		List<City> lists = new ArrayList<City>();
		for(int i=0;i<5;i++){
			City c1 = new City();
			c1.setId("11"+i);
			c1.setName("Ê®Ñß"+i);
			lists.add(c1);
		}
//		City c1 = new City();
//		c1.setId("11");
//		c1.setName("Ê®Ñß");
		
		String jos = new Gson().toJson(lists);
		System.out.println(jos+"   **************");
	}
}
