package com.unsij.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rafaeldiaz
 */

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ligaMunicipalFutbol?useSSL=false&serverTimezone=UTC",
                "root",
                "root"
            );
        } catch (Exception e) {
            throw new RuntimeException("Error de conexión", e);
        }
    }
}
