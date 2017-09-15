package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.User;
import com.dao.UserDao;
import com.service.IUserService;

@Service
@Transactional
public class UserService implements IUserService {

	@Resource
	private UserDao userDao;
	@Override
	public boolean isExist(User user) {
		System.out.println("---------------------");
		User u = userDao.findByName(user.getA_name());
		if(u.getPwd().equals(user.getPwd()))
			return true;
		else
			return false;
	}

}
