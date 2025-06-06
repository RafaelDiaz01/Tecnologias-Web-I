<%-- 
    Document   : navbar
    Created on : 3 jun 2025, 15:34:36
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <div class="header-left">
        <div class="logo-left">
            <img src="../assets/logoIxtlan.png" alt="Logo Ixtlán">
        </div>
        <div class="title">
            <h1>Ixtlán de Juárez, Oax.</h1>
        </div>
    </div>
    <nav class="menu-buttons">
        <button onclick="location.href = 'inicio.jsp'">Inicio</button>
        <button onclick="location.href = '../partidos/partidos.jsp'">Partidos</button>
        <button onclick="location.href = './usuarios'">Jugadores</button>
        <div class="dropdown">
            <button class="dropdown-btn">Otros</button>
            <div class="dropdown-content">
                <a href="#">Equipos</a>
                <a href="#">Tabla de Goleo</a>
                <a href="#">Temporadas</a>
                <a href="#">Categorias</a>
                <a href="#">Arbitros</a>
                <a href="#">Ajustes</a>
                <a id="cerrar_sesion">Cerrar Sesión</a>
            </div>
        </div>
    </nav>  
</header>