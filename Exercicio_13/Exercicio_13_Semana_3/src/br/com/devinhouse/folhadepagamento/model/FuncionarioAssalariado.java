package br.com.devinhouse.folhadepagamento.model;

public class FuncionarioAssalariado extends Funcionario {

	private double salarioMensal;

	public FuncionarioAssalariado(String nome, String sobrenome, String dataNascimento, double salarioMensal) {
		super(nome, sobrenome, dataNascimento);
		this.salarioMensal = salarioMensal;
	}

	@Override
	public double calcularSalarioMensal() {
		return this.salarioMensal;
	}

	@Override
	public String toString() {
		if (super.verificaBonusDeAniversario()) {
			return String.format("%s%s %.2f%n%s %.2f%n", super.toString(), "Salário: R$", this.calcularSalarioMensal(),
					"Bônus de aniversário: R$", this.getBonusDeAniversario());
		} else {
			return String.format("%s%s %.2f%n", super.toString(), "Salário: R$", this.calcularSalarioMensal());
		}
	}

}
