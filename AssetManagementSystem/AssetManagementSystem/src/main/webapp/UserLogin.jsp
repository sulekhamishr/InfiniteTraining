<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<f:view>

<html>
<head>
    <meta charset="UTF-8">
    <title>Add User</title>
</head>
<body>
    <h:form>
        <h2>Add User</h2>

        <h:outputLabel for="userName" value="Username: " />
        <h:inputText id="userName" value="#{user.userName}" required="true" /><br/><br/>

        <h:outputLabel for="password" value="Password: " />
        <h:inputSecret id="password" value="#{user.password}" required="true" /><br/><br/>

        <h:outputLabel for="email" value="Email: " />
        <h:inputText id="email" value="#{user.email}" required="true" /><br/><br/>

        <h:commandButton value="Add User" action="#{userController.addUser}" />
        
        <h:messages />
    </h:form>
</f:view>
</body>
</html>
