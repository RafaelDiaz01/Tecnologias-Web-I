// Kevin Rafael Diaz Lopez - 13/05/2025
// Primer ejercicio sobre Servlets (Servlet01)

// Declaración del paquete al que pertenece la clase.
package com.mycompany.servlet01; 

// Importación de las clases necesarias para el funcionamiento del Servlet
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Definición de la clase HolaMundo que extiende de HttpServlet
public class HolaMundo extends HttpServlet {
    
    // Sobreescritura del método doGet para manejar solicitudes HTTP GET.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        // Imprime un mensaje en la consola indicando la ejecución del método.
        System.out.println("Ejecutando metodo doGet");
        
    }
    
    // Sobreescritura del método doPost para manejar solicitudes HTTP POST.
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        // Imprime un mensaje en la consola indicando la ejecución del método.
        System.out.println("Ejecutando metodo doPost");
    }
    
}