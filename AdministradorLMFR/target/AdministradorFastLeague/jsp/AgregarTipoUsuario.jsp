<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="usuario" class="com.unsij.beans.TipoUsuario" scope="request"/>
<html>
<head>
    <title>Fast League - Agregar Usuario</title>
    <link rel="stylesheet" href="../css/estilos.css" />
</head>
<body>
    <h2>${usuario.idTipoUsuario > 0 ? "Editar" : "Nuevo"} Usuario</h2>
    <form method="post" action="${pageContext.request.contextPath}/usuarios">
        <input type="hidden" name="id" value="${usuario.idTipoUsuario}" />
        Tipo: <input type="text" name="tipo" value="${usuario.tipo}" required />
        Descripcion: <input type="text" name="descripcion" value="${usuario.descripcion}" required />
        <input type="submit" value="Guardar" />
    </form>
</body>
</html>
