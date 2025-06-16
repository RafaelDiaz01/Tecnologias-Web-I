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
        request.setAttribute("arbitros", service.obtenerArbitros());
        request.getRequestDispatcher("/public/arbitros/arbitros.jsp").forward(request, response);
    }
}
