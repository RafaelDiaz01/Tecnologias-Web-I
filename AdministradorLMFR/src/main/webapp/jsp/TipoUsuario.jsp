<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Fast League</title>
        <link rel="stylesheet" href="../css/estilos.css" />
    </head>
    <body>
        <h2>Tipo de Usuarios</h2>
        <a href="jsp/AgregarTipoUsuario.jsp">New user</a>
        <table>
            <tr><th>ID</th><th>Tipo</th><th>Descripcion</th><th>Acciones</th></tr>
                    <c:forEach var="u" items="${usuarios}">
                <tr>
                    <td>${u.idTipoUsuario}</td>  <!-- Usa el nombre exacto de la propiedad -->
                    <td>${u.tipo}</td>
                    <td>${u.descripcion}</td>
                    <td>
                        <a href="usuarios?action=editar&id=${u.idTipoUsuario}">Editar</a>
                        <a href="usuarios?action=eliminar&id=${u.idTipoUsuario}" onclick="return confirm('¿Eliminar?')">Eliminar</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
