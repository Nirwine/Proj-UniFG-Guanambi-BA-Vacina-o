package REPOSITORY;

import MODELS.VacinaModel;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VacinaRepository {

    Connection conexao;

    public void createVacina(VacinaModel vacina) {
        try {
            String sql = "insert into vacina (imunobiologico, Estrategia,Dose,Aprazamento,Localaplicacao,lotefab,UnidadeSaude,VAdministracao,Observacao) values (?,?,?,?,?,?,?,?,?)";
            conexao = new Conexao().ConectaBD();
            try (PreparedStatement pstm = conexao.prepareStatement(sql)) {
                pstm.setString(1,vacina.getImunobiologico());
                pstm.setString(2,vacina.getEstrategia());
                pstm.setString(3,vacina.getDose());
                pstm.setString(4,vacina.getApazamento());
                pstm.setString(5,vacina.getLocalaplicacao());
                pstm.setString(6,vacina.getLotefab());
                pstm.setString(7,vacina.getUnidadeSaude());
                pstm.setString(8,vacina.getVAdministracao());
                pstm.setString(9,vacina.getObservacao());
                
                pstm.execute();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar esta ação!");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<VacinaModel> readAllVacinas() {
        return null;
    }

    public void UpdateVacina(VacinaModel vacina) {
    }

    public void deleteVacina(VacinaModel vacina) {
    }

    public Connection getConexao() {
        return conexao;
    }

}
