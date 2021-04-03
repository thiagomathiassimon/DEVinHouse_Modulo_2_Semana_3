package br.com.devinhouse.pegacarbono.model;

import br.com.devinhouse.pegacarbono.interfaces.PegadaCarbono;

public class Moto implements PegadaCarbono {

	private static final double QUANTIDADE_DE_CO2_EMITIDA_PELA_QUIEMA_DE_1_LITRO_DE_GASOLINA_EM_TONELADAS = 0.12745;
	private static final double QUANTIDADE_DE_CO2_EMITIDA_PELA_QUIEMA_DE_1_LITRO_DE_ETANOL_EM_TONELADAS = 0.017539;

	private String marca;
	private String modelo;
	private String cor;
	private String combustivelUsado;
	private double capacidadeDoTanqueDeCombustivel;

	public Moto(String marca, String modelo, String cor, String combustivelUsado,
			double capacidadeDoTanqueDeCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
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
		return String.format("%s %s%s %s%n%s %s%n%s %s%n", "Moto da marca", this.getMarca(), ", modelo", this.getModelo(),
				 "Cor", this.getCor(), "Movido a", this.getCombustivelUsado());
	}
}
