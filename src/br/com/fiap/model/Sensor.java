package br.com.fiap.model;

public interface Sensor {
	double lerValor();

	boolean verificarFuncionamento();

	String retornarTipo();
}
