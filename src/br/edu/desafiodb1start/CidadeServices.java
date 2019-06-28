package br.edu.desafiodb1start;

import java.util.ArrayList;

public class CidadeServices {

	public String pesquisaCidade(String cidadeDigitada, ArrayList<CidadeModel> listaCidade) {
		for(int i = 0; i < listaCidade.size(); i++) {
			if (listaCidade.get(i).getCidade().equalsIgnoreCase(cidadeDigitada)) {
				return dadosCidade(listaCidade.get(i)); 
			} 
		}		
		return dadosCidade(null);
	}

	public String isCapital(CidadeModel cidade) {
		if(cidade.getIsCapital()) {
			return "é capital";
		} else {
			return "não é capital";
		}
	}

	public String dadosCidade(CidadeModel cidade) {
		if (cidade != null) {
			return "Pertence a(o) " + cidade.getUfCidade() + ", " + isCapital(cidade);
		} else {
			return "Cidade não cadastrada";
		}
	}
}
