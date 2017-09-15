package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.AnnouncementInfo;
import com.service.AnnouncementInfoService;

//ʹ��ע��ķ�ʽ  
@Controller
@RequestMapping("/ann")
//
public class AnnouncementInfoController {

	protected final Log logger = LogFactory.getLog(getClass());

	// controllerҪ����service�еķ�����ʵ�ֹ���
	@Resource
	private AnnouncementInfoService AnnouncementInfosService;

	// ���ӹ�����Ϣ
	@RequestMapping("/add")
	public String add(
			@Param("announcementInfo") AnnouncementInfo announcementInfo) {
		AnnouncementInfosService.insertAdd(announcementInfo);
		return "redirect:selList";//��ת����Ҫʹ��redirect��ҳ�� ����תҳ��ֱ��дҳ��
	}

	// �鿴ȫ��������Ϣ
	@RequestMapping("/selList")
	public String selList(HttpServletRequest request) {

		HttpSession session = request.getSession();
		List<AnnouncementInfo> announcementInfoList = AnnouncementInfosService
				.searchGetAll();

		//�����������ύ����ʱ��ʱ��
		//ʹ��foreach����������ʱ�䣬�ú�ѹ���ʱ����и�ʽת��
		for (AnnouncementInfo a : announcementInfoList) {
			a.setPub_dateStr(stringToDate(a.getPub_date().toString()));
		}
		session.setAttribute("announcementInfoList", announcementInfoList);
		return "selList";
	}
//ʱ��ת���ķ�������String����ת��Ϊ���ݿ��е�Date����
	public String stringToDate(String str) {
		Date date = null;
		String sDate = null;
		try {
			date = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK)
					.parse(str);
			// ��ʽ��
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sDate = sdf.format(date);

			// System.out.println(sDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sDate;
	}

	// �鿴����������Ϣ
	@RequestMapping("/selOne")
	public String selOne(@Param("id") int id, HttpServletRequest request) {

		HttpSession session = request.getSession();

		AnnouncementInfo oldAnnouncementInfo = AnnouncementInfosService
				.searchGet(id);
		oldAnnouncementInfo.setPub_dateStr(stringToDate(oldAnnouncementInfo
				.getPub_date().toString()));
		session.setAttribute("announcementInfo", oldAnnouncementInfo);
		return "selandupd";
	}

	// ɾ������������Ϣ
	@RequestMapping("/del")
	public String del(@Param("id") int id, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("id", id);

		AnnouncementInfosService.delete(id);

		return "redirect:selList";
	}

	// ���¹�����Ϣ
	@RequestMapping("/upd")
	public String upd(
			@Param("announcementInfo") AnnouncementInfo announcementInfo) {

		AnnouncementInfosService.update(announcementInfo);

		return "redirect:selList";
	}
}