package com.java.ejb.server.model;

public class Recipient {
	
		private int recipientId;
		private String firstName;
		private String lastName;
		private String userName;
		private String passCode;
		private String email;
		private String status;
		public int getRecipientId() {
			return recipientId;
		}
		public void setRecipientId(int recipientId) {
			this.recipientId = recipientId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassCode() {
			return passCode;
		}
		public void setPassCode(String passCode) {
			this.passCode = passCode;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
	

}
