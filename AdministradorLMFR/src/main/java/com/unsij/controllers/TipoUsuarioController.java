package com.unsij.controllers;

import com.unsij.beans.TipoUsuario;
import com.unsij.services.TipoUsuarioService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author rafaeldiaz
 */
@WebServlet(name = "TipoUsuarioController", urlPatterns = {"/usuarios"})
public class TipoUsuarioController extends HttpServlet {

    private final TipoUsuarioService service = new TipoUsuarioService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("action: " + action);
        if ("editar".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            TipoUsuario u = service.obtenerPorId(id);
            
            request.setAttribute("usuarios", u);
            request.getRequestDispatcher("/jsp/AgregarTipoUsuario.jsp").forward(request, response);
        } else if ("eliminar".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            service.eliminar(id);
            response.sendRedirect("usuarios");
        } else {
            request.setAttribute("usuarios", service.obtenerUsuarios());
            request.getRequestDispatcher("/jsp/TipoUsuario.jsp").forward(request, response);
        }
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = request.getParameter("id") == null || request.getParameter("id").isEmpty() ? 0 : Integer.parseInt(request.getParameter("id"));
        String tipo = request.getParameter("tipo");
        String descripcion = request.getParameter("descripcion");

        TipoUsuario u = new TipoUsuario();
        u.setIdTipoUsuario(id);
        u.setTipo(tipo);
        u.setDescripcion(descripcion);

        service.guardar(u);
        response.sendRedirect("usuarios");
    }

}
