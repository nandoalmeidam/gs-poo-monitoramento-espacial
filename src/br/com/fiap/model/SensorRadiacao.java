package br.com.fiap.model;

import br.com.fiap.model.Sensor;
import br.com.fiap.model.ComponenteEspacial;

//Classe que representa o sensor de radiação da missão
public class SensorRadiacao extends ComponenteEspacial implements Sensor {
	private double radiacao;

	// Construtor da classe
	public SensorRadiacao(int id, String nome, String status) {
		super(id, nome, status);
	}

	// Retorna o valor da radiação
	public double getRadiacao() {
		return radiacao;
	}

	// Altera o valor da radiação
	public void setRadiacao(double radiacao) {
		this.radiacao = radiacao;
	}

	// Realiza a leitura da radiação
	@Override
	public double lerValor() {
		return 775.2;
	}

	// Verifica se o sensor está funcionando corretamente
	@Override
	public boolean verificarFuncionamento() {
		return true;
	}

	// Retorna o tipo do sensor
	@Override
	public String retornarTipo() {
		return "Sensor de Radiação";
	}

	// Realiza a calibração do sensor
	@Override
	public void calibrar() {
		System.out.println("Sensor de radiação calibrado");
	}
}
