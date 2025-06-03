<%-- 
    Document   : procesar
    Created on : 2 jun 2025, 10:36:15
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.unsij.modelo.Usuario" %>
<!-- usar un bean -->
<jsp:useBean id="miBean" class="com.unsij.modelo.Usuario" scope="request"/>
<jsp:setProperty name="miBean" property="*"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos del Usuario</title>
    </head>
    <body>
        <h1>Acciones JSP</h1>
        <h3>Datos del Usuario</h3>
        Nombre: <jsp:getProperty name="miBean" property="nombre" /> <br>
        Correo: <jsp:getProperty  name="miBean" property="correo" />

    </body>
</html>
