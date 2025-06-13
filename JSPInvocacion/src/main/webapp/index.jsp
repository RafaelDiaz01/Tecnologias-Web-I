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
        <title>Acciones JSP</title>
        <link rel="stylesheet" href="estilos.css">
    </head>
    <body>

        <header>
            <h1>Tercer Parcial - Tecnologias Web I</h1>
        </header>

        <main>
            <form action="saludo.jsp" method="get">
                <div class="centrar">
                    <label for="nombre">Escribe tu nombre:</label>
                    <input type="text" name="nombre" id="nombre" required />
                    <input type="submit" value="Saludar" id="boton"/>
                </div>
            </form>
        </main>

        <footer>
            <p><a href="https://www.unsij.edu.mx/web/">Universidad de la Sierra Juárez</a></p>
        </footer>

    </body>
</html>
