package com.dao;

import java.util.List;

import com.bean.StuAndPage;
import com.bean.Student;

public interface StuDao {

	public List<Student> findAll(StuAndPage sap);
	public Student findBySno(int sno);
	public void deleteBySno(int sno);
	public void insertStu(Student stu);
	public void updateStu(Student stu);
	public int getRowSum(Student stu);
}
