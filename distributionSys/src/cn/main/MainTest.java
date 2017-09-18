package cn.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bean.User;
import cn.dao.IUserDao;

public class MainTest {

	public static void main(String[] args) {
		
		String config = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		IUserDao iud = ac.getBean("IUserDao",IUserDao.class);//???
		User u = iud.findByName("cc");
		System.out.println(u.toString());
	}

}