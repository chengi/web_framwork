package com.entity;

import java.util.Date;



public class AnnouncementInfo implements java.io.Serializable {
	/**
	 * 根据数据库表创建实体类
	 * 封装实体类中的对象
	 */
	private static final long serialVersionUID = 1L;

	private int id;//公告编号
	private String publisher;//公告发布者
	private String title;//公告主题
	private String content;//公告内容
	private Date pub_date;//公告时间
	private String pub_dateStr;//公告时间转化存储变量
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPub_date() {
		return pub_date;
	}
	public void setPub_date(Date pub_date) {
		this.pub_date = pub_date;
	}
	public String getPub_dateStr() {
		return pub_dateStr;
	}
	public void setPub_dateStr(String pub_dateStr) {
		this.pub_dateStr = pub_dateStr;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AnnouncementInfo [id=" + id + ", publisher=" + publisher
				+ ", title=" + title + ", content=" + content + ", pub_date="
				+ pub_date + "]";
	}
	

}