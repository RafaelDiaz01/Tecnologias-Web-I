<%-- 
    Document   : navbar
    Created on : 3 jun 2025, 15:34:36
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <div class="header-left">
        <div class="logo-left">
            <a href="${pageContext.request.contextPath}/public/inicio/inicio.jsp"> <img src="${pageContext.request.contextPath}/public/assets/logoIxtlan.png" alt="Logo Ixtlán"> </a>
        </div>
        <div class="title">
            <h1>Sistema de Gestión Fast League</h1>
        </div>
    </div>
    <nav class="menu-buttons">
        <button onclick="location.href = '${pageContext.request.contextPath}/public/partidos/partidos.jsp'">Partidos</button>
        <button onclick="location.href = '${pageContext.request.contextPath}/public/partidos/partidos_vistaUsuario.jsp'">Jugadores</button>
        <button onclick="location.href = './usuarios'">Tabla de Puntos</button>
        <div class="dropdown">
            <button class="dropdown-btn">Otros</button>
            <div class="dropdown-content">
                <a href="../partidos/plantilla.jsp">Equipos</a>
                <a href="http://localhost:8080/AdministradorLMFR/jugadores">Tabla de Goleo</a>
                <a href="#">Temporadas</a>
                <a href="#">Categorias</a>
                <a href="http://localhost:8080/AdministradorLMFR/arbitros">Arbitros</a>
                <a href="#">Ajustes</a>
                <a id="cerrar_sesion">Cerrar Sesión</a>
            </div>
        </div>
    </nav>  
</header>