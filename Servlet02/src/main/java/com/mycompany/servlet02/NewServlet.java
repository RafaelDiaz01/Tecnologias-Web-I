// Kevin Rafael Diaz Lopez - 13/05/2025
// Servlet correspondiente al servlet02. En este ejercicio trabajamos con
// anotaciones en vez web.xml

// Declaración del paquete al que pertenece la clase.
package com.mycompany.servlet02;

// Importación de clases necesarias para el servlet
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Anotación que define el servlet y sus patrones de URL
@WebServlet(name = "NewServlet", urlPatterns = {"/servlet"})

// Definición de la clase NewServlet que extiende HttpServlet
public class NewServlet extends HttpServlet {

    // Método principal para procesar las solicitudes
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Configuración del tipo de contenido de la respuesta
        response.setContentType("text/html;charset=UTF-8");

        // Bloque try-with-resources para el PrintWriter
        try (PrintWriter out = response.getWriter()) {
            // Generación de contenido HTML mediante el PrintWriter
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet definido con anotaciones " + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    // Sobreescritura del método doGet para manejar solicitudes HTTP GET.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response); // Llama al método que genera el HTML
    }
    
    // Sobreescritura del método doPost para manejar solicitudes HTTP POST.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response); // También permite POST
    }

}
