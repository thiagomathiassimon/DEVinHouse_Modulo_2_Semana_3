package br.com.devinhouse.formas.model;

public class Cubo extends FormaTridimensional {

	private static final int QUANTIDADE_DE_LADOS = 6;
	public static final int QUANTIDADE_DE_VERTICES = 8;
	public static final int MEDIDA_DOS_ANGULOS_INTERNOS = 90;

	private double tamanhoDoLado;

	public Cubo(double tamanhoDoLado) {
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
		return QUANTIDADE_DE_LADOS * (this.tamanhoDoLado * this.tamanhoDoLado);
	}

	@Override
	public double calcularVolume() {
		return (this.tamanhoDoLado * this.tamanhoDoLado * this.tamanhoDoLado);
	}

	@Override
	public String toString() {
		return String.format("%s %s%n", "Tipo de forma: ", "Cubo");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cubo) {
			Cubo cubo = (Cubo) obj;
			if (cubo.tamanhoDoLado == this.tamanhoDoLado) {
				return true;
			}
		}
		return false;
	}
}
