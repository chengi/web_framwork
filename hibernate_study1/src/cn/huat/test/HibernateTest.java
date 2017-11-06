package cn.huat.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.huat.entity.User;
import cn.huat.hbmutils.HibernateUtils;
//
public class HibernateTest {

	@Test
	public void fun1(){//测试add
		//	第一步 加载hibernate核心配置文件
//		Configuration cfg = new Configuration();
//		cfg.configure();
//		//第二步 创建SessionFactory对象
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		//第三步 使用SessionFactory创建session对象
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		//第四步 开启事务
		Transaction tx = session.beginTransaction();
		//第五步 写具体逻辑 crud操作
		User user = new User();
		user.setUsername("小明");
		user.setPassword("123");
		user.setAddress("十堰");
		
		session.save(user);
		//第六步 提交事务
		tx.commit();
		//第七步 关闭资源
		session.clear();
		sessionFactory.close();
	}
	
	@Test
	public void testGet(){
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//查询代码
		User user1 = session.get(User.class, 3);
		System.out.println(user1.toString());
		tx.commit();
		session.close();
		sessionFactory.close();
	}
}
