package br.com.meubuscadordecep.cliente;

import br.com.meubuscadordecep.dominio.Cliente;
import br.com.meubuscadordecep.cliente.Endereco;
import br.com.meubuscadordecep.dominio.ClienteManager;
import br.com.meubuscadordecep.viacep.ServicoDeCep;
import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ClienteManager manager = new ClienteManager();
        manager.adicionarClientes();

        System.out.println("\nLista de clientes cadastrado: ");
        manager.listarClientes();
    }
}