package cn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bean.User;
import cn.service.impl.LoginService;

@Controller
public class MyController {

	@Resource
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/isUser")
	public String isLogin(User user,ModelMap model){
		
		if(loginService.isExist(user)){
			model.put("mesg", user);
			return "sucessLogin";//登录成功界面
		}else
			model.put("mesg", "用户名或密码错误！");
			return "login";
		
	}
}
