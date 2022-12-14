package REPOSITORY;

import MODELS.UsuarioModel;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsuarioRepository {

    Connection conexao;
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
}
