/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.unsij.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import com.unsij.beans.Vehiculo;

/**
 *
 * @author rafaeldiaz
 */
@WebServlet(name = "RegistroVehiculoServlet", urlPatterns = {"/RegistroVehiculoServlet"})
public class RegistroVehiculoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Vehiculo vehiculo = new Vehiculo();
        
        vehiculo.setMarca(request.getParameter("marca"));
        vehiculo.setModelo(request.getParameter("modelo"));
        vehiculo.setAnio(Integer.parseInt(request.getParameter("anio")));
        vehiculo.setColor(request.getParameter("color"));
        vehiculo.setCombustible(request.getParameter("combustible"));
        vehiculo.setPrecio(Double.parseDouble(request.getParameter("precio")));
        vehiculo.setDisponible(request.getParameter("disponible") != null);
        
        request.setAttribute("vehiculo", vehiculo);
        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }
}
