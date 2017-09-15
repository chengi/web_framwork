package com.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.main.MainTest;

public class MybatiesUtil {

	public static SqlSession getMySqlSession(){
		
		SqlSessionFactoryBuilder builder = 
				new SqlSessionFactoryBuilder();
		String config = "SqlMapConfig.xml";
		InputStream input = 
				MybatiesUtil.class.getClassLoader().getResourceAsStream(config);
		SqlSessionFactory factory = builder.build(input);
		SqlSession sqlSession = factory.openSession();
		
		return sqlSession;
	}
}
