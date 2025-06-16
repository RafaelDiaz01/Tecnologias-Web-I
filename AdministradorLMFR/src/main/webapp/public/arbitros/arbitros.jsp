<%-- 
    Document   : jugadores
    Created on : 15 jun 2025, 15:19:01
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Árbitros</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=DM+Sans:ital,wght@0,400;0,500;0,700;1,400&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
        <link href="${pageContext.request.contextPath}/public/componentes/navbar.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/public/componentes/footer.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/public/jugadores/jugadores.css" rel="stylesheet" />
    </head>
    <body>
        <jsp:include page="/public/componentes/navbar.jsp"/>
        <main>
            <div class="buscador">
                <h1>Arbitros de la Liga</h1>
            </div>                        
            <div class="tabla-container">
                <table>

                    <tr>
                        <th>Nombre del Árbitro</th>
                        <th>Edad</th>
                        <th>Sexo</th>
                    </tr>

                    <c:forEach var="u" items="${arbitros}">
                        <tr>
                            <td>${u.nombreCompleto}</td>
                            <td>${u.edad}</td>
                            <td>${u.sexo}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </main>

        <jsp:include page="/public/componentes/footer.jsp"/>
    </body>
</html>
