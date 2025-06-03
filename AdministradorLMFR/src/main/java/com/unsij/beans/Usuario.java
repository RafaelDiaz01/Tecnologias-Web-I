package com.unsij.beans;

import java.beans.*;
import java.io.Serializable;

/**
 * @author diaz
 */
public class Usuario implements Serializable {
    
    private long idUsuario;
    private String nombreCompleto;
    private String password;
    private boolean statusUsuario;
    private long idTipoUsuario;
    
    public Usuario() {
        this.nombreCompleto = "";
        this.password = "";
        this.statusUsuario = true;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getContraseña() {
        return password;
    }

    public void setContraseña(String contraseña) {
        this.password = contraseña;
    }

    public boolean isStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(boolean statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    public long getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreCompleto=" + nombreCompleto + ", contrase\u00f1a=" + password + ", statusUsuario=" + statusUsuario + ", idTipoUsuario=" + idTipoUsuario + '}';
    }
      
}
