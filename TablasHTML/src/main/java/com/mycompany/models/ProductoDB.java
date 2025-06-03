/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author rafaeldiaz
 */
public class ProductoDB {
    List<Producto> catalogo;
    
    public ProductoDB(){
        catalogo = new LinkedList<>();
        
        // Definir 5 productos
        // Producto 1
        Producto producto1 = new Producto();
        producto1.setNombre("Chips");
        producto1.setCategoria("Sabritas");
        producto1.setPrecio(20);
        
        // Producto 1
        Producto producto2 = new Producto();
        producto2.setNombre("Coca Cola");
        producto2.setCategoria("Refresco");
        producto2.setPrecio(25);
        
        // Producto 1
        Producto producto3 = new Producto();
        producto3.setNombre("Barritas");
        producto3.setCategoria("Galletas");
        producto3.setPrecio(15);
        
        // Producto 1
        Producto producto4 = new Producto();
        producto4.setNombre("Pan");
        producto4.setCategoria("Comida");
        producto4.setPrecio(8);
        
        // Producto 1
        Producto producto5 = new Producto();
        producto5.setNombre("Yoplait");
        producto5.setCategoria("Yogurth");
        producto5.setPrecio(12);       
        
        catalogo.add(producto1);
        catalogo.add(producto2);
        catalogo.add(producto3);
        catalogo.add(producto4);
        catalogo.add(producto5);
    }
    
    public List<Producto> getAll(){
        return catalogo;
    }
}
