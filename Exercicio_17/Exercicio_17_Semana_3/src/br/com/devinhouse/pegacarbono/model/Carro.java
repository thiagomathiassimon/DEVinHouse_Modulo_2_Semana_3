package br.com.devinhouse.pegacarbono.model;

import br.com.devinhouse.pegacarbono.interfaces.PegadaCarbono;

public class Carro implements PegadaCarbono {

	private static final double QUANTIDADE_DE_CO2_EMITIDA_PELA_QUIEMA_DE_1_LITRO_DE_GASOLINA_EM_TONELADAS = 0.12745;
	private static final double QUANTIDADE_DE_CO2_EMITIDA_PELA_QUIEMA_DE_1_LITRO_DE_ETANOL_EM_TONELADAS = 0.017539;

	private String marca;
	private String modelo;
	private String cor;
	private int numeroDePortas;
	private String combustivelUsado;
	private double capacidadeDoTanqueDeCombustivel;

	public Carro(String marca, String modelo, String cor, int numeroDePortas, String combustivelUsado,
			double capacidadeDoTanqueDeCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.numeroDePortas = numeroDePortas;
		this.combustivelUsado = combustivelUsado;
		this.capacidadeDoTanqueDeCombustivel = capacidadeDoTanqueDeCombustivel;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public String getCombustivelUsado() {
		return combustivelUsado;
	}

	public double getCapacidadeDoTanqueDeCombustivel() {
		return capacidadeDoTanqueDeCombustivel;
	}

	public void setCapacidadeDoTanqueDeCombustivel(double capacidadeDoTanqueDeCombustivel) {
		this.capacidadeDoTanqueDeCombustivel = capacidadeDoTanqueDeCombustivel;
	}

	@Override
	public double getPegadaCarbono() {
		if (this.combustivelUsado.trim().equalsIgnoreCase("etanol")) {
			return QUANTIDADE_DE_CO2_EMITIDA_PELA_QUIEMA_DE_1_LITRO_DE_ETANOL_EM_TONELADAS
					* this.capacidadeDoTanqueDeCombustivel;
		}
		return QUANTIDADE_DE_CO2_EMITIDA_PELA_QUIEMA_DE_1_LITRO_DE_GASOLINA_EM_TONELADAS
				* this.capacidadeDoTanqueDeCombustivel;
	}

	@Override
	public String toString() {
		return String.format("%s %s%s %s%n%d %s%s %s%n%s %s%n", "Carro da marca", this.getMarca(), ", modelo", this.getModelo(),
				this.getNumeroDePortas(), "portas", ", cor", this.getCor(), "Movido a", this.getCombustivelUsado());
	}
}
