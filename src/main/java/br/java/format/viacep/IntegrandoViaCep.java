package br.java.format.viacep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class IntegrandoViaCep {

	public static void main(String[] args) throws IOException {

		// Consumindo dados via fluxo de entrada InputStream

		URL url = new URL("http://viacep.com.br/ws/41290221/json/");
		HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
		conexao.setRequestMethod("GET");

		InputStream inputStream = conexao.getInputStream();
		InputStreamReader isr = new InputStreamReader(inputStream, "utf-8");
		BufferedReader br = new BufferedReader(isr);

		br.lines().forEach(linha -> System.out.println(linha));

		/* Parseando com Jackson */
		// https://www.journaldev.com/2324/jackson-json-java-parser-api-example-tutorial

		// Consumindo dados usando API Via Cep conforme dependency maven

		ViaCEPClient cliente = new ViaCEPClient();
		ViaCEPEndereco endereco = cliente.getEndereco("41290221");
		System.out.println(endereco.getBairro());

	}
}
