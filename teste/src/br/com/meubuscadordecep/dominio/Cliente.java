package br.com.meubuscadordecep.dominio;

public class Cliente {
    //Propriedades (atributos) - características

    String cpf;
    String rg;
    String nome;
    String sobrenome;
    String cep;

    //Construtor da classe

    public Cliente (String cpf, String nome, String sobrenome, String cep, String rg){
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    //Ações

    public void transferir() {

    }

    public void receber() {

    }

    public void consultarSaldo() {

    }

}
