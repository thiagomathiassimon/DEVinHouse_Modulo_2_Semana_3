package br.com.devinhouse.folhadepagamento.model;

public class FuncionarioComissionado extends Funcionario {

	private double valorVendidoNoMes;
	private double taxaDeComissao;

	public FuncionarioComissionado(String nome, String sobrenome, double valorVendidoNoMes, double taxaDeComissao) {
		super(nome, sobrenome);
		this.valorVendidoNoMes = valorVendidoNoMes;
		this.taxaDeComissao = taxaDeComissao;
	}

	@Override
	public double calcularSalarioMensal() {
		return this.valorVendidoNoMes * this.taxaDeComissao;
	}

	@Override
	public String toString() {
		return String.format("%s%s %.2f %n%s %.2f %n%s %.2f%n", super.toString(), "Valor vendido no m�s: ",
				this.valorVendidoNoMes, "Taxa de comiss�o: ", this.taxaDeComissao, "Sal�rio total: ",
				this.calcularSalarioMensal());
	}

}
