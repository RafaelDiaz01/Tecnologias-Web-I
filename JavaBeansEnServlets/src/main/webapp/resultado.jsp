<%-- 
    Document   : resultado
    Created on : 10 jun 2025, 10:16:17
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.unsij.beans.Vehiculo" %>
<!-- usar un bean -->
<jsp:useBean id="vehiculo" class="com.unsij.beans.Vehiculo" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <h1>Datos del Vehiculo</h1>
        Marca: <jsp:getProperty name="vehiculo" property="marca"/> <br>
        Modelo: <jsp:getProperty name="vehiculo" property="modelo"/> <br>
        Año: <jsp:getProperty name="vehiculo" property="anio"/> <br>
        Color: <jsp:getProperty name="vehiculo" property="color"/> <br>
        Combustible: <jsp:getProperty name="vehiculo" property="combustible"/> <br>
        Precio: <jsp:getProperty name="vehiculo" property="precio"/> <br>
        Disponible: <jsp:getProperty name="vehiculo" property="disponible"/> <br>
        <a href="formulario.jsp"> Regresar </a>
    </body>
</html>
