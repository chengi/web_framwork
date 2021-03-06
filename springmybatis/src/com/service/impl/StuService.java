package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Page;
import com.bean.StuAndPage;
import com.bean.Student;
import com.dao.StuDao;
import com.service.IStuService;

@Service
@Transactional
public class StuService implements IStuService {
	
	@Resource
	private StuDao stuDao;
	
	@Override
	public List<Student> findAll(Page page,Student stu) {
//		if(page.getPageEnd()==null && page.getPageStart()==null){
//			//page = new Page();
//			page.setPageStart(1);
//			page.setNowPageNum(1);
//			//page.setOnePageSum(3);
//			page.setPageEnd(4);
//		}
		
			if(stu.getSname()=="")
				stu.setSname(null);
			System.out.println(stu.toString()+"stu-service");

			//页码不能越界
			//System.out.println(page.getNowPageNum()+"-------------------------");
			page.setRowNum(stuDao.getRowSum(stu));//总共有多少条数据
			//多少页
			page.setPageNum((page.getRowNum()+page.getOnePageSum()-1)/page.getOnePageSum());
			System.out.println("页码"+page.getNowPageNum()+"共有多少条"+page.getRowNum()+"共有多少页"+page.getPageNum());
			//判断页码是否满足范围
			if(page.getNowPageNum()<1)
				page.setNowPageNum(1);
			if(page.getNowPageNum()>page.getPageNum())
				page.setNowPageNum(page.getPageNum());
			page.setPageStart((page.getNowPageNum()-1)*page.getOnePageSum());
			page.setPageEnd(page.getNowPageNum()*page.getOnePageSum());
			
			//总共有多少页
			//注入page和学生对象控制器传学生和页码
		StuAndPage sap = new StuAndPage();
		sap.setPage(page);
		sap.setStu(stu);
		System.out.println(page.toString()+"page-service");
		List<Student> lists = stuDao.findAll(sap);
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
