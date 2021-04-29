package com.example.demo.pojo;

public class Initallogin {
	int uId;
	int phoneNumber;
	public Initallogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Initallogin(int uId, int phoneNumber) {
		super();
		this.uId = uId;
		this.phoneNumber = phoneNumber;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Initallogin [uId=" + uId + ", phoneNumber=" + phoneNumber + "]";
	}

}
