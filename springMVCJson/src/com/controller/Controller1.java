package com.controller;


import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.City;

@Controller
public class Controller1 {

	@RequestMapping("/json.do")
	@ResponseBody
	public List<City> execute(){
		List<City> lists = new ArrayList<City>();
		for(int i=0;i<5;i++){
			City c1 = new City();
			c1.setId("11"+i);
			c1.setName("Ê®Ñß"+i);
			lists.add(c1);
		}
		
		return lists;
			
	}
}
