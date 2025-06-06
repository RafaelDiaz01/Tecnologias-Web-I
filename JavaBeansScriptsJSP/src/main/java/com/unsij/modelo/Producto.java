/*
 Kevin Rafael Diaz Lopez
 */
package com.unsij.modelo;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author rafaeldiaz
 */
public class Producto implements Serializable {
    
    private String nombre;
    private String descripcion;
    private double precio;
    
    public Producto(){    
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }   
}
