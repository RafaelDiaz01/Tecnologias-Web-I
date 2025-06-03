package com.unsij.beans;

import java.beans.*;
import java.io.Serializable;

/**
 * @author diaz
 */

public class Arbitro implements Serializable {
    
    private long idArbitro;
    private String nombreCompleto;
    private int edad;
    private String sexo;
    private boolean statusArbitro;
    private long idTipoUsuario;
    
    public Arbitro() {
        this.nombreCompleto = "";
        this.edad = 0;
        this.sexo = "";
        this.statusArbitro = true;
    }

    public long getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(long idArbitro) {
        this.idArbitro = idArbitro;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isStatusArbitro() {
        return statusArbitro;
    }

    public void setStatusArbitro(boolean statusArbitro) {
        this.statusArbitro = statusArbitro;
    }

    public long getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    @Override
    public String toString() {
        return "Arbitro{" + "idArbitro=" + idArbitro + ", nombreCompleto=" + nombreCompleto + ", edad=" + edad + ", sexo=" + sexo + ", statusArbitro=" + statusArbitro + ", idTipoUsuario=" + idTipoUsuario + '}';
    }
    
}
