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

/**
 *
 * @author rafaeldiaz
 */
public class RespuestaJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        
        out.println("{\"employees\":[\n"
                + " {\"firstName\":\"John\", \"lastName\":\"Doe\"},\n"
                + " {\"firstName\":\"Anna\", \"lastName\":\"Smith\"},\n"
                + " {\"firstName\":\"Peter\", \"lastName\":\"Jones\"},\n"
                + " {\"firstName\":\"Elton\", \"lastName\":\"Hernandez\"},\n"
                + " {\"firstName\":\"Eden\", \"lastName\":\"Cassarubia\"}"
                + "]}");
    }

}
