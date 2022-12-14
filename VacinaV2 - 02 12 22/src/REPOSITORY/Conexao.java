package REPOSITORY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection ConectaBD() {
        Connection Conexao = null;
        try {

            String URL = "jdbc:mysql://localhost:3306/vacinas?user=root&password=";
            Conexao = DriverManager.getConnection(URL);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possível conectar ao Banco de Dados");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return Conexao;
    }

}
