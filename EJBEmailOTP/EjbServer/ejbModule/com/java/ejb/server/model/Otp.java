package com.java.ejb.server.model;

public class Otp {

	
	private int otpId;
	private String userName;
	private int otpNo;
	private String nPassword;
	private String status;
	public int getOtpId() {
		return otpId;
	}
	public void setOtpId(int otpId) {
		this.otpId = otpId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getOtpNo() {
		return otpNo;
	}
	public void setOtpNo(int otpNo) {
		this.otpNo = otpNo;
	}
	public String getnPassword() {
		return nPassword;
	}
	public void setnPassword(String nPassword) {
		this.nPassword = nPassword;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
