package br.com.fiap.model;

import br.com.fiap.model.SistemaPropulsao;

//Classe que representa o sistema de propulsão elétrica
public class PropulsaoEletrica extends SistemaPropulsao {
	private double nivelBateria;

	// Construtor da classe
	public PropulsaoEletrica(String tipo, String status, double potencia, double nivelBateria) {
		super(tipo, status, potencia);
		this.nivelBateria = nivelBateria;
	}

	// Retorna o nível da bateria
	public double getNivelBateria() {
		return nivelBateria;
	}

	// Altera o nível da bateria
	public void setNivelBateria(double nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	// Calcula o empuxo gerado pela propulsão elétrica
	@Override
	public double calcularEmpuxoGerado() {
		return getPotencia() * 12;
	}

	// Simula a aceleração da propulsão elétrica
	@Override
	public void acelerar() {
		System.out.println("Propulsão elétrica acelerando...");
	}

}
