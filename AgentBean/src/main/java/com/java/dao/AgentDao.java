package com.java.dao;

import java.util.List;

import com.java.agent.Agent;

public interface AgentDao {
	
	

		List<Agent> showAgentDao();
		
		String addAgentDao(Agent agent);
				
		Agent searchAgentDao(int AgentID);
		
		String updateAgentDao(Agent agent);
		
		String removeAgentDao(int AgentID);
		
		
	}
