/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package com.unsij.beans;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author rafaeldiaz
 */
public class Vehiculo implements Serializable {
    
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String combustible;
    private double precio;
    private boolean disponible;
    
    public Vehiculo(){
    
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getmodelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getCombustible(){
        return combustible;
    }
    
    public void setCombustible(String combustible){
        this.combustible = combustible;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public boolean isDisponible(){
        return disponible;
    }
    
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
}
