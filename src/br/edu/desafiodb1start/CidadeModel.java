package br.edu.desafiodb1start;

public class CidadeModel {
	private String cidade;
	private String ufCidade;
	private Boolean isCapital;
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getUfCidade() {
		return ufCidade;
	}
	
	public void setUfCidade(String ufCidade) {
		this.ufCidade = ufCidade;
	}
	
	public Boolean getIsCapital() {
		return isCapital;
	}
	
	public void setIsCapital(Boolean isCapital) {
		this.isCapital = isCapital;
	}

}
