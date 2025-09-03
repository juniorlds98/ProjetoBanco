package br.com.meubuscadordecep.dominio;

import br.com.meubuscadordecep.cliente.Endereco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cliente {
    //Propriedades (atributos) - características

    String cpf;
    String rg;
    String nome;
    String sobrenome;
    String cep;
    Endereco endereco;
    //Construtor da classe

    public Cliente (String cpf, String nome, String sobrenome, String cep, String rg){
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
    }

    //Construtor de Cliente

    public Cliente() {}

    public String getCpf() { return cpf;}
    public void setCpf(String cpf) { this.cpf = cpf;}

    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg;}

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco){ this.endereco = endereco; }
}
