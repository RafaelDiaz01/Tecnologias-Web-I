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
        <title>JavaBeans Acciones</title>
        <link rel="stylesheet" href="estilos.css"/>
    </head>
    <body>
        <header>
            <h1>Tercer Parcial - Tecnologias Web I</h1>
        </header>

        <main>
            <h2>Formulario de Usuario</h2>
            <form action="procesar.jsp" method="post">
                Nombre: <input type="text" name="nombre" class="form" required><br>
                Correo: <input type="text" name="correo" class="form" required> <br>
                <hr>
                <input type="submit" value="Enviar" id="boton">
            </form>
        </main>
        
        <footer>
            <p><a href="https://www.unsij.edu.mx/web/">Universidad de la Sierra Juárez</a></p>
        </footer>
    </body>
</html>
