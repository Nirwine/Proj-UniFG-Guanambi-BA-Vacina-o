package MODELS;

public class VacinaModel {

    private int ID_vacina;
    private String Imunobiologico;
    private String Estrategia;
    private String Dose;
    private String Apazamento;
    private String Localaplicacao;
    private String lotefab;
    private String UnidadeSaude;
    private String VAdministracao;
    private String Observacao;

    public VacinaModel(String Imunobiologico, String Estrategia, String Dose, String Apazamento, String Localaplicacao, String lotefab, String UnidadeSaude, String VAdministracao, String Observacao) {
        this.Imunobiologico = Imunobiologico;
        this.Estrategia = Estrategia;
        this.Dose = Dose;
        this.Apazamento = Apazamento;
        this.Localaplicacao = Localaplicacao;
        this.lotefab = lotefab;
        this.UnidadeSaude = UnidadeSaude;
        this.VAdministracao = VAdministracao;
        this.Observacao = Observacao;
    }

    public int getID_vacina() {
        return ID_vacina;
    }

    public void setID_vacina(int ID_vacina) {
        this.ID_vacina = ID_vacina;
    }

    public String getImunobiologico() {
        return Imunobiologico;
    }

    public void setImunobiologico(String Imunobiologico) {
        this.Imunobiologico = Imunobiologico;
    }

    public String getEstrategia() {
        return Estrategia;
    }

    public void setEstrategia(String Estrategia) {
        this.Estrategia = Estrategia;
    }

    public String getDose() {
        return Dose;
    }

    public void setDose(String Dose) {
        this.Dose = Dose;
    }

    public String getApazamento() {
        return Apazamento;
    }

    public void setApazamento(String Apazamento) {
        this.Apazamento = Apazamento;
    }

    public String getLocalaplicacao() {
        return Localaplicacao;
    }

    public void setLocalaplicacao(String Localaplicacao) {
        this.Localaplicacao = Localaplicacao;
    }

    public String getLotefab() {
        return lotefab;
    }

    public void setLotefab(String lotefab) {
        this.lotefab = lotefab;
    }

    public String getUnidadeSaude() {
        return UnidadeSaude;
    }

    public void setUnidadeSaude(String UnidadeSaude) {
        this.UnidadeSaude = UnidadeSaude;
    }

    public String getVAdministracao() {
        return VAdministracao;
    }

    public void setVAdministracao(String VAdministracao) {
        this.VAdministracao = VAdministracao;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

}
