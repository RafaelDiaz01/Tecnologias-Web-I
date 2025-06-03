package com.unsij.beans;

import java.beans.*;
import java.io.Serializable;

/**
 * @author diaz
 */
public class Gol implements Serializable {
    
    private long idGol;
    private String minuto;
    private String tipoDeGol;
    private long idJugador;
    private long idPartido;
    
    public Gol(){
        this.minuto = "";
        this.tipoDeGol = "";
    }

    public long getIdGol() {
        return idGol;
    }

    public void setIdGol(long idGol) {
        this.idGol = idGol;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getTipoDeGol() {
        return tipoDeGol;
    }

    public void setTipoDeGol(String tipoDeGol) {
        this.tipoDeGol = tipoDeGol;
    }

    public long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(long idJugador) {
        this.idJugador = idJugador;
    }

    public long getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(long idPartido) {
        this.idPartido = idPartido;
    }

    @Override
    public String toString() {
        return "Gol{" + "idGol=" + idGol + ", minuto=" + minuto + ", tipoDeGol=" + tipoDeGol + ", idJugador=" + idJugador + ", idPartido=" + idPartido + '}';
    }
      
}
