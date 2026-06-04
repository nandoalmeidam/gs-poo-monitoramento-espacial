package br.com.fiap.model;

public abstract class ComponenteEspacial {
	private int id;
	private String nome;
	private String status;

	public ComponenteEspacial(int id, String nome, String status) {
		this.id = id;
		this.nome = nome;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String status() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void ligar() {
		this.status = "Ligar";
	}

	public void desligar() {
		this.status = "Desligar";
	}

	public abstract void calibrar();
}
