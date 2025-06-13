<%-- 
    Document   : Tags
    Created on : 5 may 2025, 10:23:42
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<%-- 
    Pagina HTML para mostrar el catalogo de productos
--%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi Primer JSP</title>
        <link rel="stylesheet" href="estilos.css"/>
    </head>
    <body>
        <header>
            <h1>Tercer Parcial - Tecnologias Web I</h1>
        </header>

        <main>
            <h2>Ejemplo Scripts</h2>
            <%
                String titulo = "Lista de Productos";
                List<String> catalogo = new ArrayList();
                catalogo.add("Laptop");
                catalogo.add("Impresora");
                catalogo.add("Escaner");
            %>
            <h2><%=titulo%></h2>

            <select name="producto" multiple>
                <%
                    for (String producto : catalogo) {
                        out.print("<option>" + producto + "</option>");
                    }
                %>
            </select>

            <ol>
                <%
                    for (String producto : catalogo) {
                        out.print("<li>" + producto + "</li>");
                    }
                %>
            </ol>
        </main>

        <footer>
            <p><a href="https://www.unsij.edu.mx/web/">Universidad de la Sierra Juárez</a></p>
        </footer>
    </body>
</html>
