package com.java.jsf.dao;



import com.java.jsf.model.Admin;

public interface AdminDao {
	
	public String addAdmin(Admin admin);
	public String login(String userName, String password);


}
