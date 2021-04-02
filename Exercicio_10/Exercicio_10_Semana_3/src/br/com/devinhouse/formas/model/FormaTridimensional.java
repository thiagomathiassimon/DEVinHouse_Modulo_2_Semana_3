package br.com.devinhouse.formas.model;

public abstract class FormaTridimensional extends Forma {

	protected FormaTridimensional() {
		super();
	};

	public static final int QUANTIDADE_DE_DIMENSOES = 3;

	public abstract double calcularVolume();

}
