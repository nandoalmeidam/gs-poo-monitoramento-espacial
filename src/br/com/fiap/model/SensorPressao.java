package br.com.fiap.model;

import br.com.fiap.model.Sensor;
import br.com.fiap.model.ComponenteEspacial;

//Classe que representa o sensor de pressão da missão
public class SensorPressao extends ComponenteEspacial implements Sensor {
	private double pressao;

	// Construtor da classe
	public SensorPressao(int id, String nome, String status) {
		super(id, nome, status);
	}

	// Retorna o valor da pressão
	public double getPressao() {
		return pressao;
	}

	// Altera o valor da pressão
	public void setPressao(double pressao) {
		this.pressao = pressao;
	}

	// Realiza a leitura da pressão
	@Override
	public double lerValor() {
		return 25.6;
	}

	// Verifica se o sensor está funcionando corretamente
	@Override
	public boolean verificarFuncionamento() {
		return true;
	}

	// Retorna o tipo do sensor
	@Override
	public String retornarTipo() {
		return "Sensor de Pressão";
	}

	// Realiza a calibração do sensor
	@Override
	public void calibrar() {
		System.out.println("Sensor de pressão calibrado");
	}
}
