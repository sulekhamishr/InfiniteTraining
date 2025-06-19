package com.java.ejb.controller;

import java.sql.SQLException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.java.ejb.server.Impl.UsersBeanImpl;
import com.java.ejb.server.model.Users;
import com.java.hibernate.jsf.dao.UsersDao;


public class ControllerUser  {

    private Users users ;
    private UsersDao userDao ;
    private String userName;
    private String password;
    private UsersBeanImpl userImpl;
    private List<com.java.model.Users> showUsers; 
    private com.java.model.Users user;

    public com.java.model.Users getUser() {
        return user;
    }

    public void setUser(com.java.model.Users user) {
        this.user = user;
    }

	
	public List<com.java.model.Users> getShowUsers() {
		return showUsers;
	}

	public void setShowUsers(List<com.java.model.Users> showUsers) {
		this.showUsers = showUsers;
	}

	public UsersBeanImpl getUserImpl() {
		return userImpl;
	}
	public void setUserImpl(UsersBeanImpl userImpl) {
		this.userImpl = userImpl;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public UsersDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UsersDao userDao) {
		this.userDao = userDao;
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
    
    public String registerUser(Users users) throws ClassNotFoundException, SQLException {
    	users.setCreatedAt(new java.sql.Date(System.currentTimeMillis()));
    	return userImpl.registerUserEjb(users);
    }
    
    public String login() {
        com.java.model.Users u = userDao.login(users.getUsersName(), users.getPassword());

        if (u != null) {
            // it get store in session
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("loggedInUser", u);
            return "dashboard?faces-redirect=true"; 
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login failed", "Invalid username or password."));
            return null; 
        }
    }

    
    
    public List<com.java.model.Users> showUsers() {
		return userDao.getAllUsers();
      
    }
    
    
 }
   
