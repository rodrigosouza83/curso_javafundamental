package entitie;

import java.util.Objects;

public class Cadastro {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cadastro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cadastro)) return false;
        Cadastro cadastro = (Cadastro) o;
        return cpf.equals(cadastro.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
