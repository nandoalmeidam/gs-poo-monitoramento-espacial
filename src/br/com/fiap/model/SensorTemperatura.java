package br.com.fiap.model;

import br.com.fiap.model.Sensor;
import br.com.fiap.model.ComponenteEspacial;

public class SensorTemperatura extends ComponenteEspacial implements Sensor {
	private double temperatura;

	public SensorTemperatura(int id, String nome, String status) {
		super(id, nome, status);
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public double lerValor() {
		return 15.0;
	}

	@Override
	public boolean verificarFuncionamento() {
		return true;
	}

	@Override
	public String retornarTipo() {
		return "Sensor de Temperatura";
	}

	@Override
	public void calibrar() {
		System.out.println("Sensor de temperatura calibrado");
	}
}
