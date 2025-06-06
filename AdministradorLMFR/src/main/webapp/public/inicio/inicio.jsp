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
        </main>

        <jsp:include page="../componentes/footer.jsp"/> <!-- Footer incluido aquí -->

    </body>
</html>
