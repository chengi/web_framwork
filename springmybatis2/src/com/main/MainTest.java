package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.StuClass;
import com.bean.Student;
import com.dao.StuClassDao;
import com.dao.StuDao;

public class MainTest {

	public static void main(String[] args) {
		String config = "applicationContext.xml";
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(config);
		StuDao sd = ac.getBean("stuDao", StuDao.class);
//		List<Student> list = sd.findAll();
//		for(Student s:list)
//			System.out.println(s.toString());
//		
//		Student s = sd.findBySno(34);
//		System.out.println(s.getSname()+"  1111"+s.getStuClass().getScname());
//		s.setSname("哈哈");
//		sd.updateStu(s);
		//sd.deleteBySno(22);
//		StuClass sc = new StuClass();
//		sc.setScno("s12");
//		Student s = new Student();
//		s.setAge(22);
//		s.setStuClass(sc);
//		s.setSname("李四");
//		sd.insertStu(s);
		
		StuClassDao scd = ac.getBean("stuClassDao",StuClassDao.class ); 
				List<StuClass> lists = scd.findAllCls();
				for(StuClass sc:lists)
					System.out.println(sc.getScname()+" "+sc.getScno());
			
		System.out.println(sd.getRowSum()+"总共有多少条");
	}

}
