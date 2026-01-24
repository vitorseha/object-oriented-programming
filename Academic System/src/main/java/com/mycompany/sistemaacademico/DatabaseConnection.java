/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DATABASE = "ACADEMIC_SYSTEM";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() throws SQLException {

        String url = String.format(
            "jdbc:mysql://%s:%s/%s"
            + "?useSSL=false"
            + "&serverTimezone=America/Sao_Paulo",
            HOST,
            PORT,
            DATABASE
        );

        return DriverManager.getConnection(url, USER, PASSWORD);
    }
}
