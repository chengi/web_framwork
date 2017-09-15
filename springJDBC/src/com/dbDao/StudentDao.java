package com.dbDao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.StuRowMapper;
import com.bean.Student;

@Repository
public class StudentDao {

	@Resource
	private JdbcTemplate jt;
	
	public void insert(Student stu){
		String sql = "insert into stu(sno,sname,age,sclass) "
				+ "values(seq_stu.nextval,?,?,?)";
		Object parms[] = {stu.getSname(),stu.getAge(),stu.getSclass()};
		
		jt.update(sql, parms);	
	}
	
	public void delete(int id){
		String sql = "delete from stu where sno=?";
		Object parms[] = {id};
		jt.update(sql, parms);
	}
	
	public void edit(Student stu){
		String sql = "update stu set sname=?,age=? where sno=?";
		Object[] parms = {stu.getSname(),stu.getAge(),stu.getSno()};
		jt.update(sql,parms);
	}
	
	public List<Student> queryAll(){
		
		String sql = "select * from stu";
		List<Student> lists = jt.query(sql, new StuRowMapper());
		return lists;
	}
	
	public Student queryById(int id){
		String sql = "select * from stu where sno=?";
		Object[] parms = {id};
		Student s = jt.queryForObject(sql, parms,new StuRowMapper());
		return s;
		
		
	}
}
