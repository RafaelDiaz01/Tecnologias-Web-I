/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsij.dao;

import com.unsij.beans.Jugador;
import com.unsij.beans.Equipo;
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
        String sql = "SELECT jugadores.*, equipos.* FROM jugadores INNER JOIN equipos ON jugadores.id_equipo = equipos.id_equipo;";

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Jugador jugador = new Jugador();
                jugador.setIdJugador(rs.getLong("id_jugador"));
                jugador.setNombreJugador(rs.getString("nombre_jugador"));
                jugador.setEdad(rs.getInt("edad"));
                jugador.setSexo(rs.getString("sexo"));
                jugador.setNumeroDorsal(rs.getInt("numero_dorsal"));

                Equipo equipo = new Equipo();
                equipo.setNombreEquipo(rs.getString("nombre_equipo"));
                equipo.setIdEquipo(rs.getLong("id_equipo")); // opcional si lo necesitas
                jugador.setEquipo(equipo);

                lista.add(jugador);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    // Use constantes ya que siempre se insertará un jugador activo y con tipo de usuario 2.
    // También, al registrar un nuevo jugador no tendrá tarjetas amarillas ni rojas.
    private static final int STATUS_JUGADOR_ACTIVO = 1;
    private static final int TIPO_USUARIO_JUGADOR = 2;
    private static final int TARJETAS_AMARILLAS = 0;
    private static final int TARJETAS_ROJAS = 0;
    private static final int EQUIPO = 1;

    public void insertar(Jugador jugador) {
        // El comando sql lo guarde en un string para manejar de mejor forma el try.
        String sql = "INSERT INTO jugadores(nombre_jugador, edad, numero_dorsal, sexo, tarjetas_amarillas, tarjetas_rojas, status_jugador, id_equipo, id_tipo_usuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, jugador.getNombreJugador());
            ps.setInt(2, jugador.getEdad());
            ps.setInt(3, jugador.getNumeroDorsal());
            ps.setString(4, jugador.getSexo());
            ps.setInt(5, TARJETAS_AMARILLAS);
            ps.setInt(6, TARJETAS_ROJAS);
            ps.setInt(7, STATUS_JUGADOR_ACTIVO);
            ps.setLong(8, jugador.getEquipo().getIdEquipo());
            ps.setInt(9, TIPO_USUARIO_JUGADOR);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizar(Jugador jugador) {
        String sql = "UPDATE jugadores SET nombre_jugador=?, edad=?, numero_dorsal=?, sexo=?, id_equipo=? WHERE id_jugador=?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, jugador.getNombreJugador());
            ps.setInt(2, jugador.getEdad());
            ps.setInt(3, jugador.getNumeroDorsal());
            ps.setString(4, jugador.getSexo());
            ps.setLong(5, jugador.getEquipo().getIdEquipo());
            ps.setLong(6, jugador.getIdJugador());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar(long id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM jugadores WHERE id_jugador=?");
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Jugador buscarPorId(long id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT j.*, e.* FROM jugadores j INNER JOIN equipos e ON j.id_equipo = e.id_equipo WHERE j.id_jugador=?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jugador jugador = new Jugador();
                jugador.setIdJugador(rs.getLong("id_jugador"));
                jugador.setNombreJugador(rs.getString("nombre_jugador"));
                jugador.setEdad(rs.getInt("edad"));
                jugador.setSexo(rs.getString("sexo"));
                jugador.setNumeroDorsal(rs.getInt("numero_dorsal"));

                Equipo equipo = new Equipo();
                equipo.setIdEquipo(rs.getLong("id_equipo"));
                equipo.setNombreEquipo(rs.getString("nombre_equipo"));
                jugador.setEquipo(equipo);

                return jugador;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
