package cn.huat.hbmutils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class HibernateUtils {

	static Configuration cfg = null;
	static SessionFactory sessionFactory = null;
	static{
		cfg = new Configuration();
		cfg.configure();
		//第二步 创建SessionFactory对象
		sessionFactory = cfg.buildSessionFactory();
	}
	
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	public static void main(String []args){
		System.out.println("执行了该操作！！！");
	}
}
