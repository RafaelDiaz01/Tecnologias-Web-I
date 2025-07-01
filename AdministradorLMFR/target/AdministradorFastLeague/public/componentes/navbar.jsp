<%-- 
    Document   : navbar
    Created on : 3 jun 2025, 15:34:36
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <div class="header-left">
        <div class="logo-left">
            <a href="http://localhost:8181/AdministradorLMFR/inicio"> <img src="${pageContext.request.contextPath}/public/assets/logoIxtlan.png" alt="Logo Ixtlán"> </a>
        </div>
        <div class="title">
            <h1> <a href="http://localhost:8181/AdministradorLMFR/inicio">Sistema de Gestión Fast League</a></h1>
        </div>
    </div>
    <nav class="menu-buttons">
        <button onclick="location.href = '${pageContext.request.contextPath}/public/partidos/partidos.jsp'">Partidos</button>
        <button onclick="location.href = 'http://localhost:8181/AdministradorLMFR/jugadores'">Jugadores</button>
        <button onclick="location.href = '${pageContext.request.contextPath}/public/partidos/partidos_vistaUsuario.jsp'">Tabla de Puntos</button>
        <div class="dropdown">
            <button class="dropdown-btn">Otros</button>
            <div class="dropdown-content">
                <a href="http://localhost:8181/AdministradorLMFR/equipos">Equipos</a>
                <a href="http://localhost:8181/AdministradorLMFR/jugadores">Tabla de Goleo</a>
                <a href="#">Temporadas</a>
                <a href="${pageContext.request.contextPath}/public/categorias/categorias.jsp">Categorias</a>
                <a href="http://localhost:8181/AdministradorLMFR/arbitros">Arbitros</a>
                <a href="#">Ajustes</a>
                <a id="cerrar_sesion">Cerrar Sesión</a>
            </div>
        </div>
    </nav>  
</header>