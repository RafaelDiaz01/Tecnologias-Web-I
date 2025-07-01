/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.unsij.controllers;

import com.unsij.beans.Arbitro;
import com.unsij.services.ArbitroService;

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
@WebServlet(name = "ArbitroController", urlPatterns = {"/arbitros"})
public class ArbitroController extends HttpServlet {

    private final ArbitroService service = new ArbitroService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("edit".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            Arbitro arbitro = service.obtenerPorId(id);
            request.setAttribute("arbitro", arbitro);
            request.setAttribute("arbitros", service.obtenerArbitros());
            request.getRequestDispatcher("/public/arbitros/arbitros.jsp").forward(request, response);
        } else if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            service.eliminar(id);
            response.sendRedirect(request.getContextPath() + "/arbitros");
        } else {
            request.setAttribute("arbitros", service.obtenerArbitros());
            request.getRequestDispatcher("/public/arbitros/arbitros.jsp").forward(request, response);
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
            String sexo = request.getParameter("sexo");

            Arbitro arbitro = new Arbitro();
            arbitro.setIdArbitro(id);
            arbitro.setNombreCompleto(nombre);
            arbitro.setEdad(edad);
            arbitro.setSexo(sexo);

            service.guardar(arbitro);
            response.sendRedirect(request.getContextPath() + "/arbitros"); // Redirige a la lista de árbitros
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/error.jsp"); // Manejo de errores
        }
    }
}
