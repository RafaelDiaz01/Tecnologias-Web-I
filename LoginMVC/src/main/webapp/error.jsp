<%-- 
    Document   : error
    Created on : 6 may 2025, 10:45:57
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <style>
            a{
                text-decoration: none;
                align-content: center;
                background-color: blue;
                padding: 10px;
                color: white;
                border-radius: 10px;
            }
        </style>
    </head>
    <body>
        <h1 style="color: red">Error!</h1>
        <p>Disculpa, usuario o contraseña incorrecta</p>
        <%--<%@ include file="index.jsp" %>--%>
        <a href="index.jsp">Iniciar Sesion</a>
    </body>
</html>
