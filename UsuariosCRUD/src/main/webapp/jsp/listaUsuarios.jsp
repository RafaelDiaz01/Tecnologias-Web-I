<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Usuarios</title>
    <link rel="stylesheet" href="../css/estilos.css" />
</head>
<body>
    <h2>Lista de Usuarios</h2>
    <a href="jsp/formularioUsuario.jsp">+ Nuevo Usuario</a>
    <table>
        <tr><th>ID</th><th>Nombre</th><th>Correo</th><th>Acciones</th></tr>
        <c:forEach var="u" items="${usuarios}">
            <tr>
                <td>${u.id}</td>
                <td>${u.nombre}</td>
                <td>${u.correo}</td>
                <td>
                    <a href="usuarios?action=editar&id=${u.id}">Editar</a>
                    <a href="usuarios?action=eliminar&id=${u.id}" onclick="return confirm('¿Eliminar?')">Eliminar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
