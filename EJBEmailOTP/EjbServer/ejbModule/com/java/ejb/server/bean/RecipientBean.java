package com.java.ejb.server.bean;

import java.sql.SQLException;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import com.java.ejb.server.Dao.RecipientDao;
import com.java.ejb.server.Dao.RecipientDaoImpl;

/**
 * Session Bean implementation class RecipientBean
 */
@Stateful
@Remote(RecipientBeanRemote.class)
public class RecipientBean implements RecipientBeanRemote {

    /**
     * Default constructor. 
     */
	//we are implementing it in static block so that we can access it everywhere
	static RecipientDao recipientDao;
	static {
		recipientDao= new RecipientDaoImpl();
	}
    public RecipientBean() {
        // TODO Auto-generated constructor stub
    	
    }
	@Override
	public String validatePassword(String user, String password) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return recipientDao.validatePassword(user, password);
	}
    

}
