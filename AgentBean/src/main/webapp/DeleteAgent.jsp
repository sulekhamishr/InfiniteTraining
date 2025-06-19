<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="com.java.dao.AgentDaoImp"%>
<%@page import="com.java.dao.AgentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- ScriptLetTag - inside it we write all java code -->
<%
int AgentId = Integer.parseInt(request.getParameter("agentId"));

AgentDao dao = new AgentDaoImp();
dao.removeAgentDao(AgentId);

%>

<jsp:forward page="AgentShow.jsp"></jsp:forward>
</body>
</html>