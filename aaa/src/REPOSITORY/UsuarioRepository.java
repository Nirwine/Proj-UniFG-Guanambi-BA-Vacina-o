package REPOSITORY;

import MODELS.UsuarioModel;
import Telas.TelaPrincipal;
import Telas.TelaPrincipalUsuario;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UsuarioRepository {

    Connection conexao;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////CRIAR///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void createUsuario(UsuarioModel usuario) {
        try {
            String sql = "INSERT INTO vacinas.usuarios(Nome, Senha, CPF, CNS, Ident_genero, Nacionalidade, D_Nascimento, RC, Alergia, Email) VALUES(?,?,?,?,?,?,?,?,?,?)";
            conexao = new Conexao().ConectaBD();
            try ( PreparedStatement pstm = conexao.prepareStatement(sql)) {
                pstm.setString(1, usuario.getNome());
                pstm.setString(2, usuario.getSenha());
                pstm.setString(3, usuario.getCns());
                pstm.setString(4, usuario.getCpf());
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////LISTAR//////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public List<UsuarioModel> readAllUsuarios() throws SQLException {
        String sql = "SELECT ID,Nome,CNS,Email FROM vacinas.usuarios";
        conexao = new Conexao().ConectaBD();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<UsuarioModel> listausuario = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("ID");
            String nome = rs.getString("Nome");
            String cns = rs.getString("CNS");
            String email = rs.getString("Email");
            UsuarioModel usuario = new UsuarioModel();
            usuario.setId(id);
            usuario.setNome(nome);
            usuario.setCns(cns);
            usuario.setEmail(email);
            listausuario.add(usuario);

        }
        return listausuario;

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////LOGAR//////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void logar(String cpf, String senha) {

        String sqlt = "SELECT * FROM vacinas.usuarios where CPF=? and Senha=?";
        conexao = new Conexao().ConectaBD();

        try {
            //Prepara a consulta no BD digitados na caixa de texto//
            // ? = conteúdo no BD
            PreparedStatement pstm = conexao.prepareStatement(sqlt);
           //>>>>   ---------------
            pstm.setString(1, cpf);
//CADA STRING TENHO Q BOTAR UM NEGÓCIO DESSE 
// -----------------
            pstm.setString(2, senha);

            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                if(rs.getBoolean("admin")){
                     new TelaPrincipal().setVisible(true);
                }else{new TelaPrincipalUsuario().setVisible(true);
                }
            } else {
                
                JOptionPane.showMessageDialog(null, "Usuario/Senha INVÁLIDO! Tente novamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar esta ação!");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
