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
        <link rel="stylesheet" href="estilos.css"/>
    </head>
    <body>
        <header>
            <h1>Tercer Parcial - Tecnologias Web I</h1>
        </header>

        <main>
            <h2>Datos Recibidos</h2>
            <form action="controlador" method="post">
                Nombre: <jsp:getProperty name="persona" property="nombre"/> <br>
                Edad: <jsp:getProperty name="persona" property="edad"/>
            </form>
        </main>

        <footer>
            <p><a href="https://www.unsij.edu.mx/web/">Universidad de la Sierra Juárez</a></p>
        </footer>
    </body>
</html>
