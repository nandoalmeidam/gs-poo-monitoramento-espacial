package br.com.fiap.model;

import br.com.fiap.model.Sensor;
import br.com.fiap.model.ComponenteEspacial;

public class SensorRadiacao extends ComponenteEspacial implements Sensor {
	private double radiacao;

	public SensorRadiacao(int id, String nome, String status) {
		super(id, nome, status);
	}

	public double getRadiacao() {
		return radiacao;
	}

	public void setRadiacao(double radiacao) {
		this.radiacao = radiacao;
	}

	@Override
	public double lerValor() {
		return 775.2;
	}

	@Override
	public boolean verificarFuncionamento() {
		return true;
	}

	@Override
	public String retornarTipo() {
		return "Sensor de Radiação";
	}

	@Override
	public void calibrar() {
		System.out.println("Sensor de radiação calibrado");
	}
}
