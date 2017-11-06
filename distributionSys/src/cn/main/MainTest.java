package cn.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bean.Grade;
import cn.bean.User;
import cn.dao.GradeDao;
import cn.dao.IUserDao;

public class MainTest {

	public static void main(String[] args) {
		
		String config = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		IUserDao iud = ac.getBean("IUserDao",IUserDao.class);//???
		User u = iud.findByName("cc");
		System.out.println(u.toString());
		GradeDao gd = ac.getBean("gradeDao",GradeDao.class);
		List<Grade> list = gd.findAll();
		for(Grade g:list)
			System.out.println(g.getGrade_id()+":"+g.getGrade_name());
	}

}
