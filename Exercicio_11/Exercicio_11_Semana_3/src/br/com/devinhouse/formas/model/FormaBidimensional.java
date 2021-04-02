package br.com.devinhouse.formas.model;

public abstract class FormaBidimensional extends Forma {

	public static final int QUANTIDADE_DE_DIMENSOES = 2;

	protected FormaBidimensional() {
		super();
	};

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FormaBidimensional) {
			return true;
		}
		return false;
	}

}
