package br.com.fiap.model;

//Classe abstrata que representa um componente espacial genérico
public abstract class ComponenteEspacial {
	// Atributos comuns a todos os componentes espaciais
	private int id;
	private String nome;
	private String status;

	// Construtor da classe
	public ComponenteEspacial(int id, String nome, String status) {
		this.id = id;
		this.nome = nome;
		this.status = status;
	}

	// Retorna o ID do componente
	public int getId() {
		return id;
	}

	// Altera o ID do componente
	public void setId(int id) {
		this.id = id;
	}

	// Retorna o nome do componente
	public String getNome() {
		return nome;
	}

	// Altera o nome do componente
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Retorna o status atual do componente
	public String status() {
		return status;
	}

	// Altera o status do componente
	public void setStatus(String status) {
		this.status = status;
	}

	// Liga o componente espacial
	public void ligar() {
		this.status = "Ligar";
	}

	// Desliga o componente espacial
	public void desligar() {
		this.status = "Desligar";
	}

	// Método abstrato que deverá ser implementado pelas subclasses
	public abstract void calibrar();
}
