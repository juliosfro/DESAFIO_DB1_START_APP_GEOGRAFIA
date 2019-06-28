package br.edu.desafiodb1start;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static ArrayList<CidadeModel> listaCidade = new ArrayList<CidadeModel>();

	public static void main(String[] args) {

		CidadeModel curitiba = new CidadeModel();
		curitiba.setCidade("Curitiba");
		curitiba.setUfCidade("PR");
		curitiba.setIsCapital(true);

		CidadeModel maringa = new CidadeModel();
		maringa.setCidade("Maringá");
		maringa.setUfCidade("PR");
		maringa.setIsCapital(false);

		CidadeModel londrina = new CidadeModel();
		londrina.setCidade("Londrina");
		londrina.setUfCidade("PR");
		londrina.setIsCapital(false);

		CidadeModel pinhais = new CidadeModel();
		pinhais.setCidade("Pinhais");
		pinhais.setUfCidade("PR");
		pinhais.setIsCapital(false);

		CidadeModel chapeco = new CidadeModel();
		chapeco.setCidade("Chapecó");
		chapeco.setUfCidade("SC");
		chapeco.setIsCapital(false);

		CidadeModel joinvile = new CidadeModel();
		joinvile.setCidade("Joinvile");
		joinvile.setUfCidade("SC");
		joinvile.setIsCapital(false);

		CidadeModel blumenau = new CidadeModel();
		blumenau.setCidade("Blumenau");
		blumenau.setUfCidade("SC");
		blumenau.setIsCapital(false);

		CidadeModel florianopolis = new CidadeModel();
		florianopolis.setCidade("Florianópolis");
		florianopolis.setUfCidade("SC");
		florianopolis.setIsCapital(true);

		CidadeModel portoAlegre = new CidadeModel();
		portoAlegre.setCidade("Porto Alegre");
		portoAlegre.setUfCidade("RS");
		portoAlegre.setIsCapital(true);

		CidadeModel gramado = new CidadeModel();
		gramado.setCidade("Gramado");
		gramado.setUfCidade("RS");
		gramado.setIsCapital(false);

		listaCidade.add(curitiba);
		listaCidade.add(maringa);
		listaCidade.add(londrina);
		listaCidade.add(pinhais);
		listaCidade.add(chapeco);
		listaCidade.add(joinvile);
		listaCidade.add(blumenau);
		listaCidade.add(florianopolis);
		listaCidade.add(portoAlegre);
		listaCidade.add(gramado);

		solicitaNomeCidade();
	}

	public static void solicitaNomeCidade() {
		System.out.println("Informe a cidade: ");
		Scanner leitor = new Scanner(System.in);
		if (leitor.hasNext()) {
			pesquisaCidade(leitor.nextLine());	
		}
		leitor.close();
	}

	public static void pesquisaCidade(String cidadeDigitada) {
		CidadeServices serviceCidade = new CidadeServices();
		String cidade = serviceCidade.pesquisaCidade(cidadeDigitada, listaCidade);
		if (cidade != null) {
			imprimeDadosCidade(cidade);
		} 
	}

	public static void imprimeDadosCidade(String dadosCidade) {
		System.out.println(dadosCidade);
		solicitaNomeCidade();
	}
}
