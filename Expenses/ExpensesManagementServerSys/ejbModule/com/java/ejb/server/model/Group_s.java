package com.java.ejb.server.model;

import java.io.Serializable;
import java.sql.Date;

public class Group_s implements Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int groupId;
		private String groupName;
		private Date createdAt;
		private String createdBy;
		private double initialAmount;

		public double getInitialAmount() {
			return initialAmount;
		}

		public void setInitialAmount(double initialAmount) {
			this.initialAmount = initialAmount;
		}

		public String getCreatedBy() {
			return createdBy; 
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public int getGroupId() {
			return groupId;
		}

		public void setGroupId(int groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		
}

	
