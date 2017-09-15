package com.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AnnouncementInfoDao;
import com.entity.AnnouncementInfo;
import com.service.AnnouncementInfoService;
/**
 * Service的实现，调用Dao层的方法
 * 
 *
 */
@Service
@Transactional
public class AnnouncementInfoServiceImpl implements AnnouncementInfoService {

	@Resource
	private AnnouncementInfoDao AnnouncementInfoMapper;

	/**
	 * 新增公告
	 * 
	 * @param ann
	 */
	@Override
	public void insertAdd(AnnouncementInfo ann) {
		AnnouncementInfoMapper.add(ann);
	}

	/**
	 * 删除公告
	 * 
	 * @param id
	 */
	@Override
	public void delete(int id) {
		AnnouncementInfoMapper.delete(id);
	}

	/**
	 * 修改公告
	 * 
	 * @param ann
	 */
	@Override
	public void update(AnnouncementInfo ann) {
		AnnouncementInfoMapper.update(ann);
	}

	/**
	 *  获得指定的公告
	 * 
	 * @param id
	 * @return AnnouncementInfo
	 */
	@Override
	public AnnouncementInfo searchGet(int id) {
		return AnnouncementInfoMapper.get(id);
	}

	/**
	 * 获得所有公告
	 * 
	 * 
	 * @return List<AnnouncementInfo>
	 */
	@Override
	public List<AnnouncementInfo> searchGetAll() {
		return AnnouncementInfoMapper.getAll();
	}
}