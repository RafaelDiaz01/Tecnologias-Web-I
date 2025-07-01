package com.unsij.dao;

import com.unsij.beans.Temporada;
import com.unsij.utils.DBConnection;

import java.sql.*;
import java.util.*;

/**
 *
 * @author diaz
 */
public class TemporadasDAO {

    public List<Temporada> listar() {
        List<Temporada> lista = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM temporadas");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Temporada temporada = new Temporada();
                temporada.setIdTemporada(rs.getLong("id_temporada"));
                temporada.setNombreTemporada(rs.getString("nombre_temporada"));
                temporada.setAño(rs.getString("año"));
                temporada.setEquiposParticipantes(rs.getInt("equipos_participantes"));
                temporada.setCategoriasParticipantes(rs.getInt("categorias_participantes"));
                lista.add(temporada);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Agrega esto para ver errores
        }
        return lista;
    }

    public void insertar(Temporada temporada) {
        // El comando sql lo guarde en un string para manejar de mejor forma el try.
        String sql = "INSERT INTO temporadas(nombre_temporada, año, equipos_participantes, categorias_participantes) VALUES(?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, temporada.getNombreTemporada());
            ps.setString(2, temporada.getAño());
            ps.setInt(3, temporada.getEquiposParticipantes());
            ps.setInt(4, temporada.getCategoriasParticipantes());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizar(Temporada temporada) {
        String sql = "UPDATE temporadas SET nombre_temporada=?, año=?, equipos_participantes=?, categorias_participantes=? WHERE id_temporada=?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, temporada.getNombreTemporada());
            ps.setString(2, temporada.getAño());
            ps.setInt(3, temporada.getEquiposParticipantes());
            ps.setInt(4, temporada.getCategoriasParticipantes());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar(long id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM temporadas WHERE id_temporada=?");
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Temporada buscarPorId(long id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM temporadas WHERE id_temporada=?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Temporada temporada = new Temporada();
                temporada.setIdTemporada(rs.getLong("id_temporada"));
                temporada.setNombreTemporada(rs.getString("nombre_temporada"));
                temporada.setAño(rs.getString("año"));
                temporada.setEquiposParticipantes(rs.getInt("equipos_participantes"));
                temporada.setCategoriasParticipantes(rs.getInt("categorias_participantes"));
                return temporada;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
