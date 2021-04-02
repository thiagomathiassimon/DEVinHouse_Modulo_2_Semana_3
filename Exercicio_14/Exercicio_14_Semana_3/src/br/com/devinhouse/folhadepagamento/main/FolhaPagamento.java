package br.com.devinhouse.folhadepagamento.main;

import br.com.devinhouse.folhadepagamento.model.Funcionario;
import br.com.devinhouse.folhadepagamento.model.FuncionarioAssalariado;
import br.com.devinhouse.folhadepagamento.model.FuncionarioComissionado;
import br.com.devinhouse.folhadepagamento.model.FuncionarioHorista;
import br.com.devinhouse.folhadepagamento.model.FuncionarioPorPeca;
import br.com.devinhouse.folhadepagamento.util.CalcularOValorDaFolhaDePagamento;

public class FolhaPagamento {

	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[4];

		funcionarios[0] = new FuncionarioAssalariado("Pedro", "Cardoso", "26/04/2002", 2500);
		funcionarios[1] = new FuncionarioComissionado("Joana", "Silva", "30/04/1966", 15000, 0.50);
		funcionarios[2] = new FuncionarioHorista("João", "Silva", "26/04/1966", 240, 150);
		funcionarios[3] = new FuncionarioPorPeca("Paula", "Conceição", "23/04/1978", 100, 2000);

		System.out.println(CalcularOValorDaFolhaDePagamento.calcularoOValorDaFolhaDePagamento(funcionarios));

	}

}
