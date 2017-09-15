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

//使用注解的方式  
@Controller
@RequestMapping("/ann")
//
public class AnnouncementInfoController {

	protected final Log logger = LogFactory.getLog(getClass());

	// controller要调用service中的方法来实现功能
	@Resource
	private AnnouncementInfoService AnnouncementInfosService;

	// 增加公告信息
	@RequestMapping("/add")
	public String add(
			@Param("announcementInfo") AnnouncementInfo announcementInfo) {
		AnnouncementInfosService.insertAdd(announcementInfo);
		return "redirect:selList";//跳转方法要使用redirect：页面 ，跳转页面直接写页面
	}

	// 查看全部公告信息
	@RequestMapping("/selList")
	public String selList(HttpServletRequest request) {

		HttpSession session = request.getSession();
		List<AnnouncementInfo> announcementInfoList = AnnouncementInfosService
				.searchGetAll();

		//公告日期是提交公告时的时间
		//使用foreach遍历出公告时间，让后把公告时间进行格式转化
		for (AnnouncementInfo a : announcementInfoList) {
			a.setPub_dateStr(stringToDate(a.getPub_date().toString()));
		}
		session.setAttribute("announcementInfoList", announcementInfoList);
		return "selList";
	}
//时间转化的方法，把String类型转化为数据库中的Date类型
	public String stringToDate(String str) {
		Date date = null;
		String sDate = null;
		try {
			date = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK)
					.parse(str);
			// 格式化
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sDate = sdf.format(date);

			// System.out.println(sDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sDate;
	}

	// 查看单条公告信息
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

	// 删除单条公告信息
	@RequestMapping("/del")
	public String del(@Param("id") int id, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("id", id);

		AnnouncementInfosService.delete(id);

		return "redirect:selList";
	}

	// 更新公告信息
	@RequestMapping("/upd")
	public String upd(
			@Param("announcementInfo") AnnouncementInfo announcementInfo) {

		AnnouncementInfosService.update(announcementInfo);

		return "redirect:selList";
	}
}