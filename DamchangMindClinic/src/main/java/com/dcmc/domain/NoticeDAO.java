package com.dcmc.domain;

public class NoticeDAO {
	int bno;
	String title;
	String content;
	String showYn;
	String writer;
	String registerDate;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
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
	public String getShowYn() {
		return showYn;
	}
	public void setShowYn(String showYn) {
		this.showYn = showYn;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
	
}