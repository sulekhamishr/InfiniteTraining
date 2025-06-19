<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Login</title>
</head>
<body>
    <f:view>
        <h:form>
            <h2>Admin Login</h2>

            <h:messages globalOnly="true" layout="table" style="color: red;" />

            <h:panelGrid columns="2" cellpadding="5">
                <h:outputLabel for="username" value="Username:" />
                <h:inputText id="username" value="#{adminController.userName}" required="true" label="Username" />

                <h:outputLabel for="password" value="Password:" />
                <h:inputSecret id="password" value="#{adminController.password}" required="true" label="Password" />
            </h:panelGrid>

            <br/>

            <h:commandButton value="Login" action="#{adminController.login()}" />
        </h:form>
    </f:view>
</body>
</html>
