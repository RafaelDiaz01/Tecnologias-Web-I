<%-- 
    Document   : partidos_vistaUsuario
    Created on : 11 jun 2025, 11:04:47
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Partidos</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=DM+Sans:ital,wght@0,400;0,500;0,700;1,400&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
        <link href="../componentes/navbar.css" rel="stylesheet" />
        <link href="../componentes/footer.css" rel="stylesheet" />
        <link href="partidos_vistaUsuario.css" rel="stylesheet" />
    </head>
    <body>
        <jsp:include page="../componentes/navbar.jsp"/>

        <main>
            <div class="parent">
                <div class="div1">
                    <h1 class="encabezado">Programación del Día</h1>
                    <div class="tabla-container">
                        <table>
                            <thead>
                                <tr>
                                    <th>Hora</th>
                                    <th>Equipo Local</th>
                                    <th></th>
                                    <th>Equipo Visitante</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>19:00</td>
                                    <td>La Trinidad</td>
                                    <td>vs</td>
                                    <td>Warriors</td>
                                </tr>
                                <tr>
                                    <td>19:40</td>
                                    <td>La Soledad</td>
                                    <td>vs</td>
                                    <td>Heroes</td>
                                </tr>
                                <tr>
                                    <td>20:15</td>
                                    <td>La Trinidad</td>
                                    <td>vs</td>
                                    <td>Real Yahuío</td>
                                </tr>
                                <tr>
                                    <td>20:50</td>
                                    <td>Beykers</td>
                                    <td>vs</td>
                                    <td>Cefor</td>
                                </tr>
                                <tr>
                                    <td>21:25</td>
                                    <td>Real Yahuío</td>
                                    <td>vs</td>
                                    <td>Napoli</td>
                                </tr>
                                <tr>
                                    <td>10:00</td>
                                    <td>Mototaxis</td>
                                    <td>vs</td>
                                    <td>Leñadores</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="div2">
                    <h2 class="actual">Partido Actual</h2>
                </div>
                <div class="div3">
                    <h2 class="marcador">Marcador</h2>
                </div>
            </div>
        </main>

        <jsp:include page="../componentes/footer.jsp"/>
    </body>
</html>
