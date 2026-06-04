package br.com.fiap.model;

//Classe responsável por armazenar e proteger os dados da missão
public class DadosMissao {
	private String coordenadas;
	private int codigoDeAcesso;
	private double nivelCombustivel;
	private int numeroTripulantes;

	// Construtor da classe
	public DadosMissao(String coordenadas, int codigoDeAcesso, double nivelCombustivel, int numeroTripulantes) {
		this.coordenadas = coordenadas;
		this.codigoDeAcesso = codigoDeAcesso;
		this.nivelCombustivel = nivelCombustivel;
		this.numeroTripulantes = numeroTripulantes;
	}

	// Retorna as coordenadas da missão
	public String getCoordenadas(int codigo) {
		return coordenadas;
	}

	// Altera as coordenadas da missão
	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;

	}

	// Retorna o código de acesso
	public int getCodigoDeAcesso() {
		return codigoDeAcesso;
	}

	// Altera o código de acesso
	public void setCodigoDeAcesso(int codigoDeAcesso) {
		this.codigoDeAcesso = codigoDeAcesso;
	}

	// Retorna o nível de combustível
	public double getNivelCombustivel() {
		return nivelCombustivel;
	}

	// Valida e altera o nível de combustível
	public void setNivelCombustivel(double nivelCombustivel) {
		if (nivelCombustivel >= 0 && nivelCombustivel <= 100) {
			this.nivelCombustivel = nivelCombustivel;
		}
	}

	// Retorna a quantidade de tripulantes
	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}

	// Altera a quantidade de tripulantes
	public void setNumeroTripulantes(int numeroTripulantes) {
		this.numeroTripulantes = numeroTripulantes;
	}

	// Verifica se o combustível está abaixo do limite de segurança
	public void verificarCombustivel() {
		if (nivelCombustivel < 20) {
			System.out.println("ALERTA: Combustível abaixo de 20%");
		}
	}

}
