package cn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bean.User;
import cn.service.impl.LoginService;

@Controller
public class MyController {

	@Resource
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String login(){
		
		/*if(loginService.isExist(user)){
			return "sucessLogin";//登录成功界面
		}else
			return "login";//返回重新登录界面
		*/
		return "login";
	}
	
	@RequestMapping("/isUser")
	public String isLogin(User user){
		
		if(loginService.isExist(user)){
			return "sucessLogin";//登录成功界面
		}else
			return "login";
		
	}
}
