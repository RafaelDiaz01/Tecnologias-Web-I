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
    </head>
    <body>
        <h1>Registrar Vehiculo</h1>
        <form action="RegistroVehiculoServlet" method="post">
            Marca: <input type="text" name="marca" required> <br>
            Modelo: <input type="text" name="modelo" required> <br>
            Año: <input type="text" name="anio" required> <br>
            Color: <input type="text" name="color" required> <br>
            Combustible: <select name="combustible"> 
                <option>Gasolina</option>
                <option>Diesel</option>
                <option>Electrico</option>
            </select> <br>
            Precio: <input type="text" name="precio" required> <br>
            Disponible: <input type="checkbox" name="disponible" required> <br>
            <input type="submit" value="Enviar"><!-- comment -->
        </form>
    </body>
</html>
