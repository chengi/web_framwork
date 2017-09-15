package com.main;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test1.DbInfo;
import com.test1.Example1;

public class MainTeat {

	public static void main(String[] args) {
		
		String config = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ac.getBean("example1",Example1.class).print();
		
//		PropertyPlaceholderConfigurer ppc = ac.getBean("db",PropertyPlaceholderConfigurer.class);
//		ppc.
		//¶ÁÈ¡propertyÎÄ¼þ
		DbInfo di = ac.getBean("user1", DbInfo.class);
		System.out.println(di.getPassword()+" "+di.getUser());
	}

}
