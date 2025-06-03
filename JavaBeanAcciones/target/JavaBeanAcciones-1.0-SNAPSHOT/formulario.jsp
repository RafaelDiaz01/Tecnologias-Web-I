<%-- 
    Document   : formulario
    Created on : 2 jun 2025, 10:31:41
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario JSP</title>
    </head>
    <body>
        <h2>Formulario de Usuario</h2>
        <form action="procesar.jsp" method="post">
            Nombre: <input type="text" name="nombre"><br>
            Correo: <input type="text" name="correo"> <br>
            <input type="submit" value="enviar">
        </form>
    </body>
</html>
