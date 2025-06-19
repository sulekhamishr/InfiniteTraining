<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html>
<html>
<f:view>
  <head>
    <title>Generate Password</title>
  </head>
  <body>
    <h:form>
      <h:panelGrid columns="2" cellpadding="5" style="margin:auto;">

        <h:outputLabel for="userName" value="User Name:"/>
        <h:inputText id="userName" value="#{employee.userName}" required="true"/>
        <h:message for="userName" style="color:red"/>

        <h:outputLabel for="otp" value="OTP:"/>
        <h:inputText id="otp" value="#{employee.otpNo}" required="true"/>
        <h:message for="otp" style="color:red"/>

        <h:outputLabel/>
        <h:commandButton value="Generate Password" action="#{Controller.generatePassword}"/>
      </h:panelGrid>
    </h:form>
  </body>
</f:view>
</html>
