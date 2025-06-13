<%-- 
    Document   : formulario
    Created on : 9 jun 2025, 10:54:55
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="estilos.css"/>
    </head>
    <body>
        <header>
            <h1>Tercer Parcial - Tecnologias Web I</h1>
        </header>

        <main>
            <h2>Registrar Vehiculo</h2>
            <form action="RegistroVehiculoServlet" method="post">
                Marca: <input type="text" name="marca" class="form" required> <br>
                Modelo: <input type="text" name="modelo" class="form"  required> <br>
                Año: <input type="text" name="anio"  class="form" required> <br>
                Color: <input type="text" name="color"  class="form" required> <br>
                Combustible: <select name="combustible"> 
                    <option>Gasolina</option>
                    <option>Diesel</option>
                    <option>Electrico</option>
                </select> <br>
                Precio: <input type="text" name="precio"  class="form" required> <br>
                Disponible: <input type="checkbox" name="disponible"  class="form" required> <br>
                <input type="submit" value="Enviar" id="boton"><!-- comment -->
            </form>
        </main>

        <footer>
            <p><a href="https://www.unsij.edu.mx/web/">Universidad de la Sierra Juárez</a></p>
        </footer>
    </body>
</html>
