package com.unsij.beans;

import java.beans.*;
import java.io.Serializable;

/**
 * @author diaz
 */
public class Equipo implements Serializable {
    
    private long idEquipo;
    private String nombreEquipo;
    private int totalJugadores;
    private String procedencia;
    private String capitan;
    private long idCategoria;
    
    public Equipo() {
        this.nombreEquipo = "";
        this.totalJugadores = 0;
        this.procedencia = "";
        this.capitan = "";
    }

    public long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getTotalJugadores() {
        return totalJugadores;
    }

    public void setTotalJugadores(int totalJugadores) {
        this.totalJugadores = totalJugadores;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Equipo{" + "idEquipo=" + idEquipo + ", nombreEquipo=" + nombreEquipo + ", totalJugadores=" + totalJugadores + ", procedencia=" + procedencia + ", capitan=" + capitan + ", idCategoria=" + idCategoria + '}';
    }
    
}
