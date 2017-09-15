package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ToWelcome implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		String name = arg0.getParameter("user");
		String pwd = arg0.getParameter("password");
		if(name.equals("czc")&&(pwd.equals("123"))){
			mav.setViewName("welcome");
			mav.getModel().put("user", name);
		}else{
			mav.setViewName("log");
		}
		return mav;
	}

}
