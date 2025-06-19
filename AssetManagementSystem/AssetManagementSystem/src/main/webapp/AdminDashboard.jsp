<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<!DOCTYPE html>
<html>
<f:view>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
</head>

    <title>User Dashboard</title>
    <style>
        /* Background gradient */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #6a11cb 0%, #2575fc 100%);
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        /* Dashboard card */
        .dashboard {
            background: #fff;
            padding: 40px 50px;
            border-radius: 15px;
            width: 420px;
            box-shadow: 0 8px 25px rgba(0, 0, 0, 0.2);
            text-align: center;
            color: #333;
            transition: transform 0.3s ease;
        }

        .dashboard:hover {
            transform: translateY(-8px);
            box-shadow: 0 15px 30px rgba(0, 0, 0, 0.3);
        }

        /* Welcome message */
        h2 {
            margin-bottom: 20px;
            font-weight: 700;
            font-size: 2.2rem;
            color: #222;
        }

        /* Username style */
        .username {
            font-size: 1.5rem;
            color: #2575fc;
            font-weight: 600;
            margin-top: 8px;
        }

        /* Optional: add a logout button */
        h:commandButton {
            margin-top: 30px;
            padding: 10px 25px;
            background-color: #2575fc;
            border: none;
            border-radius: 8px;
            color: white;
            font-weight: 600;
            cursor: pointer;
            font-size: 1rem;
            transition: background-color 0.3s ease;
        }

        h:commandButton:hover {
            background-color: #6a11cb;
        }
    </style>
</head>
<body>
    <div class="dashboard">
        <h2>Welcome</h2>
        <div class="username">
            <!-- SessionScope will bring the name in which the user is Loggedin -->
            <h:outputText value="#{sessionScope.loggedInUser.userName}" />
        </div>
        
        

       
    </div>
</body>
</html>
</f:view>

