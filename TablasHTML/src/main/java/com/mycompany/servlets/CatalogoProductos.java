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

import com.mycompany.models.ProductoDB;
import java.util.List;
import java.util.LinkedList;
import com.mycompany.models.Producto;

/**
 * @author rafaeldiaz
 */
@WebServlet(name = "CatalogoProductos", urlPatterns = {"/CatalogoProductos"})
public class CatalogoProductos extends HttpServlet {

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

        ProductoDB productosDB = new ProductoDB(); // Objeto del tipo ProductoDB llamado productosDB.
        List <Producto> productos = productosDB.getAll(); // Lista de tipo Producto, asignarle la llamada del metodo getAll definido en la clase ProductoDB;
        
        for (Producto producto:productos){
            out.println("<tr>");
            out.println("<td>" + producto.getCategoria() + "</td>");
            out.println("<td>" + producto.getNombre() + "</td>");
            out.println("<td style='text-align:center;'>" + producto.getPrecio() + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
