package br.com.alura.desafioalura.modelos;

public class Audio {
	private String titulo;
	private double duracao;
	private int totalReproducoes;
	private int curtidas;
	private int classificacao;
	
	
	
	public void daCurtida() {
		curtidas++;
	}

	public void reproduz() {
		totalReproducoes++;
	}

	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public double getDuracao() {
		return duracao;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}


	public int getCurtidas() {
		return curtidas;
	}


	public int getClassificacao() {
		return classificacao;
	}

	
	public void classificacao(double classificacao) {
		this.classificacao+=classificacao;
	}
	
}
