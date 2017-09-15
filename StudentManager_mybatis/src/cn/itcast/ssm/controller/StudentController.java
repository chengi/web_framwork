package cn.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.entity.Classes;
import cn.itcast.ssm.entity.PageInfo;
import cn.itcast.ssm.entity.Students;
import cn.itcast.ssm.entity.StudentsCustom;
import cn.itcast.ssm.service.inter.ClassesServiceInter;
import cn.itcast.ssm.service.inter.StudentServiceInter;

/**
 * 学生（处理器）
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServiceInter studentService;
	@Autowired
	private ClassesServiceInter classesService;

	// 查询指定条件，指定页号的学生
	@RequestMapping("/getAllStudents")
	public String getAllStudents(Model model, Students stu, PageInfo pageInfo) throws Exception {
		List<Classes> classesList = classesService.getAllClasses();
		studentService.getAllStudents(stu, pageInfo);
		model.addAttribute("classesList", classesList);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("stu", stu);
		return "list";
	}

	// 跳转到添加学生界面
	@RequestMapping("/addPre")
	public String addPre(Model model) throws Exception {
		List<Classes> classesList = classesService.getAllClasses();
		model.addAttribute("classesList", classesList);
		return "add";
	}

	// 添加学生
	@RequestMapping("/add")
	public String add(Students stu) throws Exception {
		studentService.addStu(stu);
		return "redirect:getAllStudents.action";
	}

	// 删除学生
	@RequestMapping("/delete")
	public String delete(int sid) throws Exception {
		studentService.deleteStu(sid);
		return "redirect:getAllStudents.action";
	}

	// 删除学生
	@RequestMapping("/updatePre")
	public String updatePre(Model model,int sid) throws Exception {
		Students stu = studentService.getStudentById(sid);
		model.addAttribute("stu", stu);
		List<Classes> classesList = classesService.getAllClasses();
		model.addAttribute("classesList", classesList);
		return "update";
	}

	// 删除学生
	@RequestMapping("/update")
	public String update(Students stu) throws Exception {
		studentService.updateStu(stu);
		return "redirect:getAllStudents.action";
	}

	// 查看学生详情
	@RequestMapping("/detail")
	public String detail(Model model,int sid) throws Exception {
		Students stu = studentService.getStudentById(sid);
		model.addAttribute("stu", stu);
		return "detail";
	}
}
