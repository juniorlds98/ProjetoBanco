package br.com.meubuscadordecep.dominio;

import br.com.meubuscadordecep.cliente.Endereco;
import br.com.meubuscadordecep.viacep.ServicoDeCep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClienteManager {
    private Map<String, Cliente> clientes = new HashMap<>();
    private Scanner ler = new Scanner(System.in);
    //Estrutura de repetição para inserção de dados
    public void adicionarClientes(){
        String condicao;
        do {
            System.out.println("Você quer adicionar mais uma pessoa: [s/n]");
            condicao = ler.nextLine();


            if (condicao.equals("s")){
                Cliente cliente = new Cliente();
                System.out.println("Digite o CPF: ");
                cliente.setCpf(ler.nextLine());
                System.out.println("Digite o Nome: ");
                cliente.setNome(ler.nextLine());
                System.out.println("Digite o Sobrenome: ");
                cliente.setSobrenome(ler.nextLine());
                System.out.println("Digite o CEP: ");
                cliente.setCep(ler.nextLine());
                String cep = cliente.getCep();
                try {
                    Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);
                    cliente.setEndereco(endereco);
                }catch (Exception e){
                    System.out.println("Erro ao buscar endereço pelo CEP: " + e.getMessage());
                }


                System.out.println("Digite o RG: ");
                cliente.setRg(ler.nextLine());

                clientes.put(cliente.getCpf(), cliente);
                System.out.println("Cliente adicionado com sucesso!");
            }

        } while (!condicao.equals("n"));
    }

    public  Cliente buscarClientePorCpf(String cpf){
        return clientes.get(cpf);
    }

    public void listarClientes(){
        for(Cliente c: clientes.values()){
            System.out.println(c.getNome() + " " + c.getSobrenome() + " - CPF: " + c.getCpf());
            Endereco e = c.getEndereco();
            if (e != null) {
                System.out.println("Logradouro: " + e.getLogradouro());
                System.out.println("Bairro: " + e.getBairro());
                System.out.println("Localidade: " + e.getLocalidade());
            }
        }
    }

}
