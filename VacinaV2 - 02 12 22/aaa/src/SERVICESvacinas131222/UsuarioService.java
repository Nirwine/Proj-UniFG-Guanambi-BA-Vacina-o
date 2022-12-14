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
public class UsuarioService {

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////LOGAR//////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Connection conexao;

    public ResultSet logar(String cpf, String senha) {
        Connection conexao = new Conexao().ConectaBD();
        try {
            String sqlt = "SELECT * FROM vacinas.usuarios where CPF=? and Senha=?";
            PreparedStatement pstm = conexao.prepareStatement(sqlt);
            pstm.setString(1, cpf);
            pstm.setString(2, senha);
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar esta ação!");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////CRIAR///////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void createUsuario(UsuarioModel usuario) {
        try {
            String sql = "INSERT INTO vacinas.usuarios(Nome, Senha, CPF, CNS, Ident_genero, Nacionalidade, D_Nascimento, RC, Alergia, Email) VALUES(?,?,?,?,?,?,?,?,?,?)";
            Connection conexao = new Conexao().ConectaBD();
            try ( PreparedStatement pstm = conexao.prepareStatement(sql)) {
                pstm.setString(1, usuario.getNome());
                pstm.setString(2, usuario.getSenha());
                pstm.setString(3, usuario.getCpf());
                pstm.setString(4, usuario.getCns());
                pstm.setString(5, usuario.getGenero());
                pstm.setString(6, usuario.getNacionalidade());
                pstm.setString(7, usuario.getDatanasciment());
                pstm.setString(8, usuario.getRacacor());
                pstm.setString(9, usuario.getAlergias());
                pstm.setString(10, usuario.getEmail());

                pstm.execute();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar esta ação!");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
