package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Page;
import com.bean.Student;
import com.dao.StuDao;
import com.service.IStuService;

@Service
@Transactional
public class StuService implements IStuService {
	
	@Resource
	private StuDao stuDao;
	
	@Override
	public List<Student> findAll(Page page) {
//		if(page.getPageEnd()==null && page.getPageStart()==null){
//			//page = new Page();
//			page.setPageStart(1);
//			page.setNowPageNum(1);
//			//page.setOnePageSum(3);
//			page.setPageEnd(4);
//		}
			//页码不能越界
			//System.out.println(page.getNowPageNum()+"-------------------------");
			page.setRowNum(stuDao.getRowSum());//总共有多少条数据
			//多少页
			page.setPageNum((page.getRowNum()+page.getOnePageSum()-1)/page.getOnePageSum());	
			//判断页码是否满足范围
			if(page.getNowPageNum()<1)
				page.setNowPageNum(1);
			if(page.getNowPageNum()>page.getPageNum())
				page.setNowPageNum(page.getPageNum());
			page.setPageStart((page.getNowPageNum()-1)*page.getOnePageSum());
			page.setPageEnd(page.getNowPageNum()*page.getOnePageSum());
			
			//总共有多少页
			//注入page和学生对象控制器传学生和页码
			
		List<Student> lists = stuDao.findAll(page);
		return lists;
	}

	@Override
	public Student findBySno(int sno) {

		return stuDao.findBySno(sno);
	}

	@Override
	public void deleteBySno(int sno) {
	
		stuDao.deleteBySno(sno);
		
	}

	@Override
	public void insertStu(Student stu) {
		
		stuDao.insertStu(stu);
		
	}

	@Override
	public void updateStu(Student stu) {
		
		stuDao.updateStu(stu);
		
	}

	
}
