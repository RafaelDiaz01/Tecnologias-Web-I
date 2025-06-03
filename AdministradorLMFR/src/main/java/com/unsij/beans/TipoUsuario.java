package com.unsij.beans;
import java.beans.*;
import java.io.Serializable;

/**
 * @author rafaeldiaz
 */
public class TipoUsuario implements Serializable {
    
    private long idTipoUsuario;
    private String tipo;
    private String descripcion;
    
    public TipoUsuario() {
        this.tipo = "";
        this.descripcion = "";
    }

    public long getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" + "idTipoUsuario=" + idTipoUsuario + ", tipo=" + tipo + ", descripcion=" + descripcion + '}';
    }
       
}
