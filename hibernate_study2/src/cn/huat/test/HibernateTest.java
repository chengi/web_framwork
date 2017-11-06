package cn.huat.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;


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
		
		
		tx.commit();
		session.close();
		sessionFactory.close();
	}
}
