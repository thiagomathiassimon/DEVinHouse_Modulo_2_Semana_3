package br.com.devinhouse.exercicioquinze.model;

import br.com.devinhouse.exercicioquinze.interfaces.Tributavel;

public class ContaCorrente extends ContaBancaria implements Tributavel {

	private static final double TAXA_DE_DESCONTO_DE_IMPOSTO_POR_VALOR_EM_CONTA = 0.01;

	@Override
	public boolean sacar(double valor) {
		valor += 0.10;
		return super.sacar(valor);
	}

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return (this.verificaSaldo() * TAXA_DE_DESCONTO_DE_IMPOSTO_POR_VALOR_EM_CONTA);
	}

}
