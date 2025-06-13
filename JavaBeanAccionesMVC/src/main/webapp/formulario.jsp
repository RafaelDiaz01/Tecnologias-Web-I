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
        <link rel="stylesheet" href="estilos.css"/>
    </head>
    <body>

        <header>
            <h1>Tercer Parcial - Tecnologias Web I</h1>
        </header>

        <main>
            <h2>Formulario</h2>
            <form action="controlador" method="post">
                Nombre: <input type="text" name="nombre" class="form" required> <br>
                Edad: <input type="number" name="edad" class="form" required>
                <hr>
                <button type="submit">Enviar</button>
            </form>
        </main>

        <footer>
            <p><a href="https://www.unsij.edu.mx/web/">Universidad de la Sierra Juárez</a></p>
        </footer>
    </body>
</html>
