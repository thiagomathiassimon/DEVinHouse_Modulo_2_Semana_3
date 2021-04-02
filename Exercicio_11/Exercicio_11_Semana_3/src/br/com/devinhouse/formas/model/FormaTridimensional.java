package br.com.devinhouse.formas.model;

public abstract class FormaTridimensional extends Forma {

	public static final int QUANTIDADE_DE_DIMENSOES = 3;

	protected FormaTridimensional() {
		super();
	};

	public abstract double calcularVolume();

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FormaTridimensional) {
			return true;
		}
		return false;
	}

}
