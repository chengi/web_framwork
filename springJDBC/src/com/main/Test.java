package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.dbDao.StudentDao;

public class Test {

	public static void main(String[] args) {
		
		String config = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Student stu = new Student();
		stu.setSno(18);
		stu.setAge(15);
		stu.setSclass("一年一班");
		stu.setSname("你好");
		StudentDao sd = ac.getBean("studentDao", StudentDao.class);
		//sd.insert(stu);
		//sd.delete(666);
		//sd.edit(stu);
		List<Student> lists = sd.queryAll();
		for(Student s:lists)
			System.out.println(s.toString());
		
		System.out.println(sd.queryById(17));
	}

}
