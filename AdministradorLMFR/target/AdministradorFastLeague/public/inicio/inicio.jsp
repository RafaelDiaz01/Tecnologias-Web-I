<%-- 
    Document   : inicio
    Created on : 30 may 2025, 15:53:46
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
        <link href="${pageContext.request.contextPath}/public/inicio/inicio.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/public/componentes/navbar.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/public/componentes/footer.css" rel="stylesheet" />
    </head>

    <body>

        <jsp:include page="/public/componentes/navbar.jsp"/> <!-- Header que contiene el logo, y el navbar -->

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
                <div class="div1">
                    <div class="fifa-card">
                        <!-- Sección superior con foto y datos básicos -->
                        <div class="player-header">
                            <div class="player-image">
                                <img src="${pageContext.request.contextPath}/public/assets/usuario.png" alt="alt"/>
                                <div class="player-rating">92</div>
                            </div>
                            <div class="player-info">
                                <c:if test="${not empty jugadores}">
                                    <div class="player-name">${jugadores[0].nombreJugador}</div>
                                    <div class="player-details">
                                        <span class="player-number">${jugadores[0].numeroDorsal}</span>
                                        <span class="player-team">${jugadores[0].sexo}</span>
                                        <span class="player-nationality">${jugadores[0].edad} años</span>
                                    </div>
                                </c:if>
                            </div>
                        </div>

                        <!-- Footer con logo y diseño -->
                        <div class="card-footer">
                            <div class="team-logo">
                                <img src="https://via.placeholder.com/40x40" alt="Team Logo">
                            </div>
                            <div class="fifa-badge">Ixtlán de Juárez</div>
                        </div>
                    </div>
                </div>

                <div class="div2">
                    <div class="fifa-card">
                        <!-- Sección superior con foto y datos básicos -->
                        <div class="player-header">
                            <div class="player-image">
                                <img src="${pageContext.request.contextPath}/public/assets/usuario.png" alt="alt"/>
                                <div class="player-rating">84</div>
                            </div>
                            <div class="player-info">
                                <c:if test="${not empty jugadores}">
                                    <div class="player-name">${jugadores[1].nombreJugador}</div>
                                    <div class="player-details">
                                        <span class="player-number">${jugadores[1].numeroDorsal}</span>
                                        <span class="player-team">${jugadores[1].sexo}</span>
                                        <span class="player-nationality">${jugadores[1].edad} años</span>
                                    </div>
                                </c:if>
                            </div>
                        </div>

                        <!-- Footer con logo y diseño -->
                        <div class="card-footer">
                            <div class="team-logo">
                                <img src="https://via.placeholder.com/40x40" alt="Team Logo">
                            </div>
                            <div class="fifa-badge">Ixtlán de Juárez</div>
                        </div>
                    </div>
                </div>

                <div class="div3"> 
                    <div class="fifa-card">
                        <!-- Sección superior con foto y datos básicos -->
                        <div class="player-header">
                            <div class="player-image">
                                <img src="${pageContext.request.contextPath}/public/assets/usuario.png" alt="alt"/>
                                <div class="player-rating">78</div>
                            </div>
                            <div class="player-info">
                                <c:if test="${not empty jugadores}">
                                    <div class="player-name">${jugadores[2].nombreJugador}</div>
                                    <div class="player-details">
                                        <span class="player-number">${jugadores[2].numeroDorsal}</span>
                                        <span class="player-team">${jugadores[2].sexo}</span>
                                        <span class="player-nationality">${jugadores[0].edad} años</span>
                                    </div>
                                </c:if>
                            </div>
                        </div>

                        <!-- Footer con logo y diseño -->
                        <div class="card-footer">
                            <div class="team-logo">
                                <img src="https://via.placeholder.com/40x40" alt="Team Logo">
                            </div>
                            <div class="fifa-badge">Ixtlán de Juárez</div>
                        </div>
                    </div>
                </div>
            </div>
        </main>

        <jsp:include page="../componentes/footer.jsp"/> <!-- Footer -->

    </body>
</html>
