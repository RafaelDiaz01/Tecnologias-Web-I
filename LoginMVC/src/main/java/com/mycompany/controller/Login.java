package com.mycompany.controller;

import com.mycompany.model.LoginBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * @author rafaeldiaz
 */

@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {
    
    // 2. EL controller recibe la peticion del tipo POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 3. Se reciben o validan los datos enviados por el usuario.
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        
        LoginBean bean = new LoginBean();
        bean.setName(name);
        bean.setPassword(password);
        
        // 4. Realizamos la logica de negocio (procesar datos)
        boolean status = bean.validate();
        
        // 5. Compartimos el objeto, para poder usarlo en la vista (JSP).
        request.setAttribute("user", bean);
        
        // 6. Dependiendo de nuestra logica, redireccionamos (enviamos una respuesta)
        if (status){
            RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
    }
    
}
