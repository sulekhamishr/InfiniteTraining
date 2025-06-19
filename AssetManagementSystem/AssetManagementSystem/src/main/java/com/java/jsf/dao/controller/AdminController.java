package com.java.jsf.dao.controller;

import javax.faces.context.FacesContext;

import com.java.jsf.dao.AdminDao;
import com.java.jsf.dao.AdminDaoImpl;
import com.java.jsf.model.Admin;

public class AdminController {
	
	private Admin admin;
	private AdminDao adminDao;
	private AdminDaoImpl adminDaoImpl;
	private String userName;
	private String password;
	private Admin LoggedAdmin;

	
	public Admin getLoggedAdmin() {
		return LoggedAdmin;
	}
	public void setLoggedAdmin(Admin loggedAdmin) {
		LoggedAdmin = loggedAdmin;
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
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public AdminDao getAdminDao() {
		return adminDao;
	}
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	public AdminDaoImpl getAdminDaoImpl() {
		return adminDaoImpl;
	}
	public void setAdminDaoImpl(AdminDaoImpl adminDaoImpl) {
		this.adminDaoImpl = adminDaoImpl;
	}
	public String addAdmin() {
		return adminDao.addAdmin(admin);
		
	}

	
	public String login() {
		String outcome = adminDao.login(userName, password);
        if ("AdminDashboard?faces-redirect=true".equals(outcome)) {
            admin = (Admin) FacesContext.getCurrentInstance().getExternalContext()
                    .getSessionMap().get("loggedInUser");
        }
        return outcome;
}
}