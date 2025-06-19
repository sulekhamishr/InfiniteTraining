<%@page import="com.java.agent.Gender"%>
<%@page import="java.net.Authenticator.RequestorType"%>
<%@page import="com.java.dao.AgentDaoImp"%>
<%@page import="com.java.dao.AgentDao"%>
<%@page import="com.java.agent.Agent"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>
  
  <form method="post" action="AddAgent.jsp">
  
  
  Agent Id:
   <input type="number"  name="AgentId"/> <br></br>
  Name:
   <input type="text" name ="name"/><br></br>
  City :
  <input type="text" name="city"/><br></br>
  Gender:
  <select name="gender">
				<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
			</select> <br/><br/>
 			
  Marital Status:
  <select name="maritalStatus">
    <option value="1">1</option>
    <option value="2">2</option>
</select>
  
Premium:
<input type="number" name="Premium"/><br></br>
  
          <input type="submit" name="Add Agent"/>  
  </form>
 
 <%
 
 if(request.getParameter("AgentId") != null && !request.getParameter("AgentId").isEmpty() && 
 request.getParameter("Premium") != null && !request.getParameter("Premium").isEmpty()) {
	 
	  Agent agent = new Agent();
	 AgentDao dao=new AgentDaoImp();
	 
	 agent.setAgentID(Integer.parseInt(request.getParameter("AgentId")));
     agent.setName(request.getParameter("name"));
     agent.setCity(request.getParameter("city"));
     agent.setGender(Gender.valueOf(request.getParameter("gender")));
     agent.setMaritalStatus(Integer.parseInt(request.getParameter("maritalStatus"))); 
     agent.setPremium(Long.parseLong(request.getParameter("Premium")));

     dao.addAgentDao(agent);
	 
	 

 }
 
 
 %>


</center>
</body>
</html>

</body>
</html>