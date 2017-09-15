package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Page;
import com.bean.StuClass;
import com.bean.Student;
import com.service.impl.ClassService;
import com.service.impl.StuService;

@Controller
public class StuController {

	@Resource
	private StuService stuservice;
	@Resource
	private ClassService classService;
//	public void setStuDao(StuDao stuDao) {
//		this.stuDao = stuDao;
//	}
	@RequestMapping("/showAll.do")
	public String showAll(Page page,HttpServletRequest req,ModelMap model){
		System.out.println(page.getNowPageNum()+"-----llllllllll");
		List<Student> lists = stuservice.findAll(page);
		req.setAttribute("StuList", lists);
		model.put("page", page);
		return "ShowAll";
	}
	@RequestMapping("/showAll1.do")
	public String showAll1(Page page,ModelMap model){
		
		List<Student> lists = stuservice.findAll(page);
		
		model.put("StuList", lists);
		model.put("page", page);
		return "ShowAll";
	}
	
	@RequestMapping("/showBySno.do")
	public String showBySno(@RequestParam("sno")int sno,ModelMap model){
		
		Student stu = stuservice.findBySno(sno);
		model.put("stu", stu);
		
		return "ShowBySno";
	}
	
	@RequestMapping("/deleteBySno.do")
	public String deleteBySno(@RequestParam("sno")int sno,ModelMap model){
		
		stuservice.deleteBySno(sno);
		//删除，查询
//		List<Student> lists = stuservice.findAll();
//		model.put("StuList", lists);
		return "redirect:showAll.do";
	}
	
	@RequestMapping("/addStu.do")
	public String addStu(Student stu) {
		//String sname = new String(stu.getSname().getBytes("ISO-8859-1"),"utf-8");
//		stu.setSname(sname);
		stuservice.insertStu(stu);
		
		return "redirect:showAll.do";
	}
	
	@RequestMapping("preAddStu.do")
	public String preAddStu(ModelMap model){
		
		List<StuClass> classes = classService.findAllCls();
		model.put("classes", classes);
		return "AddStu";
	}
	
	@RequestMapping("/preUpdateStu.do")
	public String preUpdateStu(int sno,ModelMap model){
		//查询出结果返回回来
		Student stu = stuservice.findBySno(sno);
		model.put("stu", stu);
		return "UpdateStu";
	}
	
	@RequestMapping("/updateStu.do")
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
	
}
