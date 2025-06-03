package com.unsij.beans;

import java.beans.*;
import java.io.Serializable;

/**
 * @author diaz
 */
public class Jugador implements Serializable {
    
    private long idJugador;
    private String nombreJugador;
    private int edad;
    private int numeroDorsal;
    private String tarjetasAmarillas;
    private String tarjetasRojas;
    private boolean statusJugador;
    private long idEquipo;
    private long idTipoUsuario;
    private Equipo equipo; // Para manejar claves foraneas.
    
    public Jugador (){
        this.nombreJugador = "";
        this.edad = 0;
        this.numeroDorsal = 0;
        this.tarjetasAmarillas = "";
        this.tarjetasRojas = "";
        this.statusJugador = true;    
    }

    public long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(long idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroDorsal() {
        return numeroDorsal;
    }

    public void setNumeroDorsal(int numeroDorsal) {
        this.numeroDorsal = numeroDorsal;
    }

    public String getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(String tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public String getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(String tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public boolean isStatusJugador() {
        return statusJugador;
    }

    public void setStatusJugador(boolean statusJugador) {
        this.statusJugador = statusJugador;
    }

    public long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public long getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombreJugador=" + nombreJugador + ", edad=" + edad + ", numeroDorsal=" + numeroDorsal + ", tarjetasAmarillas=" + tarjetasAmarillas + ", tarjetasRojas=" + tarjetasRojas + ", statusJugador=" + statusJugador + ", idEquipo=" + idEquipo + ", idTipoUsuario=" + idTipoUsuario + '}';
    }
    
}
