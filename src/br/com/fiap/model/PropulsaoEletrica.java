package br.com.fiap.model;

import br.com.fiap.model.SistemaPropulsao;

public class PropulsaoEletrica extends SistemaPropulsao {
	private double nivelBateria;

	public PropulsaoEletrica(String tipo, String status, double potencia, double nivelBateria) {
		super(tipo, status, potencia);
		this.nivelBateria = nivelBateria;
	}

	public double getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(double nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	@Override
	public double calcularEmpuxoGerado() {
		return getPotencia() * 12;
	}

	@Override
	public void acelerar() {
		System.out.println("Propulsão elétrica acelerando...");
	}

}
