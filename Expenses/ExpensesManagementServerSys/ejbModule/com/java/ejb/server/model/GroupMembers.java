package com.java.ejb.server.model;

import java.io.Serializable;
import java.sql.Date;

public class GroupMembers implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int groupMId;
	private int groupId ;
	private int usersId;
	private Date joinedAt ;
	private double amountCollected ;
	public int getGroupMId() {
		return groupMId;
	}
	public void setGroupMId(int groupMId) {
		this.groupMId = groupMId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getUsersId() {
		return usersId;
	}
	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}
	public Date getJoinedAt() {
		return joinedAt;
	}
	public void setJoinedAt(Date joinedAt) {
		this.joinedAt = joinedAt;
	}
	public double getAmountCollected() {
		return amountCollected;
	}
	public void setAmountCollected(double amountCollected) {
		this.amountCollected = amountCollected;
	}
	
		



}
