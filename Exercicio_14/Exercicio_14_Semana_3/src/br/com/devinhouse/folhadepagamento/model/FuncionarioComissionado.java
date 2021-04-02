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
					"Valor vendido no m�s: R$", this.valorVendidoNoMes, "Taxa de comiss�o: ",
					(this.taxaDeComissao * 100), "Sal�rio total: R$", this.calcularSalarioMensal(),
					"B�nus de anivers�rio: R$", this.getBonusDeAniversario());
		} else {
			return String.format("%s%s %.2f %n%s %.2f %n%s %.2f%n", super.toString(), "Valor vendido no m�s: R$",
					this.valorVendidoNoMes, "Taxa de comiss�o: ", this.taxaDeComissao, "Sal�rio total: R$",
					this.calcularSalarioMensal());
		}
	}
}