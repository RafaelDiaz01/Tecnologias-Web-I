<%-- 
    Document   : saludo
    Created on : 30 may 2025, 10:35:52
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acciones JSP</title>
        <link rel="stylesheet" href="estilos.css">
    </head>
    <body>

        <header>
            <h1>Tercer Parcial - Tecnologias Web I</h1>
        </header>

        <main>
            <%
                String nombre = request.getParameter("nombre");
            %>
            <h2>Hola, <%=nombre%></h2>
            <p><a href="index.jsp">Volver al Inicio</a></p>
        </main>

        <footer>
            <p><a href="https://www.unsij.edu.mx/web/">Universidad de la Sierra Juárez</a></p>
        </footer>

    </body>
</html>
