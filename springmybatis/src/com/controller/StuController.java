package com.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Page;
import com.bean.StuClass;
import com.bean.Student;
import com.bean.User;
import com.service.impl.ClassService;
import com.service.impl.StuService;
import com.service.impl.UserService;

@Controller
public class StuController {

	@Resource
	private StuService stuservice;
	@Resource
	private ClassService classService;
	@Resource
	private UserService userService;
//	public void setStuDao(StuDao stuDao) {
//		this.stuDao = stuDao;
//	}
	@RequestMapping("/showAll.do")
	public String showAll(Page page,Student stu,HttpServletRequest req,ModelMap model){
		System.out.println(page.getNowPageNum()+"-----llllllllll"+page.toString()+stu.getStuClass());
		List<Student> lists = stuservice.findAll(page,stu);
		List<StuClass> classes = classService.findAllCls();
		
		req.setAttribute("StuList", lists);
		model.put("page", page);
		model.put("stu", stu);
		model.put("classes", classes);
		return "ShowAll";
	}
	@RequestMapping("/showAll1.do")
	public String showAll1(Page page,Student stu,ModelMap model){
		
		List<Student> lists = stuservice.findAll(page,stu);
		
		model.put("StuList", lists);
		model.put("page", page);
		return "ShowAll";
	}
	
	@RequestMapping("/login/showBySno.do")
	public String showBySno(@RequestParam("sno")int sno,ModelMap model){
		
		Student stu = stuservice.findBySno(sno);
		model.put("stu", stu);
		
		return "ShowBySno";
	}
	
	@RequestMapping("/login/deleteBySno.do")
	public String deleteBySno(@RequestParam("sno")int sno,ModelMap model){
		
		stuservice.deleteBySno(sno);
		//删除，查询
//		List<Student> lists = stuservice.findAll();
//		model.put("StuList", lists);
		return "redirect:/showAll.do";
	}
	
	@RequestMapping("/login/addStu.do")
	public String addStu(Student stu) {
		//String sname = new String(stu.getSname().getBytes("ISO-8859-1"),"utf-8");
//		stu.setSname(sname);
		stuservice.insertStu(stu);
		
		return "redirect:/showAll.do";
	}
	
	@RequestMapping("login/preAddStu.do")
	public String preAddStu(ModelMap model){
		
		List<StuClass> classes = classService.findAllCls();
		model.put("classes", classes);
		return "AddStu";
	}
	
	@RequestMapping("/login/preUpdateStu.do")
	public String preUpdateStu(int sno,ModelMap model){
		//查询出结果返回回来
		Student stu = stuservice.findBySno(sno);
		model.put("stu", stu);
		return "UpdateStu";
	}
	
	@RequestMapping("/login/updateStu.do")
	public String updateStu(Student stu){
//		try {
//			req.setCharacterEncoding("utf-8");
//		} catch (UnsupportedEncodingException e) {
//			
//			e.printStackTrace();
//		}
//		int sno = Integer.parseInt(req.getParameter("sno"));
//		String sname = req.getParameter("sname");
//		int age = Integer.parseInt(req.getParameter("age"));
//		System.out.println(sname+" -----------------");
//		Student stu = new Student();
//		stu.setAge(age);
//		stu.setSno(sno);
//		stu.setSname(sname);
//		try {
//			String sname = new String(stu.getSname().getBytes("ISO-8859-1"),"utf-8");
//			stu.setSname(sname);
//		} catch (UnsupportedEncodingException e) {
//			
//			e.printStackTrace();
//		}
		stuservice.updateStu(stu);
		return "redirect:showAll.do";
	}
	@RequestMapping("/validateUser.do")
	public void validateUser(HttpServletRequest req,HttpServletResponse resp,User user) throws Exception, IOException {
		System.out.println(user.getA_name()+"*****"+user.getPwd());
		if(userService.isExist(user)) {
			req.getSession().setAttribute("user", user);
			req.getRequestDispatcher("/showAll.do").forward(req, resp);
		} else {
			req.setAttribute("error", "用户名或密码错误");
			req.getRequestDispatcher("login.do").forward(req, resp);
		}
	}
	@RequestMapping("/login.do")
	public String login(){
		return "Login";
	}
	
}
