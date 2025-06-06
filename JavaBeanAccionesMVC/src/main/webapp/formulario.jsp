<%-- 
    Document   : formulario
    Created on : 4 jun 2025, 10:11:31
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>Formulario JSP</h1>
        <% if (request.getParameter("error") != null) { %>
        <p style="color: red;">Por favor complete todos los campos correctamente.</p>
        <% }%>
        <form action="controlador" method="post">
            Nombre: <input type="text" name="nombre">
            Edad: <input type="number" name="edad">
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
