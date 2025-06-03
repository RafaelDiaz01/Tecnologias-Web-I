<%-- 
    Document   : saludo
    Created on : 30 may 2025, 10:23:22
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>
        <div>
            <header>
                <h1>Bienvenido!</h1>
            </header>

            <main>
                <form action="saludo.jsp" method="get">
                    <label for="nombre">Escribe tu nombre:</label>
                    <input type="text" name="nombre" id="nombre" required />
                    <input type="submit" value="Saludar" />
                </form>
            </main>

            <jsp:include page="footer.jsp"/>
        </div>
    </body>
</html>
