package com.service;

import java.util.List;

import com.entity.AnnouncementInfo;

/**
 * Service��Ľӿ�
 * ������������ʽҪ��insert��delete������spring-mybatis.xml�����ļ����й涨
 * 
 */
public interface AnnouncementInfoService {
	  
	/**
	 * ��������
	 * 
	 * @param ann
	 */

	public void insertAdd(AnnouncementInfo ann);// ��������

	/**
	 * ɾ��ָ���Ĺ���
	 * 
	 * @param id
	 */

	public void delete(int id);// ɾ��ָ���Ĺ���

	/**
	 * ����ָ���Ĺ���
	 * 
	 * @param ann
	 */

	public void update(AnnouncementInfo ann);// ����ָ���Ĺ���

	/**
	 * ���ָ���Ĺ���
	 * 
	 * @param id
	 * @return AnnouncementInfo
	 */

	public AnnouncementInfo searchGet(int id); // ���ָ���Ĺ���

	/**
	 * ������й���
	 * 
	 * 
	 * @return List<AnnouncementInfo>
	 */

	public List<AnnouncementInfo> searchGetAll();// ������й���
	}