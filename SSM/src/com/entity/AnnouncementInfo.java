package com.entity;

import java.util.Date;



public class AnnouncementInfo implements java.io.Serializable {
	/**
	 * �������ݿ����ʵ����
	 * ��װʵ�����еĶ���
	 */
	private static final long serialVersionUID = 1L;

	private int id;//������
	private String publisher;//���淢����
	private String title;//��������
	private String content;//��������
	private Date pub_date;//����ʱ��
	private String pub_dateStr;//����ʱ��ת���洢����
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