/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICES;

import MODELS.VacinaModel;
import REPOSITORY.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////CRIAR///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class VacinaService {
    public void createVacina (VacinaModel vacina) {
        try {
            String sql = "insert into vacina (id_vacina, imunobiologico, Estrategia,Dose,Aprazamento,Localaplicacao,lotefab,UnidadeSaude,VAdministracao,Observacao) values (?,?,?,?,?,?,?,?,?,?)";
            Connection conexao = new Conexao().ConectaBD();
            try (PreparedStatement pstm = conexao.prepareStatement(sql)) {
                pstm.setInt(1,vacina.getID_vacina());
                pstm.setString(2,vacina.getImunobiologico());
                pstm.setString(3,vacina.getEstrategia());
                pstm.setString(4,vacina.getDose());
                pstm.setString(5,vacina.getApazamento());
                pstm.setString(6,vacina.getLocalaplicacao());
                pstm.setString(7,vacina.getLotefab());
                pstm.setString(8,vacina.getUnidadeSaude());
                pstm.setString(9,vacina.getVAdministracao());
                pstm.setString(10,vacina.getObservacao());
                
                pstm.execute();
            } 
            
        } catch (SQLException ex) {
          //  JOptionPane.showMessageDialog(null, "Não foi possível realizar esta ação!");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
