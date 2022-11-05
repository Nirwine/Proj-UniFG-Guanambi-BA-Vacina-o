
public class vacinas {
    

private class Cadastro {
    public String senha;
    public String email;
    public String nomeusuario;
    public int cpf;
    public int cns;

    public Cadastro(String senha, String email, String nomeusuario, int cpf, int cns) {
        super();
        this.senha = senha;
        this.email = email;
        this.nomeusuario = nomeusuario;
        this.cpf = cpf;
        this.cns = cns;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNomeusuario() {
        return nomeusuario;
    }
    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }
    public int getcpf() {
        return cpf;
    }
    public void setcpf(int cpf) {
        this.cpf = cpf;
    }
    public int getcns() {
        return cns;
    }
    public void setcns(double cns) {
    this.cns = (int) cns;
}
    
public class Login {
    public String usuario;
    public String senha;

    public Login(String usuario, String senha) {
        super();
        this.usuario = usuario;
        this.senha = senha;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


}
}
public class Data {
    public int dose;
    public String imunobiologico;
    public int aprazamento;
    public int lote;
    public int aplicaçao;
    public int atraso;
    public String observação;


    public Data(int dose, String imunobiologico, int aprazamento, int lote, int aplicaçao, int atraso,
            String observação) {
        super();
        this.dose = dose;
        this.imunobiologico = imunobiologico;
        this.aprazamento = aprazamento;
        this.lote = lote;
        this.aplicaçao = aplicaçao;
        this.atraso = atraso;
        this.observação = observação;
    }
    public int getDose() {
        return dose;
    }
    public void setDose(int dose) {
        this.dose = dose;
    }
    public int getAplicaçao() {
        return aplicaçao;
    }
    public void setAplicaçao(int aplicaçao) {
        this.aplicaçao = aplicaçao;
    }
    public int getAtraso() {
        return atraso;
    }
    public void setAtraso(int atraso) {
        this.atraso = atraso;
    }
    public String getObservação() {
        return observação;
    }
    public void setObservação(String observação) {
        this.observação = observação;
    }
    public String getImunobiologico() {
        return imunobiologico;
    }
    public void setImunobiologico(String imunobiologico) {
        this.imunobiologico = imunobiologico;
    }
    public int getAprazamento() {
        return aprazamento;
    }
    public void setAprazamento(int aprazamento) {
        this.aprazamento = aprazamento;
    }
    public int getLote() {
        return lote;
    }
    public void setLote(int lote) {
        this.lote = lote;
    }


}
public class Recsenha extends Senha {
    public boolean checkemail; //verifica se é INT e se o código é válido
    public String novasenha;

    public Recsenha(String usuario, String senha, boolean checkemail, String novasenha) {
        super(usuario, senha);
        this.checkemail = checkemail;
        this.novasenha = novasenha;
    }
    public boolean isCheckemail() {
        return checkemail;
    }
    public void setCheckemail(boolean checkemail) {
        this.checkemail = checkemail;
    }
    public String getNovasenha() {
        return novasenha;
    }
    public void setNovasenha(String novasenha) {
        this.novasenha = novasenha;
    }
}
public class Data {
    public int dose;
    public String imunobiologico;
    public int aprazamento;
    public int lote;
    public int aplicaçao;
    public int atraso;
    public String observação;


    public Data(int dose, String imunobiologico, int aprazamento, int lote, int aplicaçao, int atraso,
            String observação) {
        super();
        this.dose = dose;
        this.imunobiologico = imunobiologico;
        this.aprazamento = aprazamento;
        this.lote = lote;
        this.aplicaçao = aplicaçao;
        this.atraso = atraso;
        this.observação = observação;
    }
    public int getDose() {
        return dose;
    }
    public void setDose(int dose) {
        this.dose = dose;
    }
    public int getAplicaçao() {
        return aplicaçao;
    }
    public void setAplicaçao(int aplicaçao) {
        this.aplicaçao = aplicaçao;
    }
    public int getAtraso() {
        return atraso;
    }
    public void setAtraso(int atraso) {
        this.atraso = atraso;
    }
    public String getObservação() {
        return observação;
    }
    public void setObservação(String observação) {
        this.observação = observação;
    }
    public String getImunobiologico() {
        return imunobiologico;
    }
    public void setImunobiologico(String imunobiologico) {
        this.imunobiologico = imunobiologico;
    }
    public int getAprazamento() {
        return aprazamento;
    }
    public void setAprazamento(int aprazamento) {
        this.aprazamento = aprazamento;
    }
    public int getLote() {
        return lote;
    }
    public void setLote(int lote) {
        this.lote = lote;
    }


}
}
