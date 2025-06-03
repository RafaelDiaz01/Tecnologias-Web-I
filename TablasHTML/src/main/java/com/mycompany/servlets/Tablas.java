package com.mycompany.tablas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* @author rafaeldiaz */
@WebServlet(name = "Tablas", urlPatterns = {"/tablas"})

public class Tablas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        /* Creamos un objeto del tipo PrintWriter llamado out y asignarle el parametro response del metodo doGet con el metodo getWriter(). */
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Catalogo de productos</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Catalogo de productos</h3>");
        out.println("<table border='1' style='width:100%;'>");
        out.println("<tr>");
        out.println("<th>Categoria</th>");
        out.println("<th>Nombre</th>");
        out.println("<th>Precio</th>");
        out.println("</tr>");

        // Primer producto
        out.println("<tr>");
        out.println("<td>Electrónica</td>");
        out.println("<td>Televisión Samsung 70'</td>");
        out.println("<td style='text-align:center;'>$18,500</td>");
        out.println("</tr>");

        // Segundo producto
        out.println("<tr>");
        out.println("<td>Muebles</td>");
        out.println("<td>Comedor Familiar</td>");
        out.println("<td style='text-align:center;'>$12,300</td>");
        out.println("</tr>");

        // Tercer producto
        out.println("<tr>");
        out.println("<td>Electrodomésticos</td>");
        out.println("<td>Refrigerador LG</td>");
        out.println("<td style='text-align:center;'>$15,999</td>");
        out.println("</tr>");

        // Cuarto producto
        out.println("<tr>");
        out.println("<td>Tecnología</td>");
        out.println("<td>Laptop HP Pavilion</td>");
        out.println("<td style='text-align:center;'>$21,450</td>");
        out.println("</tr>");

        // Quinto producto
        out.println("<tr>");
        out.println("<td>Hogar</td>");
        out.println("<td>Sofá 3 plazas</td>");
        out.println("<td style='text-align:center;'>$8,700</td>");
        out.println("</tr>");

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
