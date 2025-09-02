package br.com.meubuscadordecep.cliente;

public class Endereco {
    String logradouro;
    String bairro;
    String localidade;

    public String getLogradouro() {
        return logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString(){
        return "Endereço{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + '}';
    }
}
