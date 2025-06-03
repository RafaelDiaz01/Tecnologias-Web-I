/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rafaeldiaz
 */
@WebServlet(name = "SesionServlet", urlPatterns = {"/sesion"})
public class SesionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession(true); // true crea si no existe
        
        String usuario = (String) sesion.getAttribute("usuario");
        
        if (usuario == null) {
            sesion.setAttribute("usuario", "Rafael");
            response.getWriter().println("<h2> Se creo la sesion con usuario: Rafael </h2>" + "<br>");
        } else {
            response.getWriter().println("<h2> Usuario en sesion: " + usuario + "</h2>" + "<br>");
        }        
        response.getWriter().println("<a href='index.jsp'> Volver </a>");
    }
}
