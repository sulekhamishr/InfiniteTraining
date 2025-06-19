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
    if (request.getParameter("AgentId") != null && request.getParameter("Premium") != null) {
    %>
        <jsp:useBean id="beanAgent" class="com.java.agent.Agent" />
        <jsp:setProperty property="*" name="beanAgent" /> 
        
        <!-- with the help of property star we didnit neeed to set and get all the fields it will be done automatically -->
        
        <jsp:useBean id="beanAgentDao" class="com.java.dao.AgentDaoImp" />

        <%
            String result = beanAgentDao.addEmployDao(beanAgent);
            out.println("<p>" + result + "</p>");
        %>
    <%
    }
    %>
</center>
</body>
</html>




 