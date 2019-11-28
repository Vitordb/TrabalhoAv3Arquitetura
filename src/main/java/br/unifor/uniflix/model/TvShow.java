package br.unifor.uniflix.model;

public class TvShow {
	private String name;
	private double contadorVotos;
	private String lingua;
	private String resumo;
		

	public String getLingua() {
		return lingua;
	}

	public void setLingua(String lingua) {
		this.lingua = lingua;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public double getContadorVotos() {
		return contadorVotos;
	}

	public void setContadorVotos(double contadorVotos) {
		this.contadorVotos = contadorVotos;
	}

	
}
