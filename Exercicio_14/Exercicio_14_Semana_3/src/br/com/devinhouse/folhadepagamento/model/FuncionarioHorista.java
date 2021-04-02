package br.com.devinhouse.folhadepagamento.model;

public class FuncionarioHorista extends Funcionario {

	private double numeroDeHorasTrabalhadasNoMes;
	private double valorPorHoraDeServico;

	public FuncionarioHorista(String nome, String sobrenome, String dataNascimento,
			double numeroDeHorasTrabalhadasNoMes, double valorPorHoraDeServico) {
		super(nome, sobrenome, dataNascimento);
		this.numeroDeHorasTrabalhadasNoMes = validarNumeroDeHorasTrabalhadasPorMes(numeroDeHorasTrabalhadasNoMes);
		this.valorPorHoraDeServico = valorPorHoraDeServico;
	}

	private double validarNumeroDeHorasTrabalhadasPorMes(double numeroDeHorasTrabalhadasPorMes) {
		if (numeroDeHorasTrabalhadasPorMes <= 744) {
			return numeroDeHorasTrabalhadasPorMes;
		}
		return 0;
	}

	@Override
	public double calcularSalarioMensal() {
		return this.numeroDeHorasTrabalhadasNoMes * this.valorPorHoraDeServico;
	}

	@Override
	public String toString() {
		if (this.verificaBonusDeAniversario()) {
			return String.format("%s%s %.2f horas %n%s %.2f %n%s %.2f%n%s %.2f%n", super.toString(),
					"Número de horas trabalhadas: ", this.numeroDeHorasTrabalhadasNoMes, "Valor por hora de serviço: R$",
					this.valorPorHoraDeServico, "Salário total: R$", this.calcularSalarioMensal(),
					"Bônus de aniversário: R$", this.getBonusDeAniversario());
		} else {
			return String.format("%s%s %.2f horas %n%s %.2f %n%s %.2f%n", super.toString(), "Número de horas trabalhadas: ",
					this.numeroDeHorasTrabalhadasNoMes, "Valor por hora de serviço: R$", this.valorPorHoraDeServico,
					"Salário total: R$", this.calcularSalarioMensal());

		}
	}

}
