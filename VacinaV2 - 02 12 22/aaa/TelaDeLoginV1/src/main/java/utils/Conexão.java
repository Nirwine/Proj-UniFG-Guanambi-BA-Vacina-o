/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jvfs2
 */
public class Conexão {

    public static Connection getConexao() {
        try {
                 Connection connection = DriveMenager.getConnection("jdbc:sqsql:localhost:3306/vacina," root","");
        } catch (SQLException e) {
                }
            return null;
        }
    }
