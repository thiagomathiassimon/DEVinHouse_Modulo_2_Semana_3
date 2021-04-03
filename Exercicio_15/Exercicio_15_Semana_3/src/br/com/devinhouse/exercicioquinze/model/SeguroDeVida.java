package br.com.devinhouse.exercicioquinze.model;

import br.com.devinhouse.exercicioquinze.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	private static final double VALOR_DE_DESCONTO_DE_IMPOSTO_FIXO = 42.00;
	private static final double TAXA_DE_DESCONTO_DE_IMPOSTO_POR_VALOR_DA_APOLICE = 0.02;

	private double valor;
	private String titular;
	private String numeroApolice;

	public SeguroDeVida(double valor, String titular, String numeroApolice) {
		this.valor = valor;
		this.titular = titular;
		this.numeroApolice = numeroApolice;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(String numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	@Override
	public double getValorImposto() {
		return VALOR_DE_DESCONTO_DE_IMPOSTO_FIXO + (this.getValor() * TAXA_DE_DESCONTO_DE_IMPOSTO_POR_VALOR_DA_APOLICE);
	}

}
