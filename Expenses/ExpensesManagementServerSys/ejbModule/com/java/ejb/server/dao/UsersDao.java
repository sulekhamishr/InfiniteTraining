package com.java.ejb.server.dao;

import java.sql.SQLException;
import com.java.ejb.server.model.Users;

public interface UsersDao {
    String registerUser(Users users) throws ClassNotFoundException, SQLException;
}