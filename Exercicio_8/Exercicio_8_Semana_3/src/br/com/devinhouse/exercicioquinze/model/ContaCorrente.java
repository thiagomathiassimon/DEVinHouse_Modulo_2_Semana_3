package br.com.devinhouse.exercicioquinze.model;

public class ContaCorrente extends ContaBancaria {

	@Override
	public boolean sacar(double valor) {
		valor += 0.10;
		return super.sacar(valor);
	}

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

}
