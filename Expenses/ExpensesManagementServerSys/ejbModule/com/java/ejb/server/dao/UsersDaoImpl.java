package com.java.ejb.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.ejb.server.model.Users;
import com.java.util.ConnectionHelper;

public class UsersDaoImpl implements UsersDao {

    @Override
    public String registerUser(Users users) throws ClassNotFoundException, SQLException {
    

            Connection conn  = ConnectionHelper.getConnection();

            PreparedStatement ps = conn.prepareStatement("INSERT INTO users (usersName, password, email, createdAt) VALUES (?, ?, ?, ?)");
            ps.setString(1, users.getUsersName());
            ps.setString(2, users.getPassword());
            ps.setString(3, users.getEmail());
            ps.setDate(4, users.getCreatedAt());

            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0 ? "SUCCESS" : "FAILED";

    }
}