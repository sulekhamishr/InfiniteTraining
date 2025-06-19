<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 
<!DOCTYPE html>
<f:view>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h:form>

           <br> Please Enter Numbers: <br/>
            First Number 
            <h:inputText id="firstNo" value="#{calculation.firstNo}"/><br>
            Second Number
            <h:inputText id="secondNo" value="#{calculation.secondNo}"/><br>
        	Result is : 
        	<h:outputText value="#{calculation.result}"/>
        	<h:commandButton actionListener="#{calculation.addition}" value="Sum" />
            <h:commandButton actionListener="#{calculation.substraction}" value="Sub" />
            <h:commandButton actionListener="#{calculation.Multiplication}" value="Multi" />
            

</h:form>



</body>
</html>
</f:view>