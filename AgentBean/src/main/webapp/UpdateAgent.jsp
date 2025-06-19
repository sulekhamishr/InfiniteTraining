<%@page import="com.java.agent.Gender"%>
<%@page import="com.java.agent.Agent"%>
<%@page import="com.java.dao.AgentDao"%>
<%@page import="com.java.dao.AgentDaoImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Agent</title>
</head>
<body>

<%
    int agentID = Integer.parseInt(request.getParameter("agentID"));
    AgentDao dao = new AgentDaoImp();
    Agent agent = dao.searchAgentDao(agentID);
%>

<form action="UpdateAgent.jsp">
    Agent ID: 
    <input type="number" name="agentID" value=<%=agent.getAgentID() %> readonly="readonly" /> <br/><br/>
    
    Name: 
    <input type="text" name="name" value="<%=agent.getName() %>" /> <br/><br/>
    
    City: 
    <input type="text" name="city" value="<%=agent.getCity() %>" /> <br/><br/>
    
    Gender: 
    <input type="text" name="gender" value="<%=agent.getGender() %>" /> <br/><br/>
    
    MaritalStatus (0=Single, 1=Married): 
    <input type="number" name="maritalStatus" value="<%=agent.getMaritalStatus() %>" /> <br/><br/>
    
    Premium: 
    <input type="number" name="premium" value="<%=agent.getPremium() %>" /> <br/><br/>
    
    <input type="submit" value="Update" />
</form>

<%
    if (request.getParameter("agentID") != null && request.getParameter("premium") != null) {
        Agent updatedAgent = new Agent();
        updatedAgent.setAgentID(Integer.parseInt(request.getParameter("agentID")));
        updatedAgent.setName(request.getParameter("name"));
        updatedAgent.setCity(request.getParameter("city"));
        updatedAgent.setGender(Gender.valueOf(request.getParameter("gender").toUpperCase()));
        updatedAgent.setMaritalStatus(Integer.parseInt(request.getParameter("maritalStatus")));
        updatedAgent.setPremium(Long.parseLong(request.getParameter("premium")));
        
        dao.updateAgentDao(updatedAgent);
        
    }
%>
    <jsp:forward page="AgentShow.jsp" />
<%
</head>
</body>
</html>
