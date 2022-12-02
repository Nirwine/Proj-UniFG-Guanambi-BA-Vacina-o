package Thomas;

public class Registro {
    public String senha;
    public String email;
    public String nomeusuario;
    public int cpf;
    public int cns;

    private void Cadastro(String senha, String email, String nomeusuario, int cpf, int cns) {
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
}