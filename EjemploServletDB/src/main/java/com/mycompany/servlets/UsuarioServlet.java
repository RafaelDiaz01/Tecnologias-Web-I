// Kevin Rafael Diaz Lopez - 13/05/2025
// Primer ejercicio sobre Conexion con Base de Datos.

// Declaración del paquete al que pertenece la clase.
package com.mycompany.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuarioServlet"})
public class UsuarioServlet extends HttpServlet {

    private final String URL = "jdbc:mysql://localhost:3306/ligaMunicipalFutbol";
    private final String USER = "root";
    private final String PASS = "root";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(URL, USER, PASS);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM tipo_usuarios");
                
                out.println("<h1>Tipo De Usuarios</h1>");
                out.println("<table border='1'");
                
                out.println("<tr>");
                
                out.println("<th>");
                out.println("Id");
                out.println("</th>");
                
                out.println("<th>");
                out.println("Tipo De Usuario");
                out.println("</th>");
                
                out.println("<th>");
                out.println("Descripcion");
                out.println("</th>");
                
                out.println("</tr>");
                
                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rs.getString("id_tipo_usuario") + "</td>" + "<td>" + rs.getString("tipo") + "</td>" + "<td>" + rs.getString("descripcion") + "</td>");
                    out.println("</tr>");
                }
              
                out.println("</table>");
                
                rs.close();
                stmt.close();
                con.close();              
            } catch (Exception e) {
                out.println("<p> Error: " + e.getLocalizedMessage() + " - " + e.getMessage());
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
