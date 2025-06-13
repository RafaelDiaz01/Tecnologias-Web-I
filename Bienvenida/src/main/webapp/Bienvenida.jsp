<%-- 
    Document   : Bienvenida.jsp
    Created on : 27 may 2025, 10:49:55
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.Date"%>
<!DOCTYPE html>

<%!
    int contadorVisitas = 0;

    public String saludoPersonalizado(String nombre) {
        return "Hola, " + nombre;
    }
%>

<%
    contadorVisitas++;
    String nombreUsuario = "Rafael";
    Date fecha = new Date();
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ciclo de Vida</title>
        <link rel="stylesheet" href="estilos.css"/>
    </head>
    <body>
        <header>
            <h1>Tercer Parcial - Tecnologias Web I</h1>
        </header>

        <main>
            <h2><%= saludoPersonalizado(nombreUsuario)%></h2>
            <p>Hoy es: <%=fecha.toString()%></p>
            <p>Has visitado esta pagina <%=contadorVisitas%> veces desde que se inicio el JSP.</p>
        </main>

        <footer>
            <p><a href="https://www.unsij.edu.mx/web/">Universidad de la Sierra Juárez</a></p>
        </footer>
    </body>
</html>
