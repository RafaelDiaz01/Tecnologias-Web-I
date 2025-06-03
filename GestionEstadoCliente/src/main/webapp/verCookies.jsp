<%-- 
    Document   : verCookies
    Created on : 30 abr 2025, 10:47:11
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Cookies</title>
    </head>
    <body>
        <h2>Cookies recibidas:</h2>
        <%
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie c : cookies) {
                    out.println("Nombre: " + c.getName() + "<br>");
                    out.println("Valor: " + c.getValue() + "<br>");
                }
            } else {
                out.println("No hay cookies.");
            }
        %>
    </body>
</html>
