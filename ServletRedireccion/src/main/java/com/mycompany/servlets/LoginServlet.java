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

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (user.equals("admin") && password.equals("123")){
            response.sendRedirect("bienvenida.html");
        } else {
            response.sendRedirect("error.html");
        }
    }
}
