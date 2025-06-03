<%-- 
    Document   : success
    Created on : 6 may 2025, 10:46:05
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenida</title>
    </head>
    <body>
        <!-- 7. Mostramos vista al usuario. Aqui por lo general hacemos uso de los objetos que fueron compartidos por el Controller-->
        <h1>Bienvenido ${user.name}</h1>
        <table border="1">
            <tr>
                <th coldspan="2">Datos del Usuario</th>
            </tr>
            <tr>
                <td>Nombre:</td> <td>${user.name}</td>
            </tr>
            <tr>
                <td>Apellido:</td> <td>${user.apellido}</td>
            </tr>
            <tr>
                <td>Edad:</td> <td>${user.edad}</td>
            </tr>
        </table>
    </body>
</html>
