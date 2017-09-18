package cn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.bean.User;
import cn.dao.IUserDao;
import cn.service.ILoginService;

@Service
public class LoginService implements ILoginService {

	@Resource
	private IUserDao iUserDao;
	@Override
	public boolean isExist(User user) {
		
		User u = iUserDao.findByName(user.getUsername());
		if(u.getPwd().equals(user.getPwd())){
			
			return true;
		}else
			
			return false;
	}

}
