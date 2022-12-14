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
