/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package com.unsij.modelo;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author rafaeldiaz
 */
public class Persona implements Serializable {
    
    private String nombre;
    private int edad;
    
    public Persona(){
    
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
}
