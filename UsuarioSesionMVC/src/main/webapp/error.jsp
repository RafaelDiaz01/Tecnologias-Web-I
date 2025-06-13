<%-- 
    Document   : error
    Created on : 13 jun 2025, 10:26:05
    Author     : rafaeldiaz
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1>Ups! Ocurrió un Error</h1>
        <p><%= exception.getMessage() %></p>
        <hr>
        <a href="login.jsp">Intentar de nuevo</a>
    </body>
</html>
