package com.java.jsf.dao.controller;

import javax.faces.context.FacesContext;

import com.java.jsf.dao.UserDao;
import com.java.jsf.dao.UserDaoImpl;
import com.java.jsf.model.User;

public class UserController {

	

		
		private User user;
		private UserDao userDao;
		private UserDaoImpl userDaoImpl;
		private String userName;
		private String password;
		private User LoggedUser;
		

		
	
		public User getUser() {
			return user;
		}




		public void setUser(User user) {
			this.user = user;
		}




		public UserDao getUserDao() {
			return userDao;
		}




		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}




		public UserDaoImpl getUserDaoImpl() {
			return userDaoImpl;
		}




		public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
			this.userDaoImpl = userDaoImpl;
		}




		public String getUserName() {
			return userName;
		}




		public void setUserName(String userName) {
			this.userName = userName;
		}




		public String getPassword() {
			return password;
		}




		public void setPassword(String password) {
			this.password = password;
		}




		public User getLoggedUser() {
			return LoggedUser;
		}




		public void setLoggedUser(User loggedUser) {
			LoggedUser = loggedUser;
		}
		public String addUser() {
		    return userDao.addUser(user); 
		}





		public String login() {
			String outcome = userDao.login(userName, password);
	        if ("UserDashboard?faces-redirect=true".equals(outcome)) {
	            user = (User) FacesContext.getCurrentInstance().getExternalContext()
	                    .getSessionMap().get("loggedInUser");
	        }
	        return outcome;
	}
}
