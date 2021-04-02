package br.com.devinhouse.exercicioquinze.model;

public class Gerente extends Funcionario {

	private String senha;
	private int numeroDeFuncionariosGerenciados;

	public Gerente(String nome, String sobrenome, String cpf, double salario, String senha,
			int numeroDeFuncionariosGerenciados) {
		super(nome, sobrenome, cpf, salario);
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	@Override
	public double calcularBonificacao() {
		return super.getSalario() * 0.15;
	}

}
