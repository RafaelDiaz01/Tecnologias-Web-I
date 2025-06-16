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

/**
 *
 * @author rafaeldiaz
 */
@WebServlet(name = "JugadorController", urlPatterns = {"/jugadores"})
public class JugadorController extends HttpServlet {

    private final JugadorService service = new JugadorService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("jugadores", service.obtenerJugadores());
        request.getRequestDispatcher("/public/jugadores/jugadores.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = request.getParameter("id") == null || request.getParameter("id").isEmpty() ? 0 : Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));

        Jugador u = new Jugador();
        u.setIdJugador(id);
        u.setNombreJugador(nombre);
        u.setEdad(edad);

        service.guardar(u);
        response.sendRedirect("usuarios");
    }

}
