package com.main;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bean.Student;
import com.util.MybatiesUtil;

public class MainTest {

	public static void main(String[] args) {
		
		SqlSession sqlSession = MybatiesUtil.getMySqlSession();
		System.out.println("ʹ��sqlsession");
//		List<Student> list = sqlSession.selectList("findByName","%����%");
//		for(Student s:list)
//			System.out.println(s.toString());
//		Student s = sqlSession.selectOne("findByName", "����2");
//		System.out.println(s.toString());
		Student stu = new Student();
		stu.setAge(22);
		stu.setSclass("����һ��");
		stu.setSname("����");
		sqlSession.insert("insert", stu);
		sqlSession.delete("delete", 26);
		sqlSession.commit();//��ɾ�Ĳ�����Ҫ�ύ
		//StuMapper.xml���õĲ������ݿ�ķ���ֻ�Ƕ����ݿ������dao�㣬daoimpl����ʵ��һЩ�����÷����ķ�װΪ����
//		Student stu = new Student();
//		stu.setAge(22);
//		stu.setSclass("����һ��");
//		stu.setSname("����");
//		sqlSession.insert("insert", stu);
//		sqlSession.delete("delete", 26);
//		sqlSession.commit();
		//���չ�����д�����Զ�����ʵ�ַ���
		sqlSession.close();
	}

}
