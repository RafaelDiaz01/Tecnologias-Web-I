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
        System.out.println("DEBUG: Intentando conectar a la base de datos...");

        try (Connection conn = DBConnection.getConnection()) {
            System.out.println("DEBUG: Conexión establecida con éxito");

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
}
