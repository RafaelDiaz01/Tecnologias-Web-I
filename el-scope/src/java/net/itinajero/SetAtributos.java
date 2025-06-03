package net.itinajero;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SetAtributos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // set application scoped attribute
        request.getServletContext().setAttribute("email", "ivanetinajero@gmail.com");

        // set session scoped attribute
        HttpSession session = request.getSession();
        session.setAttribute("usuario", "supervisor");

        // set request scoped attribute
        request.setAttribute("producto", "computadora personal");

        // send redirect to other servlet
        request.getRequestDispatcher("get").forward(request, response);
    }
       
}
