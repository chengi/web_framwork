package com.service;

import java.util.List;

import com.entity.AnnouncementInfo;

/**
 * Service层的接口
 * 方法的命名方式要以insert，delete，等在spring-mybatis.xml配置文件中有规定
 * 
 */
public interface AnnouncementInfoService {
	  
	/**
	 * 新增公告
	 * 
	 * @param ann
	 */

	public void insertAdd(AnnouncementInfo ann);// 新增公告

	/**
	 * 删除指定的公告
	 * 
	 * @param id
	 */

	public void delete(int id);// 删除指定的公告

	/**
	 * 更新指定的公告
	 * 
	 * @param ann
	 */

	public void update(AnnouncementInfo ann);// 更新指定的公告

	/**
	 * 获得指定的公告
	 * 
	 * @param id
	 * @return AnnouncementInfo
	 */

	public AnnouncementInfo searchGet(int id); // 获得指定的公告

	/**
	 * 获得所有公告
	 * 
	 * 
	 * @return List<AnnouncementInfo>
	 */

	public List<AnnouncementInfo> searchGetAll();// 获得所有公告
	}