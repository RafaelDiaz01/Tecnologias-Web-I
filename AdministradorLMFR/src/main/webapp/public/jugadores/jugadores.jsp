<%-- 
    Document   : jugadores
    Created on : 15 jun 2025, 15:19:01
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="jugador" class="com.unsij.beans.Jugador" scope="request"/>

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
        <link href="${pageContext.request.contextPath}/public/componentes/estilos_generales.css" rel="stylesheet" />
    </head>
    <body>
        <jsp:include page="/public/componentes/navbar.jsp"/>
        <main>
            <div class="container">
                <div class="sport-pattern-header">
                    <div class="titleAdd">
                        <button class="inline-add-btn" id="toggleFormBtn">+</button>
                        <div class="title-container">             
                            <h1>Jugadores</h1>
                            <p class="subtitle">de la Liga Municipal</p>
                        </div>
                    </div>

                    <div class="search-bar">
                        <i class="fas fa-search"></i>
                        <input type="text" placeholder="Buscar jugador" id="searchInput">
                    </div>
                </div>

                <table class="players-table">
                    <thead>
                        <tr>
                            <th>Nombre del Jugador</th>
                            <th>Edad</th>
                            <th>Número Dorsal</th>
                            <th>Equipo</th>
                            <th>Sexo</th>
                            <th>Opciones</th>
                        </tr>
                    </thead>

                    <tboby>
                        <c:forEach var="u" items="${jugadores}">
                            <tr>
                                <td>${u.nombreJugador}</td>
                                <td>${u.edad}</td>
                                <td>
                                    <div style="position: relative; display: inline-block; text-align: center;">
                                        <img src="${pageContext.request.contextPath}/public/assets/playera.png" 
                                             style="width: 40px; height: 40px;">
                                        <div style="
                                             position: absolute;
                                             top: 50%;
                                             left: 50%;
                                             transform: translate(-50%, -50%);
                                             color: black;
                                             font-weight: bold;
                                             font-size: 16px;
                                             ">
                                            ${u.numeroDorsal}
                                        </div>
                                    </div>
                                </td>

                                <td>${u.equipo.nombreEquipo}</td>
                                <td>${u.sexo}</td>
                                <td>
                                    <button class="action-btn edit-btn" 
                                            onclick="openEditForm(${u.idJugador}, '${u.nombreJugador}', '${u.edad}',
                                                            '${u.sexo}', '${u.numeroDorsal}', '${u.equipo.idEquipo}')">
                                        <img src="${pageContext.request.contextPath}/public/assets/editar.png" 
                                             class="action-icon" 
                                             alt="Editar" 
                                             aria-label="Editar árbitro">
                                    </button>
                                    <button class="action-btn delete-btn" 
                                            data-id="${u.idJugador}" 
                                            data-nombre="${u.nombreJugador}">
                                        <img src="${pageContext.request.contextPath}/public/assets/borrar.png" 
                                             class="action-icon" 
                                             alt="Eliminar" 
                                             aria-label="Eliminar árbitro">
                                    </button>
                                </td>
                            </tr>
                        </c:forEach>
                    </tboby>
                </table>
            </div>

            <!-- Fondo oscuro (inicialmente oculto) -->
            <div id="modalBackdrop" class="modal-backdrop"></div>

            <div id="formModal" class="modal-container">
                <div class="modal-content">
                    <span class="close-modal">&times;</span>
                    <div class="form-header">
                        <div class="form-icon">
                            <img src="${pageContext.request.contextPath}/public/assets/jugador.png" alt="Jugador">
                        </div>
                        <h2>${empty u.idJugador ? "Registrar Nuevo" : "Editar"} Jugador</h2>
                    </div>

                    <form action="${pageContext.request.contextPath}/jugadores" method="POST">
                        <input type="hidden" name="id" value="${empty jugador.idJugador ? '' : jugador.idJugador}">

                        <div class="form-group">
                            <label for="nombre">Nombre Completo</label>
                            <input type="text" id="nombre" name="nombre" class="form-control" 
                                   value="${empty jugador.nombreJugador ? '' : jugador.nombreJugador}" 
                                   placeholder="Ej: Carlos Alberto Torres" required>
                        </div>

                        <div class="form-group">
                            <label for="edad">Edad</label>
                            <input type="number" id="edad" name="edad" class="form-control" 
                                   value="${empty jugador.edad ? '' : jugador.edad}"
                                   min="10" max="70" placeholder="20" required>
                        </div>

                        <div class="form-group">
                            <label for="numeroDorsal">Número Dorsal</label>
                            <input type="number" id="numeroDorsal" name="numeroDorsal" class="form-control" 
                                   value="${empty jugador.numeroDorsal ? '' : jugador.numeroDorsal}"
                                   min="0" placeholder="7" required>
                        </div>

                        <div class="form-group">
                            <label for="equipo">Equipo</label>
                            <select class="form-control" id="idEquipo" name="idEquipo" required>
                                <option value="">Seleccione un equipo</option>
                                <c:forEach var="equipo" items="${equipos}">
                                    <option value="${equipo.idEquipo}" 
                                            ${jugador != null && jugador.equipo.idEquipo == equipo.idEquipo ? 'selected' : ''}>
                                        ${equipo.nombreEquipo}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Sexo</label>
                            <div class="radio-group">
                                <label class="radio-option">
                                    <input type="radio" name="sexo" value="Masculino" 
                                           ${jugador.sexo eq 'Masculino' ? 'checked' : ''} required> Masculino
                                </label>
                                <label class="radio-option">
                                    <input type="radio" name="sexo" value="Femenino"
                                           ${jugador.sexo eq 'Femenino' ? 'checked' : ''}> Femenino
                                </label>
                                <label class="radio-option">
                                    <input type="radio" name="sexo" value="Otro"
                                           ${jugador.sexo eq 'Otro' ? 'checked' : ''}> Otro
                                </label>
                            </div>
                        </div>

                        <button type="submit" class="btn-submit">
                            ${empty jugador.idJugador ? "Registrar" : "Actualizar"} Jugador
                        </button>
                    </form>
                </div>
            </div> 
        </main>

        <jsp:include page="/public/componentes/footer.jsp"/>
        <script>
            // Define la variable global antes de cargar el script
            const pageContext = '${pageContext.request.contextPath}';
        </script>
        <script src="${pageContext.request.contextPath}/public/jugadores/jugadores.js"></script>
    </body>
</html>
