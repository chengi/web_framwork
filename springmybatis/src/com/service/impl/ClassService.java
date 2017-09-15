package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.StuClass;
import com.dao.StuClassDao;
import com.service.IStuClassService;

@Service
@Transactional
public class ClassService implements IStuClassService {

	@Resource
	private StuClassDao stuClassDao;
	@Override
	public List<StuClass> findAllCls() {
		
		List<StuClass> lists = stuClassDao.findAllCls();
		return lists;
	}

}
