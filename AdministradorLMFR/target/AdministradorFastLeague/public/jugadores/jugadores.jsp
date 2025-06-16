<%-- 
    Document   : jugadores
    Created on : 15 jun 2025, 15:19:01
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jugadores</title>
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
                <h1>Jugadores de la Liga</h1>
            </div>                        
            <div class="tabla-container">
                <table>
                    <thead>
                        <tr>
                            <th>Nombre del Jugador</th>
                            <th>Número Dorsal</th>
                            <th>Equipo</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>${u.nombreJugador}</td> 
                            <td>${u.numeroDorsal}</td>
                            <td>Warriors</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </main>

        <jsp:include page="/public/componentes/footer.jsp"/>
    </body>
</html>
