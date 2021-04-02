package br.com.devinhouse.folhadepagamento.model;

import br.com.devinhouse.folhadepagamento.util.Data;
import br.com.devinhouse.folhadepagamento.util.DataAtual;

public abstract class Funcionario {
	
	private final double BONUS_DE_ANIVERSARIO = 100;

	private String nome;
	private String sobrenome;
	private String dataNascimento;

	public Funcionario(String nome, String sobrenome, String dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = Data.validarData(dataNascimento);
	}

	public String getDataNascimeto() {
		return this.dataNascimento;
	}

	public int getDiaNascimento() {
		String[] nascimento = this.dataNascimento.split("/");
		return Integer.parseInt(nascimento[0]);
	}

	public int getMesNascimento() {
		String[] nascimento = this.dataNascimento.split("/");
		return Integer.parseInt(nascimento[1]);
	}

	public int getAnoNascimento() {
		String[] nascimento = this.dataNascimento.split("/");
		return Integer.parseInt(nascimento[2]);
	}
	
	public double getBonusDeAniversario() {
		return BONUS_DE_ANIVERSARIO;
	}

	public boolean verificaBonusDeAniversario() {
		if (this.getMesNascimento() == Integer.parseInt(DataAtual.retornarDataAtual(1))) {
			return true;
		} else {
			return false;
		}
	}

	public abstract double calcularSalarioMensal();

	@Override
	public String toString() {
		return String.format("%s %s %s%n%s %s%n", "Nome do funcionário: ", this.nome, this.sobrenome,
				"Data de nascimento: ", this.dataNascimento);
	}

}
