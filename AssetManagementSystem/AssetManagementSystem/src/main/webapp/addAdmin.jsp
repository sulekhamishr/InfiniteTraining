<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<f:view>

<html>
<head>
    <meta charset="UTF-8">
    <title>Add Admin</title>
</head>
<body>
    <h:form>
        <h2>Add Admin</h2>

        <h:outputLabel for="userName" value="Username: " />
        <h:inputText id="userName" value="#{admin.userName}" required="true" /><br/><br/>

        <h:outputLabel for="password" value="Password: " />
        <h:inputSecret id="password" value="#{admin.password}" required="true" /><br/><br/>

        <h:outputLabel for="email" value="Email: " />
        <h:inputText id="email" value="#{admin.email}" required="true" /><br/><br/>

        <h:commandButton value="Add Admin" action="#{adminController.addAdmin}" />
        
        <h:messages />
    </h:form>
</f:view>
</body>
</html>
