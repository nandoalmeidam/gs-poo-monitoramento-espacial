package br.com.fiap.model;

import br.com.fiap.model.SistemaPropulsao;

//Classe que representa o sistema de propulsão química
public class PropulsaoQuimica extends SistemaPropulsao {
	private double nivelCombustivel;

	// Construtor da classe
	public PropulsaoQuimica(String tipo, String status, double potencia, double nivelCombustivel) {
		super(tipo, status, potencia);
		this.nivelCombustivel = nivelCombustivel;
	}

	// Retorna o nível de combustível
	public double getNivelCombustivel() {
		return nivelCombustivel;
	}

	// Altera o nível de combustível
	public void setNivelCombustivel(double nivelCombustivel) {
		this.nivelCombustivel = nivelCombustivel;
	}

	// Calcula o empuxo gerado pela propulsão química
	@Override
	public double calcularEmpuxoGerado() {
		return getPotencia() * 15;
	}

	// Simula a aceleração da propulsão química
	@Override
	public void acelerar() {
		System.out.println("Propulsão química acelerando...");
	}

}
