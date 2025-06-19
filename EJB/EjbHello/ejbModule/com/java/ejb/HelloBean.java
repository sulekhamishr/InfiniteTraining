package com.java.ejb;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
@Remote(HelloBeanRemote.class)
public class HelloBean implements HelloBeanRemote {

    /**
     * Default constructor. 
     */
    public HelloBean() {
        // TODO Auto-generated constructor stub
    }
// HelloBeanRemote - so that will remote to that class...
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Welcome to EJB Programming... From Sulekha";
	}

}
