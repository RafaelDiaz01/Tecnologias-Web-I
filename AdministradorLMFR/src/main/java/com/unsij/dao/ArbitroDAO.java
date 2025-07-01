package com.unsij.dao;

import com.unsij.beans.Arbitro;
import com.unsij.utils.DBConnection;

import java.sql.*;
import java.util.*;

/**
 *
 * @author diaz
 */
public class ArbitroDAO {

    public List<Arbitro> listar() {
        List<Arbitro> lista = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM arbitros");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Arbitro u = new Arbitro();
                u.setIdArbitro(rs.getLong("id_arbitro"));
                u.setNombreCompleto(rs.getString("nombre_completo"));
                u.setEdad(rs.getInt("edad"));
                u.setSexo(rs.getString("sexo"));
                u.setStatusArbitro(rs.getBoolean("status_arbitro"));
                lista.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Agrega esto para ver errores
        }
        return lista;
    }

    // Use constantes ya que siempre se insertará un arbitro activo y con tipo de usuario 3.
    private static final int STATUS_ARBITRO_ACTIVO = 1;
    private static final int TIPO_USUARIO_ARBITRO = 3;

    public void insertar(Arbitro arbitro) {
        // El comando sql lo guarde en un string para manejar de mejor forma el try.
        String sql = "INSERT INTO arbitros(nombre_completo, edad, sexo, status_arbitro, id_tipo_usuario) VALUES(?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, arbitro.getNombreCompleto());
            ps.setInt(2, arbitro.getEdad());
            ps.setString(3, arbitro.getSexo());
            ps.setInt(4, STATUS_ARBITRO_ACTIVO);
            ps.setInt(5, TIPO_USUARIO_ARBITRO);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizar(Arbitro arbitro) {
        String sql = "UPDATE arbitros SET nombre_completo=?, edad=?, sexo=? WHERE id_arbitro=?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, arbitro.getNombreCompleto());
            ps.setInt(2, arbitro.getEdad());
            ps.setString(3, arbitro.getSexo());
            ps.setLong(4, arbitro.getIdArbitro());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void eliminar(long id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM arbitros WHERE id_arbitro=?");
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Arbitro buscarPorId(long id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM arbitros WHERE id_arbitro=?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Arbitro arbitro = new Arbitro();
                arbitro.setIdArbitro(rs.getLong("id_arbitro"));
                arbitro.setNombreCompleto(rs.getString("nombre_completo"));
                arbitro.setEdad(rs.getInt("edad"));
                arbitro.setSexo(rs.getString("sexo"));
                return arbitro;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
