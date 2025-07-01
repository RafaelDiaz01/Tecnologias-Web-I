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
import com.unsij.services.JugadorService; 
/**
 *
 * @author rafaeldiaz
 */
@WebServlet(name = "InicioController", urlPatterns = {"/inicio"})
public class InicioController extends HttpServlet {

    private final JugadorService service = new JugadorService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Carga los jugadores (puedes filtrar solo los "líderes" si es necesario)
        request.setAttribute("jugadores", service.obtenerJugadores());
        request.getRequestDispatcher("/public/inicio/inicio.jsp").forward(request, response);
    }

}
