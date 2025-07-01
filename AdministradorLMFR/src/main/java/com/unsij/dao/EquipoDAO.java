package com.unsij.dao;

import com.unsij.beans.Equipo;
import com.unsij.utils.DBConnection;

import java.sql.*;
import java.util.*;

/**
 *
 * @author diaz
 */
public class EquipoDAO {

    public List<Equipo> listar() {
        List<Equipo> lista = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM equipos");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Equipo equipo = new Equipo();
                equipo.setIdEquipo(rs.getLong("id_equipo"));
                equipo.setNombreEquipo(rs.getString("nombre_equipo"));
                equipo.setTotalJugadores(rs.getInt("total_jugadores"));
                equipo.setProcedencia(rs.getString("procedencia"));
                equipo.setCapitan(rs.getString("capitan"));
                lista.add(equipo);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Agrega esto para ver errores
        }
        return lista;
    }

    // Use constantes ya que por lo mientras insertaré en una categoria.
    private static final int CATEGORIA = 1;

    public void insertar(Equipo equipo) {
        // El comando sql lo guarde en un string para manejar de mejor forma el try.
        String sql = "INSERT INTO equipos(nombre_equipo, total_jugadores, procedencia, capitan, id_categoria) VALUES(?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, equipo.getNombreEquipo());
            ps.setInt(2, equipo.getTotalJugadores());
            ps.setString(3, equipo.getProcedencia());
            ps.setString(4, equipo.getCapitan());
            ps.setInt(5, CATEGORIA);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizar(Equipo equipo) {
        String sql = "UPDATE equipos SET nombre_equipo=?, total_jugadores=?, procedencia=?, capitan=? WHERE id_equipo=?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, equipo.getNombreEquipo());
            ps.setInt(2, equipo.getTotalJugadores());
            ps.setString(3, equipo.getProcedencia());
            ps.setString(4, equipo.getCapitan());
            ps.setLong(5, equipo.getIdEquipo());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void eliminar(long id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM equipos WHERE id_equipo=?");
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Equipo buscarPorId(long id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM equipos WHERE id_equipo=?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Equipo equipo = new Equipo();
                equipo.setIdEquipo(rs.getLong("id_equipo"));
                equipo.setNombreEquipo(rs.getString("nombre_equipo"));
                equipo.setTotalJugadores(rs.getInt("total_jugadores"));
                equipo.setProcedencia(rs.getString("procedencia"));
                equipo.setCapitan(rs.getString("capitan"));
                return equipo;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
