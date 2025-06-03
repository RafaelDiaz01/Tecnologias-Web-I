<%-- 
    Document   : index
    Created on : 6 may 2025, 10:46:21
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <!-- 1. Enviamos datos (peticion POST)-->
        <form action="login" method="post">
            <h1>Iniciar Sesion</h1>
            Name:<input type="text" name="name"> <br>
            Password: <input type="password" name="password"> <br>
            <input type="submit" vaue="login">
        </form>
    </body>
</html>
