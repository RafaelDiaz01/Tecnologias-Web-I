package com.unsij.beans;

import java.beans.*;
import java.io.Serializable;

/**
 * @author diaz
 */
public class Partido implements Serializable {
    
    private long idPartido;
    private String fecha;
    private String resultado;
    private int diferenciaDeGoles;
    private int totalDeFaltas;
    private long idArbitro;
    private long idTemporada;
    private long idEquipoLocal;
    private long idEquipoVisitante;
   
    public Partido() {
        this.fecha = "";
        this.resultado = "";
        this.diferenciaDeGoles = 0;
        this.totalDeFaltas = 0;
        this.idEquipoLocal = 0;
        this.idEquipoVisitante = 0;
    }

    public long getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(long idPartido) {
        this.idPartido = idPartido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getDiferenciaDeGoles() {
        return diferenciaDeGoles;
    }

    public void setDiferenciaDeGoles(int diferenciaDeGoles) {
        this.diferenciaDeGoles = diferenciaDeGoles;
    }

    public int getTotalDeFaltas() {
        return totalDeFaltas;
    }

    public void setTotalDeFaltas(int totalDeFaltas) {
        this.totalDeFaltas = totalDeFaltas;
    }

    public long getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(long idArbitro) {
        this.idArbitro = idArbitro;
    }

    public long getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(long idTemporada) {
        this.idTemporada = idTemporada;
    }

    public long getIdEquipoLocal() {
        return idEquipoLocal;
    }

    public void setIdEquipoLocal(long idEquipoLocal) {
        this.idEquipoLocal = idEquipoLocal;
    }

    public long getIdEquipoVisitante() {
        return idEquipoVisitante;
    }

    public void setIdEquipoVisitante(long idEquipoVisitante) {
        this.idEquipoVisitante = idEquipoVisitante;
    }

    @Override
    public String toString() {
        return "Partido{" + "idPartido=" + idPartido + ", fecha=" + fecha + ", resultado=" + resultado + ", diferenciaDeGoles=" + diferenciaDeGoles + ", totalDeFaltas=" + totalDeFaltas + ", idArbitro=" + idArbitro + ", idTemporada=" + idTemporada + ", idEquipoLocal=" + idEquipoLocal + ", idEquipoVisitante=" + idEquipoVisitante + '}';
    }
}
