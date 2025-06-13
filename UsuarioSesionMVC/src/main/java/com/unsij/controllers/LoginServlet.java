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
import javax.servlet.http.HttpSession;

import com.unsij.models.Usuario;
import com.unsij.dao.UsuarioDAO;

/**
 *
 * @author rafaeldiaz
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
       
        try{
            Usuario usuario = new UsuarioDAO().login(email, password);
            if (usuario != null){
                HttpSession session = request.getSession();
                session.setAttribute("usuario", usuario);
                response.sendRedirect("home.jsp");
            } else {
                response.sendRedirect("login.jsp?error=1");
            }
        } catch(Exception e){
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
