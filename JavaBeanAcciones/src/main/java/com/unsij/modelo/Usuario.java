/*
 Kevin Rafael Díaz Lopez - 02/06/2025
 */
package com.unsij.modelo;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author rafaeldiaz
 */
public class Usuario implements Serializable {
    
    private String nombre;
    private String correo;
    
    public Usuario(){
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
}
