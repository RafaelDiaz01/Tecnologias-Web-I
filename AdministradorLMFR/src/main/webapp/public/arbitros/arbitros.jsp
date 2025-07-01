<%-- 
    Document   : jugadores
    Created on : 15 jun 2025, 15:19:01
    Author     : rafaeldiaz
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="arbitro" class="com.unsij.beans.Arbitro" scope="request"/>

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
        <link href="${pageContext.request.contextPath}/public/arbitros/arbitros.css" rel="stylesheet" />
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
                            <h1>Árbitros</h1>
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
                            <th>Nombre</th>
                            <th>Edad</th>
                            <th>Sexo</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="arbitro" items="${arbitros}">
                            <tr>
                                <td>${arbitro.nombreCompleto}</td>
                                <td>${arbitro.edad}</td>
                                <td>${arbitro.sexo}</td>
                                <td>
                                    <button class="action-btn edit-btn" 
                                            onclick="openEditForm(${arbitro.idArbitro}, '${arbitro.nombreCompleto}', '${arbitro.edad}', '${arbitro.sexo}')">
                                        <img src="${pageContext.request.contextPath}/public/assets/editar.png" 
                                             class="action-icon" 
                                             alt="Editar" 
                                             aria-label="Editar árbitro">
                                    </button>
                                    <button class="action-btn delete-btn" 
                                            data-id="${arbitro.idArbitro}" 
                                            data-nombre="${arbitro.nombreCompleto}">
                                        <img src="${pageContext.request.contextPath}/public/assets/borrar.png" 
                                             class="action-icon" 
                                             alt="Eliminar" 
                                             aria-label="Eliminar árbitro">
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
                        <h2>${empty arbitro.idArbitro ? "Registrar Nuevo" : "Editar"} Árbitro</h2>                        
                    </div>

                    <form action="${pageContext.request.contextPath}/arbitros" method="POST">
                        <input type="hidden" name="id" value="${empty arbitro.idArbitro ? '' : arbitro.idArbitro}">

                        <div class="form-group">
                            <label for="nombre">Nombre Completo</label>
                            <input type="text" id="nombre" name="nombre" class="form-control" 
                                   value="${empty arbitro.nombreCompleto ? '' : arbitro.nombreCompleto}" 
                                   placeholder="Ej: Carlos Alberto Torres" required>
                        </div>

                        <div class="form-group">
                            <label for="edad">Edad</label>
                            <input type="number" id="edad" name="edad" class="form-control" 
                                   value="${empty arbitro.edad ? '' : arbitro.edad}"
                                   min="18" max="70" placeholder="30" required>
                        </div>

                        <div class="form-group">
                            <label>Sexo</label>
                            <div class="radio-group">
                                <label class="radio-option">
                                    <input type="radio" name="sexo" value="Masculino" 
                                           ${arbitro.sexo eq 'Masculino' ? 'checked' : ''} required> Masculino
                                </label>
                                <label class="radio-option">
                                    <input type="radio" name="sexo" value="Femenino"
                                           ${arbitro.sexo eq 'Femenino' ? 'checked' : ''}> Femenino
                                </label>
                                <label class="radio-option">
                                    <input type="radio" name="sexo" value="Otro"
                                           ${arbitro.sexo eq 'Otro' ? 'checked' : ''}> Otro
                                </label>
                            </div>
                        </div>

                        <button type="submit" class="btn-submit">
                            ${empty arbitro.idArbitro ? "Registrar" : "Actualizar"} Árbitro
                        </button>
                    </form>
                </div>
            </div>
        </main>

        <jsp:include page="/public/componentes/footer.jsp"/>
        <script>
            const pageContext = '${pageContext.request.contextPath}';
        </script>
        <script src="${pageContext.request.contextPath}/public/arbitros/arbitros.js"></script>
    </body>
</html>
