/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICES;

import MODELS.UsuarioModel;
import REPOSITORY.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author jvfs2
 */
public class AdminService {

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////LOGAR//////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Connection conexao;

    public ResultSet logaradmin(String usuario_admin, String senha_admin) {
        Connection conexao = new Conexao().ConectaBD();
        try {
            String sqlt = "SELECT * FROM vacinas.admin where usuario_admin=? and senha_admin=?";
            PreparedStatement pstm = conexao.prepareStatement(sqlt);
            pstm.setString(1, usuario_admin);
            pstm.setString(2, senha_admin);
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar esta ação!");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
}
