/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsij.dao;
import com.unsij.beans.Jugador;
import com.unsij.utils.DBConnection;

import java.sql.*;
import java.util.*;

/**
 *
 * @author rafaeldiaz
 */
public class JugadorDAO {
    
    public List<Jugador> listar() {
        List<Jugador> lista = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT nombre_jugador FROM jugadores");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Jugador jugador = new Jugador();
                jugador.setNombreJugador(rs.getString("nombre_jugador"));
                lista.add(jugador);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public void insertar(Jugador u) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO jugadores(nombreJugador, edad) VALUES(?, ?)");
            ps.setString(1, u.getNombreJugador());
            ps.setInt(2, u.getEdad());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Jugador buscarPorId(int id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM tipo_usuarios WHERE id_tipo_usuario=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jugador u = new Jugador();
                u.setIdJugador(rs.getLong("id_jugador"));
                u.setNombreJugador(rs.getString("tipo"));
                u.setEdad(rs.getInt("edad"));
                return u;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizar(Jugador u) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("UPDATE tipo_usuarios SET tipo=?, descripcion=? WHERE id_tipo_usuario=?");
            ps.setString(1, u.getNombreJugador());
            ps.setInt(2, u.getEdad());
            ps.setLong(3, u.getIdJugador());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM tipo_usuarios WHERE id_tipo_usuario=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
