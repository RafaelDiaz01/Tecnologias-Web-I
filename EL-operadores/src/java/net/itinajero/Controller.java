package net.itinajero;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ivan
 */
@WebServlet(name = "Controller", urlPatterns = {"/salario"})
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recibimos el parametro de la peticion get (Link)
        String noEmp = request.getParameter("noEmpleado");
        PagoEmpleado pagoBean = new PagoEmpleado(Integer.parseInt(noEmp));
        // Llenamos JavaBean (podriamos utilizar una bd)
        pagoBean.setNombre("Mariana Gomez");
        pagoBean.setHorasTrabajadas(9);
        pagoBean.setPrecioHora(75);
        request.setAttribute("pago", pagoBean);
        RequestDispatcher rd = request.getRequestDispatcher("salario.jsp");
        rd.forward(request, response);
    }
}
