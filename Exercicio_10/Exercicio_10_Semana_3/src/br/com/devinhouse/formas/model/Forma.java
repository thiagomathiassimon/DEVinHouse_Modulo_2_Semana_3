package br.com.devinhouse.formas.model;

public abstract class Forma {

	private static int contadorDeObejtos;

	protected Forma() {
		contadorDeObejtos++;
	}

	public static int getContadorDeObjetos() {
		return contadorDeObejtos;
	}

	public abstract double calcularArea();

	@Override
	public abstract String toString();

}
