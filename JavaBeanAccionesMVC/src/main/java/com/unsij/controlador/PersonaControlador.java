/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.unsij.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import com.unsij.modelo.Persona;

/**
 *
 * @author rafaeldiaz
 */
@WebServlet(name = "PersonaControlador", urlPatterns = {"/controlador"})
public class PersonaControlador extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String edadStr = request.getParameter("edad");

        try {
            int edad = Integer.parseInt(edadStr);
            Persona persona = new Persona();
            persona.setNombre(nombre);
            persona.setEdad(edad);
            request.setAttribute("persona", persona);
            request.getRequestDispatcher("resultado.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            response.sendRedirect("formulario.jsp?error=1");
        }
    }
}
