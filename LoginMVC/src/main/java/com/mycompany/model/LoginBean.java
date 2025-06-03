package com.mycompany.model;

import java.beans.*;
import java.io.Serializable;

/**
 * @author rafaeldiaz
 */
public class LoginBean implements Serializable {
    
    private String name;
    private String apellido = "Diaz";
    private int edad = 21;
    private String password;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validate() {
        if(name.equals("rafael") && password.equals("1234")){
            return true;
        } else {
            return false;
        }
    }
    
}
