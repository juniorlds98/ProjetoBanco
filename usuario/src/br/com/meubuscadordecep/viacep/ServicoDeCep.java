package br.com.meubuscadordecep.viacep;

import br.com.meubuscadordecep.cliente.Endereco;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServicoDeCep {
    static String webService = "http://viacep.com.br/ws/";
    static int codigoSucesso = 200;

    public static Endereco buscaEnderecoPelo(String cep) throws Exception {
        String urlParaChamada = webService + cep + "/json";
        StringBuilder jsonEmString = new StringBuilder();

        try {

            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("Erro de código HTTP: " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String linha;
            while ((linha = resposta.readLine()) != null) {
                jsonEmString.append(linha);
            }

            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(jsonEmString.toString(), Endereco.class);

            return endereco;
        } catch (Exception e) {
            throw new Exception("Erro: " + e);
        }
    }
}

