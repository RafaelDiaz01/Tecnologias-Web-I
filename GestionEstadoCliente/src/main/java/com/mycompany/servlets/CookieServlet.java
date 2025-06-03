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
import javax.servlet.http.Cookie;

/**
 *
 * @author rafaeldiaz
 */

@WebServlet(name = "CookieServlet", urlPatterns = {"/cookie"})
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Crear una cookie
        Cookie cookie = new Cookie ("usuario", "admin");
        cookie.setMaxAge(60 * 60); // 1 hora de vida
        response.addCookie(cookie); // Agregar al response
        
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<h2> Cookie creada. <a href='verCookie.jsp > Ver Cookie </a> <h2>'");
    }
}
