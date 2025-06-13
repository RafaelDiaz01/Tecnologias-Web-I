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
        <link rel="stylesheet" href="estilos.css"/>
    </head>
    <body>
        <header>
            <h1>Tercer Parcial - Tecnologias Web I</h1>
        </header>

        <main>
            <h2>Datos del Vehiculo</h2>
            <table class="tabla-vehiculo">
                <tr>
                    <th>Campo</th>
                    <th>Valor</th>
                </tr>
                <tr>
                    <td>Marca</td>
                    <td><jsp:getProperty name="vehiculo" property="marca"/></td>
                </tr>
                <tr>
                    <td>Modelo</td>
                    <td><jsp:getProperty name="vehiculo" property="modelo"/></td>
                </tr>
                <tr>
                    <td>Año</td>
                    <td><jsp:getProperty name="vehiculo" property="anio"/></td>
                </tr>
                <tr>
                    <td>Color</td>
                    <td><jsp:getProperty name="vehiculo" property="color"/></td>
                </tr>
                <tr>
                    <td>Combustible</td>
                    <td><jsp:getProperty name="vehiculo" property="combustible"/></td>
                </tr>
                <tr>
                    <td>Precio</td>
                    <td><jsp:getProperty name="vehiculo" property="precio"/></td>
                </tr>
                <tr>
                    <td>Disponible</td>
                    <td><jsp:getProperty name="vehiculo" property="disponible"/></td>
                </tr>
            </table>
            <hr>
            <a href="formulario.jsp"> Regresar </a>
        </main>

        <footer>
            <p><a href="https://www.unsij.edu.mx/web/">Universidad de la Sierra Juárez</a></p>
        </footer>
    </body>
</html>
