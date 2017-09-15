package com.dao;

import java.util.List;

import com.entity.AnnouncementInfo;

/**
 * 
 * Dao层接口
 * 
 * 
 */
public interface AnnouncementInfoDao{

	/**
	 * 新增公告
	 * 
	 * @param ann
	 * 
	 */

	public void add(AnnouncementInfo ann);// 新增公告

	/**
	 * 删除指定的公告
	 * 
	 * @param id
	 * 
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

	public AnnouncementInfo get(int id); // 获得指定的公告

	/**
	 * 获得所有公告
	 * 
	 * 
	 * @return List<AnnouncementInfo>
	 */

	public List<AnnouncementInfo> getAll();// 获得所有公告
}
