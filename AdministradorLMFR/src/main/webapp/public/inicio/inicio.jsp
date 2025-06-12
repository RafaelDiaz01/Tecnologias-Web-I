<%-- 
    Document   : inicio
    Created on : 30 may 2025, 15:53:46
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=DM+Sans:ital,wght@0,400;0,500;0,700;1,400&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
        <link href="inicio.css" rel="stylesheet">
        <link href="../componentes/navbar.css" rel="stylesheet" />
        <link href="../componentes/footer.css" rel="stylesheet" />
    </head>

    <body>

        <jsp:include page="../componentes/navbar.jsp"/> <!-- Header que contiene el logo, y el navbar -->

        <main>
            <div class="image">
                <h1>Fast League</h1>
            </div>

            <br>
            <hr>

            <!-- Seccion para ver los próximos partidos -->
            <div class="seccion">
                <h2>Proximos Partidos</h2> 
                <div class="botonesPartidos">
                    <button>Varonil Libre</button>
                    <button>Femenil Libre</button>
                    <button>Veteranos</button>
                </div>
            </div>

            <div class="proxPartidos">
                <table class="partido">
                    <tr id="fecha">
                        <td>Fecha</td>
                    </tr>
                    <tr>
                        <td>Partido 1</td>
                    </tr>
                    <tr>
                        <td>Cancha Municipal de Fútbol Rápido</td>
                    </tr>
                </table>

                <table class="partido">
                    <tr id="fecha">
                        <td>Fecha</td>
                    </tr>
                    <tr>
                        <td>Partido 1</td>
                    </tr>
                    <tr>
                        <td>Cancha Municipal de Fútbol Rápido</td>
                    </tr>
                </table>

                <table class="partido">
                    <tr id="fecha">
                        <td>Fecha</td>
                    </tr>
                    <tr>
                        <td>Partido 1</td>
                    </tr>
                    <tr>
                        <td>Cancha Municipal de Fútbol Rápido</td>
                    </tr>
                </table>
            </div>

            <!-- Apartado para mostrar los lideres el torneo -->

            <div class="seccion">
                <h2>Líderes del Torneo</h2> 
                <div class="botonesPartidos">
                    <button>Varonil Libre</button>
                    <button>Femenil Libre</button>
                    <button>Veteranos</button>
                </div>
            </div>


            <div class="parent">
                <div class="div1">Goles</div>
                <div class="div2">Disparos</div>
                <div class="div3">Pases</div>
                <div class="div4">Regates</div>
                <div class="div5">Atajadas</div>
                <div class="div6">Asistencias</div>
            </div>

        </main>

        <jsp:include page="../componentes/footer.jsp"/> <!-- Footer -->

    </body>
</html>
