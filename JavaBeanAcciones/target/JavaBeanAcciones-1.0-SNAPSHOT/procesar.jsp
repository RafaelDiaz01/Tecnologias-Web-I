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
        <title>JavaBeans Acciones</title>
        <link rel="stylesheet" href="estilos.css"/>
    </head>
    <body>
        <header>
            <h1>Tercer Parcial - Tecnologias Web I</h1>
        </header>

        <main>
            <h2>Datos del Usuario</h2>
            <form action="procesar.jsp" method="post">
                Nombre: <jsp:getProperty name="miBean" property="nombre" /> <br>
                Correo: <jsp:getProperty  name="miBean" property="correo" />
                <hr>
            </form>
        </main>

        <footer>
            <p><a href="https://www.unsij.edu.mx/web/">Universidad de la Sierra Juárez</a></p>
        </footer>
    </body>
</html>
