package com.java.ejb.server.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.ejb.server.util.ConnectionHelper;

public class RecipientDaoImpl implements RecipientDao {

	@Override
	public String validatePassword(String user, String password) {
		// TODO Auto-generated method stub
		
		//Declare outside so they are accesible finally
		Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
		
		try {
			
			
			//Get database connection using connectionHelper class
			 conn= ConnectionHelper.getConnection();
			
			//sql query to check user creditianls
	        String sql = "SELECT * FROM Otp WHERE userName = ? AND nPassword = ?";

	        //Prepare the SQL query to check if the given username and password exist
	        //the ? are placeholder to prevent SQL injection

	         ps=conn.prepareStatement(sql); //compile the sql statement
	        
	        
	        //Set the parameters for Query
	        ps.setString(1, user); // ? first question ? for userName
	        ps.setString(2, password); // ? Second question ? for passWord
	        
	        
	        //Exceute the Query
	        rs=ps.executeQuery();
	        //ResultSet will hold the result of the query
	        
	        //check if matching record found
	        if(rs.next()) {
	        	
	        	// if rs.next()== matching record then logging in 
	        	return "Thanks for logging in";
	        	
	        }else {
	        	
	        	//No Matching rEcord Found
	        	return"Enter Correct pAssword";
	        }
	        
	        
	        
		} catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	        return "DataBase Error:" + e.getMessage();

	    } finally {
	        // Now these are accessible here
	        try {
	            if (rs != null) rs.close();
	            if (ps != null) ps.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e2) {
	            e2.printStackTrace();
	        }
	    }
	}

}