/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.unsij.controllers;

import com.unsij.beans.Equipo;
import com.unsij.services.EquipoService;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diaz
 */
@WebServlet(name = "EquipoController", urlPatterns = {"/equipos"})
public class EquipoController extends HttpServlet {

    private final EquipoService service = new EquipoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("edit".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            Equipo equipo = service.obtenerPorId(id);
            request.setAttribute("equipo", equipo);
            request.setAttribute("equipos", service.obtenerEquipos());
            request.getRequestDispatcher("/public/equipos/equipos.jsp").forward(request, response);
        } else if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            service.eliminar(id);
            response.sendRedirect(request.getContextPath() + "/equipos");
        } else {
            request.setAttribute("equipos", service.obtenerEquipos());
            request.getRequestDispatcher("/public/equipos/equipos.jsp").forward(request, response);
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
            int numJugadores = Integer.parseInt(request.getParameter("numJugadores"));
            String procedencia = request.getParameter("procedencia");
            String capitan = request.getParameter("capitan");

            Equipo equipo = new Equipo();
            equipo.setIdEquipo(id);
            equipo.setNombreEquipo(nombre);
            equipo.setTotalJugadores(numJugadores);
            equipo.setProcedencia(procedencia);
            equipo.setCapitan(capitan);

            service.guardar(equipo);
            request.setAttribute("equipos", service.obtenerEquipos()); // Añade esta línea
            request.getRequestDispatcher("/public/equipos/equipos.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/error.jsp"); // Manejo de errores
        }
    }
}
