// Kevin Rafael Diaz Lopez - 13/05/2025
// Tarea sobre Comentarios.

// Declaración del paquete al que pertenece la clase.
package com.mycompany.servlet01;

// Importación de las clases necesarias para el funcionamiento del Servlet.
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Anotación que define el servlet y sus patrones de URL
@WebServlet(name = "Comentarios", urlPatterns = {"/comentarios"})

// Definición de la clase Comentarios que extiende de HttpServlet
public class Comentarios extends HttpServlet {
    
    // Sobreescritura del método doGet para manejar solicitudes HTTP GET.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Declaramos un varibale para almacenar lo que recibimos de parametro nombre.
        String Nombre = request.getParameter("name");
        System.out.println("Name: " + Nombre); // Imprime la variable en consola.

        String Perfil = request.getParameter("perfil");
        System.out.println("Perfil: " + Perfil);

        String Id = request.getParameter("id");
        System.out.println("Id: " + Id);

        // Configurar el tipo de contenido de la respuesta
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("</head>");
            out.println("<body>");

            // Verificar si el perfil es "Admin"
            if ("Admin".equalsIgnoreCase(Perfil)) {
                out.println("<h1>Acceso Correcto, Bienvenido " + Perfil + "</h1>");
                out.println("<p>ID de usuario: " + Id + "</p>");
            } else {
                out.println("<h1 style='color:red'>Error: Acceso no autorizado</h1>");
                out.println("<p>" + Perfil + ", no tienes permisos de administrador</p>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    /*TAREA: Si el usuario es Admin mostrar un mensaje de bienvenida, si no, mostrar un error*/
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Recibimos los parametros del formularios.
        String nombreParam = request.getParameter("nombre");
        String emailParam = request.getParameter("email");
        String gradoParam = request.getParameter("grado");
        String comentariosParam = request.getParameter("comentarios");
        
        // 2. Aplicamos las reglas de negocio con la informacion del formulario enviada por el usuario.
        System.out.println("Name: " + nombreParam);
        System.out.println("Email: " + emailParam);
        System.out.println("Grado: " + gradoParam);
        System.out.println("Comentarios: " + comentariosParam);
        
        
        // 3. Siempre regresamos una respuesta al cliente. En este caso una respuesta HTML.
        // Configurar el tipo de respuesta
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Construir la respuesta HTML
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Gracias por tus comentarios</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; }");
            out.println("h1 { color: #2c3e50; }");
            out.println(".mensaje { background-color: #f8f9fa; padding: 20px; border-radius: 5px;");
            out.println("width: 50%; margin: 0 auto; box-shadow: 0 2px 5px rgba(0,0,0,0.1); }");
            out.println("</style>");
            out.println("</head>");
            
            out.println("<body>");
            out.println("<div class='mensaje'>");
            out.println("<h1>¡Gracias por tus comentarios, " + (nombreParam) + "!</h1>");
            out.println("<p>Hemos recibido tu mensaje y nos pondremos en contacto contigo pronto.</p>");
            out.println("<a href='comentarios.html'>Volver al inicio</a>");
            out.println("</div>");
            out.println("</body>");
            
            out.println("</html>");
        }    
    }
}
