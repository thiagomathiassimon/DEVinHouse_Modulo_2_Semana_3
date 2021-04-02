package br.com.devinhouse.folhadepagamento.model;

public class FuncionarioAssalariado extends Funcionario {

	private double salarioMensal;

	public FuncionarioAssalariado(String nome, String sobrenome, double salarioMensal) {
		super(nome, sobrenome);
		this.salarioMensal = salarioMensal;
	}

	@Override
	public double calcularSalarioMensal() {
		return this.salarioMensal;
	}

	@Override
	public String toString() {
		return String.format("%s%s %.2f%n", super.toString(), "Salário: ", this.calcularSalarioMensal());
	}

}
