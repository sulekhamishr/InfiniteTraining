<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<html>
<f:view>
  <head>
    <title>Employee Registration</title>
  </head>
  <body>
    <h:form>
      <h:panelGrid columns="2" cellpadding="5" style="margin:auto;">

        <h:outputLabel for="firstName" value="First Name:"/>
        <h:inputText id="firstName" value="#{employee.firstName}" required="true" label="First Name"/>
        <h:message for="firstName" style="color:red"/>

        <h:outputLabel for="lastName" value="Last Name:"/>
        <h:inputText id="lastName" value="#{employee.lastName}" required="true" label="Last Name"/>
        <h:message for="lastName" style="color:red"/>

        <h:outputLabel for="userName" value="User Name:"/>
        <h:inputText id="userName" value="#{employee.userName}" required="true" label="User Name"/>
        <h:message for="userName" style="color:red"/>

        <h:outputLabel for="email" value="Email:"/>
        <h:inputText id="email" value="#{employee.email}" required="true" label="Email">
          <f:validateRegex pattern="[^@ ]+@[^@ ]+\.[^@ ]+" />
        </h:inputText>
        <h:message for="email" style="color:red"/>

        <h:outputLabel/>
        <h:commandButton value="Submit" action="#{Controller.addEmployee()}"/>
      </h:panelGrid>
    </h:form>
  </body>
</f:view>
</html>
