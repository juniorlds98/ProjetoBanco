package br.com.meubuscadordecep.cliente;

import br.com.meubuscadordecep.dominio.Cliente;
import br.com.meubuscadordecep.cliente.Endereco;
import br.com.meubuscadordecep.viacep.ServicoDeCep;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        //Objeto baseado em cliente
        //Cliente cliente1 = new Cliente("474.351.468-11", "José", "Junior", "02311-160", "12.345.678-9");
        String cep = "02311-160";
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());

    }
}