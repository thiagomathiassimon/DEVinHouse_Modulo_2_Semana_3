package br.com.devinhouse.folhadepagamento.util;

import br.com.devinhouse.folhadepagamento.model.Funcionario;

public class CalcularOValorDaFolhaDePagamento {

	private static double valorTotalDaFolhaDePagamento = 0;
	private static String folhaDePagamento = "";

	public static String calcularoOValorDaFolhaDePagamento(Funcionario[] funcionarios) {
		for (Funcionario funcionario : funcionarios) {
			folhaDePagamento += "\n" + funcionario.toString();
			valorTotalDaFolhaDePagamento += funcionario.calcularSalarioMensal();
		}
		return folhaDePagamento + "\nTotal de gastos: " + valorTotalDaFolhaDePagamento;
	}

}
