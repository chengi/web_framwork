package cn.itcast.ssm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.itcast.ssm.entity.PageInfo;
import cn.itcast.ssm.entity.Students;
import cn.itcast.ssm.entity.StudentsCustom;
import cn.itcast.ssm.mapper.StudentMapper;
import cn.itcast.ssm.service.inter.StudentServiceInter;

@Service
public class StudentServiceImpl implements StudentServiceInter {
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public void getAllStudents(Students stu, PageInfo pageInfo) throws Exception {
		if (pageInfo == null) {
			pageInfo = new PageInfo();
		}
		StudentsCustom custom = new StudentsCustom();
		custom.setStu(stu);
		custom.setPageInfo(pageInfo);
		List<Students> studentsList = studentMapper.getAllStudents(custom);
		pageInfo.setStudentsList(studentsList);
		int totalRecord = studentMapper.getCount(custom);
		pageInfo.setTotalRecord(totalRecord);
	}

	@Override
	public void addStu(Students stu) throws Exception {
		studentMapper.addStu(stu);
	}

	@Override
	public void deleteStu(int sid) throws Exception {
		studentMapper.deleteStu(sid);
	}

	@Override
	public Students getStudentById(int sid) throws Exception {
		return studentMapper.getStudentById(sid);
	}

	@Override
	public void updateStu(Students stu) throws Exception {
		studentMapper.updateStu(stu);
	}

}
