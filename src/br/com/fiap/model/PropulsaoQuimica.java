package br.com.fiap.model;

import br.com.fiap.model.SistemaPropulsao;

public class PropulsaoQuimica extends SistemaPropulsao {
	private double nivelCombustivel;

	public PropulsaoQuimica(String tipo, String status, double potencia, double nivelCombustivel) {
		super(tipo, status, potencia);
		this.nivelCombustivel = nivelCombustivel;
	}

	public double getNivelCombustivel() {
		return nivelCombustivel;
	}

	public void setNivelCombustivel(double nivelCombustivel) {
		this.nivelCombustivel = nivelCombustivel;
	}

	@Override
	public double calcularEmpuxoGerado() {
		return getPotencia() * 15;
	}

	@Override
	public void acelerar() {
		System.out.println("Propulsão química acelerando...");
	}

}
