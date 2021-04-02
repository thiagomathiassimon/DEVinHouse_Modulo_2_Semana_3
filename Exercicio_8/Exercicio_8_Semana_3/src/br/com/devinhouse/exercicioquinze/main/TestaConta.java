package br.com.devinhouse.exercicioquinze.main;

import br.com.devinhouse.exercicioquinze.model.ContaBancaria;
import br.com.devinhouse.exercicioquinze.model.ContaCorrente;

public class TestaConta {

	public static void main(String[] args) {

		ContaBancaria minhaConta = new ContaCorrente();
		ContaBancaria outraConta = new ContaCorrente();

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

	}

}
