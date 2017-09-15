package com.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AnnouncementInfoDao;
import com.entity.AnnouncementInfo;
import com.service.AnnouncementInfoService;
/**
 * Service��ʵ�֣�����Dao��ķ���
 * 
 *
 */
@Service
@Transactional
public class AnnouncementInfoServiceImpl implements AnnouncementInfoService {

	@Resource
	private AnnouncementInfoDao AnnouncementInfoMapper;

	/**
	 * ��������
	 * 
	 * @param ann
	 */
	@Override
	public void insertAdd(AnnouncementInfo ann) {
		AnnouncementInfoMapper.add(ann);
	}

	/**
	 * ɾ������
	 * 
	 * @param id
	 */
	@Override
	public void delete(int id) {
		AnnouncementInfoMapper.delete(id);
	}

	/**
	 * �޸Ĺ���
	 * 
	 * @param ann
	 */
	@Override
	public void update(AnnouncementInfo ann) {
		AnnouncementInfoMapper.update(ann);
	}

	/**
	 *  ���ָ���Ĺ���
	 * 
	 * @param id
	 * @return AnnouncementInfo
	 */
	@Override
	public AnnouncementInfo searchGet(int id) {
		return AnnouncementInfoMapper.get(id);
	}

	/**
	 * ������й���
	 * 
	 * 
	 * @return List<AnnouncementInfo>
	 */
	@Override
	public List<AnnouncementInfo> searchGetAll() {
		return AnnouncementInfoMapper.getAll();
	}
}