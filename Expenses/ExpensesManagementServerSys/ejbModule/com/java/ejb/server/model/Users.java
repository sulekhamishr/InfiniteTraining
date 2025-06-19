package com.java.ejb.server.model;

import java.io.Serializable;
import java.sql.Date;

public class Users implements Serializable {
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int usersId;
		private String  usersName;
		private String password;
		private String email;
		private Date createdAt;
		public int getUsersId() {
			return usersId;
		}
		public void setUsersId(int usersId) {
			this.usersId = usersId;
		}
		public String getUsersName() {
			return usersName;
		}
		public void setUsersName(String usersName) {
			this.usersName = usersName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Users() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Users(int usersId, String usersName, String password, String email, Date createdAt) {
			super();
			this.usersId = usersId;
			this.usersName = usersName;
			this.password = password;
			this.email = email;
			this.createdAt = createdAt;
		}
		@Override
		public String toString() {
			return "Users [usersId=" + usersId + ", usersName=" + usersName + ", password=" + password + ", email="
					+ email + ", createdAt=" + createdAt + ", getUsersId()=" + getUsersId() + ", getUsersName()="
					+ getUsersName() + ", getPassword()=" + getPassword() + ", getEmail()=" + getEmail()
					+ ", getCreatedAt()=" + getCreatedAt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		
		
		

}
