package com.bean;

public class Page {
	private Integer pageStart;
	private Integer pageEnd;
	private Integer rowNum;
	private Integer pageNum;
	private Integer onePageSum=3;
	private Integer nowPageNum=1;
	
	
	public Integer getNowPageNum() {
		return nowPageNum;
	}
	public void setNowPageNum(Integer nowPageNum) {
		this.nowPageNum = nowPageNum;
	}
	public Integer getPageStart() {
		return pageStart;
	}
	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}
	public Integer getPageEnd() {
		return pageEnd;
	}
	public void setPageEnd(Integer pageEnd) {
		this.pageEnd = pageEnd;
	}
	public Integer getRowNum() {
		return rowNum;
	}
	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getOnePageSum() {
		return onePageSum;
	}
	public void setOnePageSum(Integer onePageSum) {
		this.onePageSum = onePageSum;
	}
	@Override
	public String toString() {
		return "Page [pageStart=" + pageStart + ", pageEnd=" + pageEnd + ", rowNum=" + rowNum + ", pageNum=" + pageNum
				+ ", onePageSum=" + onePageSum + ", nowPageNum=" + nowPageNum + "]";
	}
	
}
