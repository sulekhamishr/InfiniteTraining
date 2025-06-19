package com.java.agent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agent {
	
	
	  private int AgentID; 
	  private String Name ;
	  private String City ;
	  private Gender gender; // Gender is now an enum type
	  private int MaritalStatus;
	  private long Premium ;
	

}
