package cn.itcast.ssm.service.inter;

import cn.itcast.ssm.entity.PageInfo;
import cn.itcast.ssm.entity.Students;

public interface StudentServiceInter {
	public void getAllStudents(Students stu, PageInfo pageInfo) throws Exception;

	public void addStu(Students stu) throws Exception;

	public void deleteStu(int sid) throws Exception;

	public Students getStudentById(int sid) throws Exception;

	public void updateStu(Students stu) throws Exception;

}
