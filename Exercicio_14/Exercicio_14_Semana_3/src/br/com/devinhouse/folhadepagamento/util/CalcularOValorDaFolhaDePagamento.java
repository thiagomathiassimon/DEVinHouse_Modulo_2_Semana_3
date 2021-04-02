package br.com.devinhouse.folhadepagamento.util;

import br.com.devinhouse.folhadepagamento.model.Funcionario;

public class CalcularOValorDaFolhaDePagamento {

	private static double valorTotalDaFolhaDePagamento = 0;
	private static String folhaDePagamento = "";

	public static String calcularoOValorDaFolhaDePagamento(Funcionario[] funcionarios) {
		for (Funcionario funcionario : funcionarios) {
			folhaDePagamento += funcionario.toString() + "\n";
			if (funcionario.verificaBonusDeAniversario()) {
				valorTotalDaFolhaDePagamento += funcionario.calcularSalarioMensal()
						+ funcionario.getBonusDeAniversario();
			} else {
				valorTotalDaFolhaDePagamento += funcionario.calcularSalarioMensal();
			}
		}
		return String.format("%s%s%.2f", folhaDePagamento, "Total de gastos: R$", valorTotalDaFolhaDePagamento);
	}
}
