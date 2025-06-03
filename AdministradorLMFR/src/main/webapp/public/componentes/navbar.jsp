<%-- 
    Document   : navbar
    Created on : 3 jun 2025, 15:34:36
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fast League</title>
    </head>
    <body>
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
                <button onclick="location.href = './usuarios'">Partidos</button>
                <button onclick="location.href = '/public/GestionContribuyentes/gestion_contribuyentes.html'">Jugadores</button>
                <button onclick="location.href = '/public/Catalogos/menu-catalogos.html'">Otros</button>
            </nav>  
        </header>
    </body>
</html>
