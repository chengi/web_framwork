package cn.itcast.ssm.entity;

import java.util.List;

public class PageInfo {
	private int pageNum = 1;//页号
	private int pageSize = 5;//页面大小
	private int totalRecord;//总记录数
	private int totalPage;//总页数

	private int startPos;
	public int getStartPos() {
		return (pageNum-1) * pageSize + 1;
	}
	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}
	public int getEndPos() {
		return pageNum * pageSize;
	}
	public void setEndPos(int endPos) {
		this.endPos = endPos;
	}
	private int endPos;
	private List<Students> studentsList;//每页需要显示的数据
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalPage() {
		return (totalRecord + pageSize -1) / pageSize;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<Students> getStudentsList() {
		return studentsList;
	}
	public void setStudentsList(List<Students> studentsList) {
		this.studentsList = studentsList;
	}
	
}
