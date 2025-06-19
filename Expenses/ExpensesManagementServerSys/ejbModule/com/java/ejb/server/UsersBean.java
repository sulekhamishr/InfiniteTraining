package com.java.ejb.server;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class UsersBean
 */
@Stateful
@LocalBean
public class UsersBean implements UsersBeanRemote {

    /**
     * Default constructor. 
     */
    public UsersBean() {
        // TODO Auto-generated constructor stub
    }

}
