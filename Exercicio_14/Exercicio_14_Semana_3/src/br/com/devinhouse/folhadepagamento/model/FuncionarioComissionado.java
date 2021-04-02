package br.com.devinhouse.folhadepagamento.model;

public class FuncionarioComissionado extends Funcionario {

	private double valorVendidoNoMes;
	private double taxaDeComissao;

	public FuncionarioComissionado(String nome, String sobrenome, String dataNascimento, double valorVendidoNoMes,
			double taxaDeComissao) {
		super(nome, sobrenome, dataNascimento);
		this.valorVendidoNoMes = valorVendidoNoMes;
		this.taxaDeComissao = taxaDeComissao;
	}

	@Override
	public double calcularSalarioMensal() {
		return this.valorVendidoNoMes * this.taxaDeComissao;
	}

	@Override
	public String toString() {
		if (super.verificaBonusDeAniversario()) {
			return String.format("%s%s %.2f %n%s %.2f%% %n%s %.2f%n%s %.2f%n", super.toString(),
					"Valor vendido no mês: R$", this.valorVendidoNoMes, "Taxa de comissão: ",
					(this.taxaDeComissao * 100), "Salário total: R$", this.calcularSalarioMensal(),
					"Bônus de aniversário: R$", this.getBonusDeAniversario());
		} else {
			return String.format("%s%s %.2f %n%s %.2f %n%s %.2f%n", super.toString(), "Valor vendido no mês: R$",
					this.valorVendidoNoMes, "Taxa de comissão: ", this.taxaDeComissao, "Salário total: R$",
					this.calcularSalarioMensal());
		}
	}
}