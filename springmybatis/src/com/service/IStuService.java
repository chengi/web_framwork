package com.service;

import java.util.List;

import com.bean.Page;
import com.bean.Student;

public interface IStuService {

	public List<Student> findAll(Page page,Student stu);
	public Student findBySno(int sno);
	public void deleteBySno(int sno);
	public void insertStu(Student stu);
	public void updateStu(Student stu);
}
