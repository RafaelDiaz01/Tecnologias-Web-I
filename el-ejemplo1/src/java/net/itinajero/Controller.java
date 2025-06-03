package net.itinajero;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Producto p = new Producto();
        p.setDescripcion("Television");
        p.setPrecioVenta(1524);

        // Compartimos el Javabean en el alcance de request
        request.setAttribute("producto", p);

        // Compartimos el Javabean en el alcance de session. 
        // Estara disponible mientras la session este activa.
        // Puedes ver este atributo en el administrador de aplicaciones de Tomcat.
        HttpSession sesion = request.getSession();
        sesion.setAttribute("producto", p);
        RequestDispatcher rd = request.getRequestDispatcher("detalle.jsp");
        rd.forward(request, response);
    }

}
