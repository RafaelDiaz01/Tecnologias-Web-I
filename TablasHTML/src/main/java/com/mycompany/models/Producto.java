/*
 Rafael Diaz Lopez - 10/04/2025
 */
package com.mycompany.models;

/**
 *
 * @author rafaeldiaz
 */
public class Producto {

    private int ID;
    private String categoria;
    private String nombre;
    private double precio;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
