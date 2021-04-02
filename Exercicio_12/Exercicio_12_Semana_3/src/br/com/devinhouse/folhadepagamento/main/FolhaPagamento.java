package br.com.devinhouse.folhadepagamento.main;

import br.com.devinhouse.folhadepagamento.model.Funcionario;
import br.com.devinhouse.folhadepagamento.model.FuncionarioAssalariado;
import br.com.devinhouse.folhadepagamento.model.FuncionarioComissionado;
import br.com.devinhouse.folhadepagamento.model.FuncionarioHorista;
import br.com.devinhouse.folhadepagamento.util.CalcularOValorDaFolhaDePagamento;

public class FolhaPagamento {

	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[3];

		funcionarios[0] = new FuncionarioAssalariado("Pedro", "Cardoso", 2500);
		funcionarios[1] = new FuncionarioComissionado("Joana", "Silva", 15000, 0.50);
		funcionarios[2] = new FuncionarioHorista("João", "Silva", 240, 150);
		
		System.out.println(CalcularOValorDaFolhaDePagamento.calcularoOValorDaFolhaDePagamento(funcionarios));

	}

}
