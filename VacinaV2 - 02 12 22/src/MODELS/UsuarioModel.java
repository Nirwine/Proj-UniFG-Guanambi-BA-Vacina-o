package MODELS;

public class UsuarioModel {

    private int id;
    private String nome;
    private String senha;
    private String cpf;
    private String cns;
    private String nacionalidade;
    private String datanasciment;
    private String racacor;
    private String genero;
    private String alergias;
    private String email;
    private boolean admin;
    
    public UsuarioModel(String nome, String senha, String cpf, String cns, String nacionalidade, String datanasciment, String racacor, String genero, String alergias, String email) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.cns = cns;
        this.nacionalidade = nacionalidade;
        this.datanasciment = datanasciment;
        this.racacor = racacor;
        this.genero = genero;
        this.alergias = alergias;
        this.email = email;
        
    }

    public UsuarioModel() {
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getDatanasciment() {
        return datanasciment;
    }

    public void setDatanasciment(String datanasciment) {
        this.datanasciment = datanasciment;
    }

    public String getRacacor() {
        return racacor;
    }

    public void setRacacor(String racacor) {
        this.racacor = racacor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
