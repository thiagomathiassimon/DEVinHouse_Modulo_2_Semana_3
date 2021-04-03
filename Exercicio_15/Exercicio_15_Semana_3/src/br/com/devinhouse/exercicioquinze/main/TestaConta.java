package br.com.devinhouse.exercicioquinze.main;

import br.com.devinhouse.exercicioquinze.model.ContaBancaria;
import br.com.devinhouse.exercicioquinze.model.ContaCorrente;
import br.com.devinhouse.exercicioquinze.model.ContaPoupanca;
import br.com.devinhouse.exercicioquinze.model.SeguroDeVida;

public class TestaConta {

	public static void main(String[] args) {

		ContaBancaria minhaConta = new ContaCorrente();
		ContaBancaria outraConta = new ContaPoupanca();

		minhaConta.setNome("Thiago Mathias Simon");
		minhaConta.setNumero(001);
		minhaConta.setAgencia(123);
		minhaConta.setDataDeAbertura("21/02/1999");

		minhaConta.emitirDadosDaConta();

		minhaConta.depositar(500.00);

		minhaConta.emitirDadosDaConta();

		minhaConta.sacar(150.00);

		minhaConta.emitirDadosDaConta();

		outraConta.setNome("Pedro da Silva");
		outraConta.setNumero(002);
		outraConta.setAgencia(123);
		outraConta.setDataDeAbertura("19/09/2019");
		
		outraConta.depositar(1000);

		outraConta.emitirDadosDaConta();
		
		SeguroDeVida sv = new SeguroDeVida(150000, "Joana D'Ávila", "007");
		System.out.printf("Nome do(a) segurado(a): %s%n",sv.getTitular());
		System.out.printf("Valor da Apólice: R$%.2f%n",sv.getValor());
		System.out.printf("Valor do imposto: R$%.2f%n%n", sv.getValorImposto());
		
		ContaCorrente minhaContaCorrente = (ContaCorrente) minhaConta;
		
		System.out.printf("Titular da conta: %s%n", minhaContaCorrente.getNome());
		System.out.printf("Valor em conta: R$%.2f%n", minhaContaCorrente.verificaSaldo());
		System.out.printf("Valor do imposto: R$%.2f%n", minhaContaCorrente.getValorImposto());

	}

}
