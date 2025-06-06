<%-- 
    Document   : resultado
    Created on : 4 jun 2025, 10:31:17
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.unsij.modelo.Persona" %>
<!-- usar un bean -->
<jsp:useBean id="persona" class="com.unsij.modelo.Persona" scope="request"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <h2>Datos Recibidos</h2>
        Nombre: <jsp:getProperty name="persona" property="nombre"/> <br>
        Edad: <jsp:getProperty name="persona" property="edad"/>
    </body>
</html>
