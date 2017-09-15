package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;

@Controller
public class SelfController {

	@RequestMapping("/hello.do")
	public ModelAndView toHello(){
		
		ModelAndView mav = new ModelAndView();
		mav.getModel().put("msg", "注解版");
		mav.setViewName("hello");
		return mav;
	}
	
	@RequestMapping("/log.do")
	public String toLogin(){
		
		return "log";
	}
	
	@RequestMapping("/welcome.do")
	public String toWelcome(HttpServletRequest request ){
		request.setAttribute("msg", "123");
		return "welcome";
	}
	
	@RequestMapping("/test.do")
	public String test(String user,String password){
		
		System.out.println("测试参数接收user"+user+":"+"password"+password);
		
		return "welcome";
	}
	
	@RequestMapping("/test2.do")
	public String test1(User u){
		
		System.out.println(u.toString());
		return "welcome";
	}
	
	@RequestMapping("/test3.do")
	public String test2(User u,ModelMap modelMap){
		
		if(u.getUser().equals("czc")&&
				u.getPassword().equals("123")){
			modelMap.put("user", u.getUser());
		}
		
		return "welcome";
	}
	
}
