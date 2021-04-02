package br.com.devinhouse.formas.model;

public class Circulo extends FormaBidimensional {

	private double raio;
	private double diametro;

	public Circulo(double raio, double diametro) {
		super();
		this.raio = validadorDeRaio(raio, diametro);
		this.diametro = validadorDeDiametro(raio, diametro);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
		this.diametro = this.raio * 2;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
		this.raio = this.diametro / 2;
	}

	@Override
	public double calcularArea() {
		return Math.PI * (this.raio * this.raio);
	}

	public double calcularComprimentoDaCircunferencia() {
		return 2 * Math.PI * this.raio;
	}

	public static double calcularDiametro(double raio) {
		return 2 * raio;
	}

	public static double calcularRaio(double diametro) {
		return diametro / 2;
	}

	public double validadorDeRaio(double raio, double diametro) {
		if (diametro / 2 != raio) {
			return diametro / 2;
		}
		return raio;
	}

	public double validadorDeDiametro(double raio, double diametro) {
		if (raio * 2 != diametro) {
			return raio * 2;
		}
		return diametro;
	}

	@Override
	public String toString() {
		return String.format("%s %s%n", "Tipo de forma: ", "Círculo");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circulo) {
			Circulo circulo = (Circulo) obj;
			if (circulo.diametro == this.diametro && circulo.raio == this.raio) {
				return true;
			}
		}
		return false;
	}
}
