package com.unsij.beans;

import java.beans.*;
import java.io.Serializable;

/**
 * @author diaz
 */
public class Temporada implements Serializable {
    
    private long idTemporada;
    private String nombreTemporada;
    private String año;
    private int equiposParticipantes;
    private int categoriasParticipantes;
    
    public Temporada() {
        this.nombreTemporada = "";
        this.año = "";
        this.equiposParticipantes = 0;
        this.categoriasParticipantes =0;
    }

    public long getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(long idTemporada) {
        this.idTemporada = idTemporada;
    }

    public String getNombreTemporada() {
        return nombreTemporada;
    }

    public void setNombreTemporada(String nombreTemporada) {
        this.nombreTemporada = nombreTemporada;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public void setEquiposParticipantes(int equiposParticipantes) {
        this.equiposParticipantes = equiposParticipantes;
    }

    public int getCategoriasParticipantes() {
        return categoriasParticipantes;
    }

    public void setCategoriasParticipantes(int categoriasParticipantes) {
        this.categoriasParticipantes = categoriasParticipantes;
    }

    @Override
    public String toString() {
        return "Temporada{" + "idTemporada=" + idTemporada + ", nombreTemporada=" + nombreTemporada + ", a\u00f1o=" + año + ", equiposParticipantes=" + equiposParticipantes + ", categoriasParticipantes=" + categoriasParticipantes + '}';
    }
}
