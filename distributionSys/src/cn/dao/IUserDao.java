package cn.dao;

import cn.bean.User;

public interface IUserDao {

	public User findByName(String name);
}
