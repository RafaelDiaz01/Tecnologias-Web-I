package com.unsij.beans;

import java.beans.*;
import java.io.Serializable;

/**
 * @author diaz
 */
public class Categoria implements Serializable {
    
    private long idCategoria;
    private String nombreCategoria;
    private boolean statusCategoria;
    
    public Categoria() {
        this.nombreCategoria = "";
        this.statusCategoria = true;
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public boolean isStatusCategoria() {
        return statusCategoria;
    }

    public void setStatusCategoria(boolean statusCategoria) {
        this.statusCategoria = statusCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + ", statusCategoria=" + statusCategoria + '}';
    }
}
