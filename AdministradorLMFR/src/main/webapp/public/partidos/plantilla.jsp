<%-- 
    Document   : plantilla
    Created on : 15 jun 2025, 14:19:14
    Author     : rafaeldiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-fluid pt-4">
            <!-- Selector de fecha -->
            <div class="row mb-4">
                <div class="col-md-6 mx-auto">
                    <div class="card shadow-sm border-success">
                        <div class="card-header bg-success text-white">
                            <h5 class="card-title mb-0"><i class="fas fa-calendar-alt"></i> Seleccionar fecha</h5>
                        </div>
                        <div class="card-body">
                            <div class="input-group">
                                <input type="date" class="form-control border-success" id="fechaPartidos">
                                <button class="btn btn-success" type="button">
                                    <i class="fas fa-search"></i> Buscar
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Resumen de jornada -->
            <div class="row mb-4">
                <div class="col-12">
                    <div class="card shadow-sm border-black">
                        <div class="card-header bg-black text-white">
                            <h4 class="card-title mb-0"><i class="fas fa-trophy"></i> Jornada 12 - Liga Municipal Ixtlán de Juárez</h4>
                        </div>
                        <div class="card-body bg-light">
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="d-flex justify-content-between align-items-center mb-2">
                                        <span class="font-weight-bold">Partidos jugados:</span>
                                        <span class="badge badge-success">4/6</span>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="d-flex justify-content-between align-items-center mb-2">
                                        <span class="font-weight-bold">Goles totales:</span>
                                        <span class="badge badge-dark">18</span>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="d-flex justify-content-between align-items-center mb-2">
                                        <span class="font-weight-bold">Promedio por partido:</span>
                                        <span class="badge badge-dark">4.5</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Lista de partidos -->
            <div class="row">
                <div class="col-12">
                    <div class="card shadow-sm border-black">
                        <div class="card-header bg-black text-white">
                            <h4 class="card-title mb-0"><i class="fas fa-futbol"></i> Partidos del día</h4>
                        </div>
                        <div class="card-body p-0">
                            <div class="list-group list-group-flush">
                                <!-- Partido 1 -->
                                <div class="list-group-item">
                                    <div class="row align-items-center">
                                        <div class="col-md-1 text-center text-success font-weight-bold">
                                            <span>10:00</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center justify-content-end">
                                                <span class="font-weight-bold">Los Halcones</span>
                                                <img src="${pageContext.request.contextPath}/img/escudos/halcones.png" alt="Escudo Halcones" class="img-fluid mx-2" style="max-height: 30px;">
                                            </div>
                                        </div>
                                        <div class="col-md-1 text-center bg-light py-2">
                                            <span class="font-weight-bold" style="font-size: 1.2rem;">2 - 1</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center">
                                                <img src="${pageContext.request.contextPath}/img/escudos/tigres.png" alt="Escudo Tigres" class="img-fluid mx-2" style="max-height: 30px;">
                                                <span class="font-weight-bold">Tigres FC</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row mt-2">
                                        <div class="col-12 text-center">
                                            <span class="badge badge-success">Finalizado</span>
                                            <small class="text-muted ml-2">Cancha 1</small>
                                        </div>
                                    </div>
                                </div>

                                <!-- Partido 2 -->
                                <div class="list-group-item">
                                    <div class="row align-items-center">
                                        <div class="col-md-1 text-center text-success font-weight-bold">
                                            <span>10:40</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center justify-content-end">
                                                <span class="font-weight-bold">Águilas Reales</span>
                                                <img src="${pageContext.request.contextPath}/img/escudos/aguilas.png" alt="Escudo Aguilas" class="img-fluid mx-2" style="max-height: 30px;">
                                            </div>
                                        </div>
                                        <div class="col-md-1 text-center bg-light py-2">
                                            <span class="font-weight-bold" style="font-size: 1.2rem;">1 - 1</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center">
                                                <img src="${pageContext.request.contextPath}/img/escudos/leones.png" alt="Escudo Leones" class="img-fluid mx-2" style="max-height: 30px;">
                                                <span class="font-weight-bold">Leones Unidos</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row mt-2">
                                        <div class="col-12 text-center">
                                            <span class="badge badge-success">Finalizado</span>
                                            <small class="text-muted ml-2">Cancha 2</small>
                                        </div>
                                    </div>
                                </div>

                                <!-- Partido 3 -->
                                <div class="list-group-item">
                                    <div class="row align-items-center">
                                        <div class="col-md-1 text-center text-success font-weight-bold">
                                            <span>11:20</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center justify-content-end">
                                                <span class="font-weight-bold">Dragones FC</span>
                                                <img src="${pageContext.request.contextPath}/img/escudos/dragones.png" alt="Escudo Dragones" class="img-fluid mx-2" style="max-height: 30px;">
                                            </div>
                                        </div>
                                        <div class="col-md-1 text-center bg-light py-2">
                                            <span class="font-weight-bold" style="font-size: 1.2rem;">3 - 2</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center">
                                                <img src="${pageContext.request.contextPath}/img/escudos/toros.png" alt="Escudo Toros" class="img-fluid mx-2" style="max-height: 30px;">
                                                <span class="font-weight-bold">Toros Salvajes</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row mt-2">
                                        <div class="col-12 text-center">
                                            <span class="badge badge-success">Finalizado</span>
                                            <small class="text-muted ml-2">Cancha 1</small>
                                        </div>
                                    </div>
                                </div>

                                <!-- Partido 4 -->
                                <div class="list-group-item">
                                    <div class="row align-items-center">
                                        <div class="col-md-1 text-center text-success font-weight-bold">
                                            <span>12:00</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center justify-content-end">
                                                <span class="font-weight-bold">Coyotes FC</span>
                                                <img src="${pageContext.request.contextPath}/img/escudos/coyotes.png" alt="Escudo Coyotes" class="img-fluid mx-2" style="max-height: 30px;">
                                            </div>
                                        </div>
                                        <div class="col-md-1 text-center bg-light py-2">
                                            <span class="font-weight-bold" style="font-size: 1.2rem;">0 - 4</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center">
                                                <img src="${pageContext.request.contextPath}/img/escudos/venados.png" alt="Escudo Venados" class="img-fluid mx-2" style="max-height: 30px;">
                                                <span class="font-weight-bold">Venados FC</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row mt-2">
                                        <div class="col-12 text-center">
                                            <span class="badge badge-success">Finalizado</span>
                                            <small class="text-muted ml-2">Cancha 2</small>
                                        </div>
                                    </div>
                                </div>

                                <!-- Partido 5 -->
                                <div class="list-group-item">
                                    <div class="row align-items-center">
                                        <div class="col-md-1 text-center text-success font-weight-bold">
                                            <span>12:40</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center justify-content-end">
                                                <span class="font-weight-bold">Jaguares FC</span>
                                                <img src="${pageContext.request.contextPath}/img/escudos/jaguares.png" alt="Escudo Jaguares" class="img-fluid mx-2" style="max-height: 30px;">
                                            </div>
                                        </div>
                                        <div class="col-md-1 text-center bg-light py-2">
                                            <span class="font-weight-bold" style="font-size: 1.2rem;">-</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center">
                                                <img src="${pageContext.request.contextPath}/img/escudos/zorros.png" alt="Escudo Zorros" class="img-fluid mx-2" style="max-height: 30px;">
                                                <span class="font-weight-bold">Zorros Plateados</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row mt-2">
                                        <div class="col-12 text-center">
                                            <span class="badge badge-dark">Por jugar</span>
                                            <small class="text-muted ml-2">Cancha 1</small>
                                        </div>
                                    </div>
                                </div>

                                <!-- Partido 6 -->
                                <div class="list-group-item">
                                    <div class="row align-items-center">
                                        <div class="col-md-1 text-center text-success font-weight-bold">
                                            <span>13:20</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center justify-content-end">
                                                <span class="font-weight-bold">Pumas FC</span>
                                                <img src="${pageContext.request.contextPath}/img/escudos/pumas.png" alt="Escudo Pumas" class="img-fluid mx-2" style="max-height: 30px;">
                                            </div>
                                        </div>
                                        <div class="col-md-1 text-center bg-light py-2">
                                            <span class="font-weight-bold" style="font-size: 1.2rem;">-</span>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="d-flex align-items-center">
                                                <img src="${pageContext.request.contextPath}/img/escudos/lobos.png" alt="Escudo Lobos" class="img-fluid mx-2" style="max-height: 30px;">
                                                <span class="font-weight-bold">Lobos FC</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row mt-2">
                                        <div class="col-12 text-center">
                                            <span class="badge badge-dark">Por jugar</span>
                                            <small class="text-muted ml-2">Cancha 2</small>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
