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
	public void fun1(){//����add
		//	��һ�� ����hibernate���������ļ�
//		Configuration cfg = new Configuration();
//		cfg.configure();
//		//�ڶ��� ����SessionFactory����
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		//������ ʹ��SessionFactory����session����
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		//���Ĳ� ��������
		Transaction tx = session.beginTransaction();
		//���岽 д�����߼� crud����
		User user = new User();
		user.setUsername("С��");
		user.setPassword("123");
		user.setAddress("ʮ��");
		
		session.save(user);
		//������ �ύ����
		tx.commit();
		//���߲� �ر���Դ
		session.clear();
		sessionFactory.close();
	}
	
	@Test
	public void testGet(){
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//��ѯ����
		User user1 = session.get(User.class, 3);
		System.out.println(user1.toString());
		tx.commit();
		session.close();
		sessionFactory.close();
	}
}
