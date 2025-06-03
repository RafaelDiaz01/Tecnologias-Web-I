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
        <title>Saludo</title>
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>
        <div>
            <header>
                <%
                    String nombre = request.getParameter("nombre");
                %>
                <h1>Hola, <%=nombre%></h1>
            </header>

            <main>
                <p><a href="index.jsp">Volver al Inicio</a></p>
            </main>

            <footer>
                <jsp:include page="footer.jsp"/>
            </footer>
        </div>
    </body>
</html>
