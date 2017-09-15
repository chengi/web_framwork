package cn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.service.Service1;


public class JunitTest {
	
	@Test
	public void test1(){
		String config = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ac.getBean("service1",Service1.class).say();
	}
}
