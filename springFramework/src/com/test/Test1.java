package com.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Dog;
import com.bean.Example;
import com.bean.Person;

public class Test1 {

	public static void main(String[] args) {
		
//		Date date = new Date();
//		System.out.println(date);
		String config = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Date date = ac.getBean("date", Date.class);
		Example e1 = ac.getBean("e1", Example.class);
		Example e2 = ac.getBean("e1", Example.class);
		System.out.println(date);
		e1.execute();
		System.out.println(e1==e2);
		Person p = ac.getBean("p1", Person.class);
		System.out.println(p.getName()+" "+p.getAge());
		p.show();
//		Dog dog = ac.getBean("dog", Dog.class);
//		dog.show(); ??///构造器注入不行？？？
//		<bean id="dog" class="com.bean.Dog">
//		<constructor-arg index="0" value="泰迪">
//		</constructor-arg>
//		<constructor-arg index="1" value="黑色">
//		</constructor-arg>
//	</bean>
	}

}
