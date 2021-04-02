package br.com.devinhouse.folhadepagamento.model;

public abstract class Funcionario {

	private String nome;
	private String sobrenome;

	public Funcionario(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public abstract double calcularSalarioMensal();

	@Override
	public String toString() {
		return String.format("%s %s %s%n", "Nome do funcionário: ", this.nome, this.sobrenome);
	}

}
