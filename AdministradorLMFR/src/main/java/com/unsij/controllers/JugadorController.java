/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.unsij.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.unsij.beans.Jugador;
import com.unsij.services.JugadorService;
import com.unsij.beans.Equipo;
import com.unsij.services.EquipoService;

/**
 *
 * @author rafaeldiaz
 */
@WebServlet(name = "JugadorController", urlPatterns = {"/jugadores"})
public class JugadorController extends HttpServlet {

    private final JugadorService service = new JugadorService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        List<Equipo> equipos = new EquipoService().obtenerEquipos();
        request.setAttribute("equipos", equipos);

        if ("edit".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            Jugador jugador = service.obtenerPorId(id);
            request.setAttribute("jugador", jugador);
            request.setAttribute("jugadores", service.obtenerJugadores());
            request.getRequestDispatcher("/public/jugadores/jugadores.jsp").forward(request, response);
        } else if ("delete".equals(action)) {
            long id = Long.parseLong(request.getParameter("id"));
            service.eliminar(id);
            response.sendRedirect(request.getContextPath() + "/jugadores");
        } else {
            request.setAttribute("jugadores", service.obtenerJugadores());
            request.getRequestDispatcher("/public/jugadores/jugadores.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try {
            int id = request.getParameter("id") == null || request.getParameter("id").isEmpty() ? 0
                    : Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");
            int edad = Integer.parseInt(request.getParameter("edad"));
            int numeroDorsal = Integer.parseInt(request.getParameter("numeroDorsal"));
            String sexo = request.getParameter("sexo");

            Jugador jugador = new Jugador();
            jugador.setIdJugador(id);
            jugador.setNombreJugador(nombre);
            jugador.setEdad(edad);
            jugador.setNumeroDorsal(numeroDorsal);
            jugador.setSexo(sexo);

            // Asignar el equipo
            Equipo equipo = new Equipo();
            equipo.setIdEquipo(Integer.parseInt(request.getParameter("idEquipo")));
            jugador.setEquipo(equipo);

            service.guardar(jugador);
            response.sendRedirect(request.getContextPath() + "/jugadores"); // Redirige a la lista de jugadores
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/error.jsp"); // Manejo de errores
        }
    }
}
