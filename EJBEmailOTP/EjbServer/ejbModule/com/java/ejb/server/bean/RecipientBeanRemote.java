package com.java.ejb.server.bean;

import java.sql.SQLException;

import javax.ejb.Remote;


@Remote
public interface RecipientBeanRemote {
	
	String   validatePassword(String user, String password)throws ClassNotFoundException,SQLException;

}
