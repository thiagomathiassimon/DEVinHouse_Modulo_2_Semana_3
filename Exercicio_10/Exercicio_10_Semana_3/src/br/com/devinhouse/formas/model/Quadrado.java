package br.com.devinhouse.formas.model;

public class Quadrado extends FormaBidimensional {

	public static final int QUANTIDADE_DE_LADOS = 4;
	public static final int QUANTIDADE_DE_VERTICES = 4;
	public static final int MEDIDA_DOS_ANGULOS_INTERNOS = 90;

	private double tamanhoDoLado;

	public Quadrado(double tamanhoDoLado) {
		super();
		this.tamanhoDoLado = tamanhoDoLado;
	}

	public double getTamanhoDoLado() {
		return tamanhoDoLado;
	}

	public void setTamanhoDoLado(double lados) {
		this.tamanhoDoLado = lados;
	}

	@Override
	public double calcularArea() {
		return this.tamanhoDoLado * this.tamanhoDoLado;
	}

	public double calcularPerimetro() {
		return QUANTIDADE_DE_LADOS * this.tamanhoDoLado;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%n", "Tipo de forma: ", "Quadrado");
	}
}
