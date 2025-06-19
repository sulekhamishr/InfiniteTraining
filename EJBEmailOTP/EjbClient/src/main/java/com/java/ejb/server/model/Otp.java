package com.java.ejb.server.model;

import java.util.Date;

import com.java.jsf.recepient.model.OtpStatus;
import com.java.jsf.recepient.model.Purpose;

public class Otp {
    private int otpId;
    private String userName;
    private int otpCode;
    private String newPassword;
    private OtpStatus otpStatus;
    private Date createdAt;
    private Date expiresAt;
    private Purpose purpose;
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
	public int getOtpCode() {
		return otpCode;
	}
	public void setOtpCode(int otpCode) {
		this.otpCode = otpCode;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public OtpStatus getOtpStatus() {
		return otpStatus;
	}
	public void setOtpStatus(OtpStatus otpStatus) {
		this.otpStatus = otpStatus;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getExpiresAt() {
		return expiresAt;
	}
	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}
	public Purpose getPurpose() {
		return purpose;
	}
	public void setPurpose(Purpose purpose) {
		this.purpose = purpose;
	}
	
    
    
    

}