package br.com.fiap.model;

public class DadosMissao {
	private String coordenadas;
	private int codigoDeAcesso;
	private double nivelCombustivel;
	private int numeroTripulantes;

	public DadosMissao(String coordenadas, int codigoDeAcesso, double nivelCombustivel, int numeroTripulantes) {
		this.coordenadas = coordenadas;
		this.codigoDeAcesso = codigoDeAcesso;
		this.nivelCombustivel = nivelCombustivel;
		this.numeroTripulantes = numeroTripulantes;
	}

	public String getCoordenadas(int codigo) {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;

	}

	public int getCodigoDeAcesso() {
		return codigoDeAcesso;
	}

	public void setCodigoDeAcesso(int codigoDeAcesso) {
		this.codigoDeAcesso = codigoDeAcesso;
	}

	public double getNivelCombustivel() {
		return nivelCombustivel;
	}

	public void setNivelCombustivel(double nivelCombustivel) {
		if (nivelCombustivel >= 0 && nivelCombustivel <= 100) {
			this.nivelCombustivel = nivelCombustivel;
		}
	}

	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}

	public void setNumeroTripulantes(int numeroTripulantes) {
		this.numeroTripulantes = numeroTripulantes;
	}

	public void verificarCombustivel() {
		if (nivelCombustivel < 20) {
			System.out.println("ALERTA: Combustível abaixo de 20%");
		}
	}

}
