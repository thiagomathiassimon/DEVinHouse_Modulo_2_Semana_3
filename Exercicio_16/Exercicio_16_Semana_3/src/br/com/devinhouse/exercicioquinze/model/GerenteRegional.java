package br.com.devinhouse.exercicioquinze.model;

public class GerenteRegional extends Gerente {

	public GerenteRegional(String nome, String sobrenome, String cpf, double salario, String senha,
			int numeroDeFuncionariosGerenciados) {
		super(nome, sobrenome, cpf, salario, senha, numeroDeFuncionariosGerenciados);
	}

	@Override
	public double calcularBonificacao() {
		return super.calcularBonificacao() + 1000.00;
	}

}
