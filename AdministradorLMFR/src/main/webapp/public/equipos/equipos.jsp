<%-- 
    Document   : jugadores
    Created on : 15 jun 2025, 15:19:01
    Author     : rafaeldiaz
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="equipo" class="com.unsij.beans.Equipo" scope="request"/>

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
        <link href="${pageContext.request.contextPath}/public/componentes/estilos_generales.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    </head>
    <body>
        <jsp:include page="/public/componentes/navbar.jsp"/>
        <main>
            <div class="container">
                <div class="sport-pattern-header">
                    <div class="titleAdd">
                        <button class="inline-add-btn" id="toggleFormBtn">+</button>
                        <div class="title-container">             
                            <h1>Equipos</h1>
                            <p class="subtitle">de la Liga Municipal</p>
                        </div>
                    </div>

                    <div class="search-bar">
                        <i class="fas fa-search"></i>
                        <input type="text" placeholder="Buscar equipo" id="searchInput">
                    </div>
                </div>

                <table class="players-table">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Total de Jugadores</th>
                            <th>Procedencia</th>
                            <th>Capitán</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="equipo" items="${equipos}">
                            <tr>
                                <td>${equipo.nombreEquipo}</td>
                                <td>${equipo.totalJugadores}</td>
                                <td>${equipo.procedencia}</td>
                                <td>${equipo.capitan}</td>
                                <td>
                                    <button class="action-btn edit-btn" 
                                            onclick="openEditForm(${equipo.idEquipo}, '${equipo.nombreEquipo}', '${equipo.totalJugadores}', '${equipo.procedencia}', '${equipo.capitan}')">
                                        <img src="${pageContext.request.contextPath}/public/assets/editar.png" 
                                             class="action-icon" 
                                             alt="Editar" 
                                             aria-label="Editar equipo">
                                    </button>
                                    <button class="action-btn delete-btn" 
                                            data-id="${equipo.idEquipo}" 
                                            data-nombre="${equipo.nombreEquipo}">
                                        <img src="${pageContext.request.contextPath}/public/assets/borrar.png" 
                                             class="action-icon" 
                                             alt="Eliminar" 
                                             aria-label="Eliminar equipo">
                                    </button>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>

            <!-- Fondo oscuro (inicialmente oculto) -->
            <div id="modalBackdrop" class="modal-backdrop"></div>

            <div id="formModal" class="modal-container">
                <div class="modal-content">
                    <span class="close-modal">&times;</span>
                    <div class="form-header">
                        <div class="form-icon">
                            <img src="${pageContext.request.contextPath}/public/assets/silbato.png" alt="Imagen de silbato">
                        </div>
                        <h2>${empty equipo.idEquipo ? "Registrar Nuevo" : "Editar"} Equipo</h2>                        
                    </div>

                    <form action="${pageContext.request.contextPath}/equipos" method="POST">
                        <input type="hidden" name="id" value="${empty equipo.idEquipo ? '' : equipo.idEquipo}">

                        <div class="form-group">
                            <label for="nombre">Nombre</label>
                            <input type="text" id="nombre" name="nombre" class="form-control" 
                                   value="${empty equipo.nombreEquipo ? '' : equipo.nombreEquipo}" 
                                   placeholder="Ej: Cefor" required>
                        </div>

                        <div class="form-group">
                            <label for="numJugadores">Número de Jugadores</label>
                            <input type="number" id="numJugadores" name="numJugadores" class="form-control" 
                                   value="${empty equipo.totalJugadores ? '' : equipo.totalJugadores}"
                                   min="6" max="12" placeholder="7" required>
                        </div>

                        <div class="form-group">
                            <label for="procedencia">Procedencia</label>
                            <input type="text" id="procedencia" name="procedencia" class="form-control" 
                                   value="${empty equipo.procedencia ? '' : equipo.procedencia}" 
                                   placeholder="Ej: Ixtlán de Juárez" required>
                        </div>

                        <div class="form-group">
                            <label for="capitan">Capitán</label>
                            <input type="text" id="capitan" name="capitan" class="form-control" 
                                   value="${empty equipo.capitan ? '' : equipo.capitan}" 
                                   placeholder="Ej: David Cortéz Cruz" required>
                        </div>           

                        <button type="submit" class="btn-submit">
                            ${empty equipo.idEquipo ? "Registrar" : "Actualizar"} Equipo
                        </button>
                    </form>
                </div>
            </div>
        </main>

        <jsp:include page="/public/componentes/footer.jsp"/>
        <script>
            const pageContext = '${pageContext.request.contextPath}';
        </script>
        <script src="${pageContext.request.contextPath}/public/equipos/equipos.js"></script>
    </body>
</html>
