package com.java.jsf.dao;

import com.java.jsf.model.User;

public interface UserDao {
	
	public String addUser(User user);
	public String login(String userName, String password);


}
