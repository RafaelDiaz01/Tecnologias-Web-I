package com.unsij.dao;

import com.unsij.beans.TipoUsuario;
import com.unsij.utils.DBConnection;

import java.sql.*;
import java.util.*;

/**
 *
 * @author rafaeldiaz
 */
public class TipoUsuarioDAO {

    public List<TipoUsuario> listar() {
        List<TipoUsuario> lista = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM tipo_usuarios");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoUsuario u = new TipoUsuario();
                u.setIdTipoUsuario(rs.getInt("id_tipo_usuario"));
                u.setTipo(rs.getString("tipo"));
                u.setDescripcion(rs.getString("descripcion"));
                lista.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void insertar(TipoUsuario u) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO tipo_usuarios(tipo, descripcion) VALUES(?, ?)");
            ps.setString(1, u.getTipo());
            ps.setString(2, u.getDescripcion());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public TipoUsuario buscarPorId(int id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM tipo_usuarios WHERE id_tipo_usuario=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                TipoUsuario u = new TipoUsuario();
                u.setIdTipoUsuario(rs.getInt("id_tipo_usuario"));
                u.setTipo(rs.getString("tipo"));
                u.setDescripcion(rs.getString("descripcion"));
                return u;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizar(TipoUsuario u) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("UPDATE tipo_usuarios SET tipo=?, descripcion=? WHERE id_tipo_usuario=?");
            ps.setString(1, u.getTipo());
            ps.setString(2, u.getDescripcion());
            ps.setLong(3, u.getIdTipoUsuario());
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
