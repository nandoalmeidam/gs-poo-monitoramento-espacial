package br.com.fiap.model;

//Classe abstrata que representa um sistema de propulsão genérico
public abstract class SistemaPropulsao {
	private String tipo;
	private String status;
	private double potencia;

	// Construtor da classe
	public SistemaPropulsao(String tipo, String status, double potencia) {
		this.tipo = tipo;
		this.status = status;

		// Validação da potência entre 0 e 100
		if (potencia >= 0 && potencia <= 100) {
			this.potencia = potencia;
		}
	}

	// Retorna o tipo da propulsão
	public String getTipo() {
		return tipo;
	}

	// Altera o tipo da propulsão
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Retorna o status da propulsão
	public String getStatus() {
		return status;
	}

	// Altera o status da propulsão
	public void setStatus(String status) {
		this.status = status;
	}

	// Retorna a potência da propulsão
	public double getPotencia() {
		return potencia;
	}

	// Liga o sistema de propulsão
	public void ligar() {
		this.status = "Ligado";
	}

	// Desliga o sistema de propulsão
	public void desligar() {
		this.status = "Desligado";
	}

	// Simula a aceleração da propulsão
	public void acelerar() {
		System.out.println("Sistema de propulsão acelerando...");
	}

	// Calcula o empuxo gerado pela propulsão
	public double calcularEmpuxoGerado() {
		return potencia * 10;
	}

}
