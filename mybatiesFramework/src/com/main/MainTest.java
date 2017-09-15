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
		System.out.println("使用sqlsession");
//		List<Student> list = sqlSession.selectList("findByName","%张三%");
//		for(Student s:list)
//			System.out.println(s.toString());
//		Student s = sqlSession.selectOne("findByName", "张三2");
//		System.out.println(s.toString());
		Student stu = new Student();
		stu.setAge(22);
		stu.setSclass("二年一班");
		stu.setSname("哈哈");
		sqlSession.insert("insert", stu);
		sqlSession.delete("delete", 26);
		sqlSession.commit();//增删改操作需要提交
		//StuMapper.xml配置的操作数据库的方法只是对数据库操作，dao层，daoimpl包下实现一些方法该方法的分装为如下
//		Student stu = new Student();
//		stu.setAge(22);
//		stu.setSclass("二年一班");
//		stu.setSname("哈哈");
//		sqlSession.insert("insert", stu);
//		sqlSession.delete("delete", 26);
//		sqlSession.commit();
		//按照规则书写。可自动生成实现方法
		sqlSession.close();
	}

}
