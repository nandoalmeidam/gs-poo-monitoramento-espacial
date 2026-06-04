package br.com.fiap.model;

import br.com.fiap.model.Sensor;
import br.com.fiap.model.ComponenteEspacial;

public class SensorPressao extends ComponenteEspacial implements Sensor {
	private double pressao;

	public SensorPressao(int id, String nome, String status) {
		super(id, nome, status);
	}

	public double getPressao() {
		return pressao;
	}

	public void setPressao(double pressao) {
		this.pressao = pressao;
	}

	@Override
	public double lerValor() {
		return 25.6;
	}

	@Override
	public boolean verificarFuncionamento() {
		return true;
	}

	@Override
	public String retornarTipo() {
		return "Sensor de Pressão";
	}

	@Override
	public void calibrar() {
		System.out.println("Sensor de pressão calibrado");
	}
}
