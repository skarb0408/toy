package com.test.dto;

/*
이름      널?       유형            
------- -------- ------------- 
NUM     NOT NULL NUMBER        
NAME    NOT NULL VARCHAR2(20)  
TITLE   NOT NULL VARCHAR2(100) 
CONTENT NOT NULL VARCHAR2(500) 
DAYS             VARCHAR2(100) 

CREATE SEQUENCE room_seq;
 */
public class Room {
	private int num;
	private String name;
	private String title;
	private String content;
	private String days;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}
}
