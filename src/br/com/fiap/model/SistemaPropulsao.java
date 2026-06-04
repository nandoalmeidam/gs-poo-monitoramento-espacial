package br.com.fiap.model;

public abstract class SistemaPropulsao {
	private String tipo;
	private String status;
	private double potencia;

	public SistemaPropulsao(String tipo, String status, double potencia) {
		this.tipo = tipo;
		this.status = status;

		if (potencia >= 0 && potencia <= 100) {
			this.potencia = potencia;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPotencia() {
		return potencia;
	}

	public void ligar() {
		this.status = "Ligado";
	}

	public void desligar() {
		this.status = "Desligado";
	}

	public void acelerar() {
		System.out.println("Sistema de propulsão acelerando...");
	}

	public double calcularEmpuxoGerado() {
		return potencia * 10;
	}

}
