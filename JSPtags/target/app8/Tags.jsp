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
    </head>
    <body>
        <h1>Ejemplo Scripts</h1>
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
                for (String producto : catalogo){
                    out.print("<option>" + producto + "</option>");
                }
            %>
        </select>
        
        <ol>
            <% 
                for (String producto : catalogo){
                    out.print("<li>" + producto + "</li>");
                }
            %>
        </ol>
    </body>
</html>
