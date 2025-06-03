package com.mycompany.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.OutputStream;
import javax.imageio.ImageIO;

/* @author rafaeldiaz */
public class RespuestaImagen extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType ("image/png");
        
        String pathToWeb = getServletContext().getRealPath(File.separator);
        System.out.println(pathToWeb);
        File f = new File(pathToWeb + "images/dado1.png");
        BufferedImage bi = ImageIO.read(f);
        OutputStream out = response.getOutputStream();
        ImageIO.write(bi, "png", out);
        out.close();        
    }
}
