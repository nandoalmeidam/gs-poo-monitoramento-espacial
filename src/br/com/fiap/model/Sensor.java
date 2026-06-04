package br.com.fiap.model;

//Interface que define os comportamentos obrigatórios dos sensores
public interface Sensor {
	double lerValor();

	boolean verificarFuncionamento();

	String retornarTipo();
}
