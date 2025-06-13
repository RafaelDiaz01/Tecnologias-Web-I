<%-- 
    Document   : register
    Created on : 13 jun 2025, 10:15:48
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Registrate!</h1>
        <form method="post" action="RegisterServlet">
            Nombre: <input name="nombre" required>
            Email: <input name="email" required>
            Contraseña: <input name="password" type="password" required> 
            <button>Registrar</button>
        </form>
        <hr>
        <a href="login.jsp">Ir a iniciar sesión</a>
    </body>
</html>
