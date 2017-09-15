package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.entity.Students;
import cn.itcast.ssm.entity.StudentsCustom;

public interface StudentMapper {
	public List<Students> getAllStudents(StudentsCustom custom) throws Exception;

	public int getCount(StudentsCustom custom) throws Exception;

	public void addStu(Students stu) throws Exception;

	public void deleteStu(int sid) throws Exception;

	public Students getStudentById(int sid) throws Exception;

	public void updateStu(Students stu) throws Exception;
}
