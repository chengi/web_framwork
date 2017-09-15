package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.entity.Classes;
import cn.itcast.ssm.mapper.ClassesMapper;
import cn.itcast.ssm.service.inter.ClassesServiceInter;

@Service
public class ClassesServiceImpl implements ClassesServiceInter {
	@Autowired
	private ClassesMapper classesMapper;
	
	@Override
	public List<Classes> getAllClasses() throws Exception {
		return classesMapper.getAllClasses();
	}

}
