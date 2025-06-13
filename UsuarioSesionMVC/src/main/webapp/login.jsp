<%-- 
    Document   : login
    Created on : 13 jun 2025, 10:11:19
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="LoginServlet">
            <input name="email" placeholder="Email" required /> <br>
            <input name="password" type="password" placeholder="Contraseña" required /> <br>
            <hr>
            <button>Iniciar Sesión</button>
        </form>
        <div>
            <a href="register.jsp">¿No tienes cuenta? Registrate Aquí</a>
        </div>
    </body>
</html>
