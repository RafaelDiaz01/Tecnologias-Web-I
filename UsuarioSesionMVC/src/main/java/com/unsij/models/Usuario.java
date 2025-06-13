
package com.unsij.models;

import java.beans.*;
import java.io.Serializable;

/**
 * @author rafaeldiaz
 */

public class Usuario implements Serializable {
    
    private int id;
    private String nombre;
    private String email;
    private String password;
    
    public Usuario(){}
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}
