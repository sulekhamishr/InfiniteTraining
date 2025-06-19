package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.java.agent.Agent;
import com.java.agent.Gender;
import com.java.util.ConnectionHelper;

public class AgentDaoImp implements AgentDao {

	@Override
	public List<Agent> showAgentDao() {
		// TODO Auto-generated method stub
		
		
		List<Agent> agentList = new ArrayList<>();
        try(Connection conn = ConnectionHelper.getConnection()) {
            String query = "SELECT * FROM agent"; 
            try (PreparedStatement ps = conn.prepareStatement(query);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Agent agent = new Agent(
                        rs.getInt("agentID"),
                        rs.getString("name"),
                        rs.getString("city"),
              
                        Gender.valueOf(rs.getString("gender")),
                        rs.getInt("MaritalStatus"),
                        rs.getLong("premium")
                            );
                    agentList.add(agent);
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return agentList;
    }
                    		
                    		
   

	@Override
	public String addAgentDao(Agent agent) {
		// TODO Auto-generated method stub
		
		
		String result = "Failed to add agent.";
        try (Connection conn = ConnectionHelper.getConnection()) {
            String query = "INSERT INTO agent (name, city, gender, maritalStatus, premium) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, agent.getName());
                ps.setString(2, agent.getCity());
                ps.setString(3, agent.getGender().name());
                
                   ps.setInt(4, agent.getMaritalStatus());
                  ps.setLong(5, agent.getPremium());
                
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    result = "Agent added successfully.";
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
	}

	@Override
	public Agent searchAgentDao(int empno) {
		// TODO Auto-generated method stub
		
		    Agent agent = null;
	        try (Connection conn = ConnectionHelper.getConnection()) {
	            String query = "SELECT * FROM agent WHERE agentID = ?";
	            try (PreparedStatement ps = conn.prepareStatement(query)) {
	                ps.setInt(1, empno);
	                try (ResultSet rs = ps.executeQuery()) {
	                    if (rs.next()) {
	                        agent = new Agent(
	                            rs.getInt("agentID"),
	                            rs.getString("name"),
	                            rs.getString("city"),
	                            Gender.valueOf(rs.getString("gender")),
	                            rs.getInt("maritalStatus"),
	                            rs.getLong("premium")
	                        );
	                    }
	                }
	            }
	        } catch (SQLException  | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return agent;
	    }
	

	@Override
	public String updateAgentDao(Agent agent) {
		// TODO Auto-generated method stub
		
		String result = "Failed to update agent.";
        try (Connection conn = ConnectionHelper.getConnection()) {
            String query = "UPDATE agent SET name = ?, city = ?, gender = ?, maritalStatus = ?, premium = ? WHERE agentID = ?";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
            	
            	ps.setString(1, agent.getName() );
                ps.setString(2, agent.getCity());
                ps.setString(3, agent.getGender().name());
                ps.setInt(4, agent.getMaritalStatus());
                ps.setLong(5, agent.getPremium());
                ps.setInt(6, agent.getAgentID());
                
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    result = "Agent updated successfully.";
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
	

	@Override
	public String removeAgentDao(int AgentID) {
		// TODO Auto-generated method stub
		
		String result = "Failed to remove agent.";
        try (Connection conn = ConnectionHelper.getConnection()) {
            String query = "DELETE FROM agent WHERE agentID = ?";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setInt(1, AgentID);
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    result = "Agent removed successfully.";
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
	
