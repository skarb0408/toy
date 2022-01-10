package com.test.dto;

public class Sawon {
	private int no;
	private String num;
	private String name;
	private String phone;
	private String rank;
	private String mail;

	public Sawon() {
		// TODO Auto-generated constructor stub
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = transform(num);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String transform(String num) {

		if (num.length() == 1) {
			num = "00" + num;
		} else if (num.length() == 2) {
			num = "0" + num;
		}
		return num;
	}
}
