package br.com.fiap.model;

import br.com.fiap.model.Sensor;
import br.com.fiap.model.ComponenteEspacial;

//Classe que representa o sensor de temperatura da missão
public class SensorTemperatura extends ComponenteEspacial implements Sensor {
	private double temperatura;

	// Construtor da classe
	public SensorTemperatura(int id, String nome, String status) {
		super(id, nome, status);
	}

	// Retorna o valor da temperatura
	public double getTemperatura() {
		return temperatura;
	}

	// Altera o valor da temperatura
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	// Realiza a leitura da temperatura
	@Override
	public double lerValor() {
		return 15.0;
	}

	// Verifica se o sensor está funcionando corretamente
	@Override
	public boolean verificarFuncionamento() {
		return true;
	}

	// Retorna o tipo do sensor
	@Override
	public String retornarTipo() {
		return "Sensor de Temperatura";
	}

	// Realiza a calibração do sensor
	@Override
	public void calibrar() {
		System.out.println("Sensor de temperatura calibrado");
	}
}
