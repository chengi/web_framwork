package com;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.Student;

public class StuRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet res, int index) throws SQLException {
		
		Student stu = new Student();
		stu.setSno(res.getInt("sno"));
		stu.setSname(res.getString("sname"));
		stu.setAge(res.getInt("age"));
		stu.setSclass(res.getString("sclass"));
		
		return stu;
	}

}
