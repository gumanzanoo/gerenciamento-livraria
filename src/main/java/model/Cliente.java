package model;

import model.Endereco;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String cpf;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String email, String telefone, String cpf, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + '\n' +
                "Sobrenome: " + getSobrenome() + '\n' +
                "Email: " + getEmail() + '\n' +
                "Telefone: " + getTelefone() + '\n' +
                '\n' + "Endereco: " + '\n' + getEndereco();
    }
}
