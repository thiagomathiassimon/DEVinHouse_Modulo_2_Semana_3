package br.com.devinhouse.folhadepagamento.model;

public class FuncionarioHorista extends Funcionario {

	private double numeroDeHorasTrabalhadasNoMes;
	private double valorPorHoraDeServico;

	public FuncionarioHorista(String nome, String sobrenome, double numeroDeHorasTrabalhadasNoMes,
			double valorPorHoraDeServico) {
		super(nome, sobrenome);
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
		return String.format("%s%s %.2f %n%s %.2f %n%s %.2f%n", super.toString(), "Número de horas trabalhadas: ",
				this.numeroDeHorasTrabalhadasNoMes, "Valor por hora de serviço: ", this.valorPorHoraDeServico,
				"Salário total: ", this.calcularSalarioMensal());
	}

}
