package MODELS;

public class VacinaModel {
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

    public String getImunobiologico() {
        return Imunobiologico;
    }

    public String getEstrategia() {
        return Estrategia;
    }

    public String getDose() {
        return Dose;
    }

    public String getApazamento() {
        return Apazamento;
    }

    public String getLocalaplicacao() {
        return Localaplicacao;
    }

    public String getLotefab() {
        return lotefab;
    }

    public String getUnidadeSaude() {
        return UnidadeSaude;
    }

    public String getVAdministracao() {
        return VAdministracao;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setImunobiologico(String Imunobiologico) {
        this.Imunobiologico = Imunobiologico;
    }

    public void setEstrategia(String Estrategia) {
        this.Estrategia = Estrategia;
    }

    public void setDose(String Dose) {
        this.Dose = Dose;
    }

    public void setApazamento(String Apazamento) {
        this.Apazamento = Apazamento;
    }

    public void setLocalaplicacao(String Localaplicacao) {
        this.Localaplicacao = Localaplicacao;
    }

    public void setLotefab(String lotefab) {
        this.lotefab = lotefab;
    }

    public void setUnidadeSaude(String UnidadeSaude) {
        this.UnidadeSaude = UnidadeSaude;
    }

    public void setVAdministracao(String VAdministracao) {
        this.VAdministracao = VAdministracao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
    
}
