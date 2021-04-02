package br.com.devinhouse.folhadepagamento.model;

public class FuncionarioPorPeca extends Funcionario {

	private double salarioPorPeca;
	private int qtdPecas;

	public FuncionarioPorPeca(String nome, String sobrenome, String dataNascimento, double salarioPorPeca,
			int qtdPecas) {
		super(nome, sobrenome, dataNascimento);
		this.salarioPorPeca = salarioPorPeca;
		this.qtdPecas = qtdPecas;
	}

	@Override
	public double calcularSalarioMensal() {
		return this.qtdPecas * this.salarioPorPeca;
	}

	@Override
	public String toString() {
		if (this.verificaBonusDeAniversario()) {
			return String.format("%s%s %d peças %n%s %.2f %n%s %.2f%n%s %.2f%n", super.toString(),
					"Quantidade de peças produzidas: ", this.qtdPecas,
					"Valor por peça produzida: R$", this.salarioPorPeca, "Salário total: R$",
					this.calcularSalarioMensal(), "Bônus de aniversário: R$", this.getBonusDeAniversario());
		} else {
			return String.format("%s%s %d peças %n%s %.2f %n%s %.2f%n", super.toString(),
					"Quantidade de peças produzidas: ", this.qtdPecas,
					"Valor por peça produzida: R$", this.salarioPorPeca, "Salário total: R$",
					this.calcularSalarioMensal());

		}
	}

}
