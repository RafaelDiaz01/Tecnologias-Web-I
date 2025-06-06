<%-- 
    Document   : verProducto
    Created on : 5 jun 2025, 10:40:40
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.unsij.modelo.Producto" %>
<jsp:useBean id="prod" class="com.unsij.modelo.Producto" scope="request"/>
<jsp:setProperty name="prod" property="nombre" value="Laptop"/>
<jsp:setProperty name="prod" property="descripcion" value="HP Victus"/>
<jsp:setProperty name="prod" property="precio" value="17000"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Producto</title>
    </head>
    <body>
        <h1>Datos del Producto</h1>

        <%--Acceso con tags (acciones)--%>
        Nombre: <jsp:getProperty name="prod" property="nombre"/> <br>
        Descripcion: <jsp:getProperty name="prod" property="descripcion"/> <br>
        Precio: $<jsp:getProperty name="prod" property="precio"/>

        <%--Acceso con scriptlet--%>
        <%
            Producto producto = (Producto) request.getAttribute("prod");
            if (producto != null) {
                double iva = producto.getPrecio() * 0.16;
                double total = producto.getPrecio() + iva;
        %>
        <p><b>IVA:</b>$<%=iva%></p>
        <p><b>Total con IVA:</b>$<%=total%></p>

        <%
            } else {
                out.println("No se encontró el producto");
            }
        %>
    </body>
</html>
