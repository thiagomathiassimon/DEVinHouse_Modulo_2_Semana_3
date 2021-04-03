package br.com.devinhouse.pegacarbono.model;

import br.com.devinhouse.pegacarbono.interfaces.PegadaCarbono;

public class Predio implements PegadaCarbono {

	private static final double QUANTIDADE_DE_CO2_USADA_PARA_AQUECER_UM_ANDAR = 2500;

	private String nomeDaEmpresa;
	private String ramo;
	private int alturaEmAndares;

	public Predio(String nomeDaEmpresa, String ramo, int alturaEmAndares) {
		super();
		this.nomeDaEmpresa = nomeDaEmpresa;
		this.ramo = ramo;
		this.alturaEmAndares = alturaEmAndares;
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public int getAlturaEmAndares() {
		return alturaEmAndares;
	}

	public void setAlturaEmAndares(int alturaEmAndares) {
		this.alturaEmAndares = alturaEmAndares;
	}

	@Override
	public double getPegadaCarbono() {
		return this.getAlturaEmAndares() * QUANTIDADE_DE_CO2_USADA_PARA_AQUECER_UM_ANDAR;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d %s%n", "Prédio de", this.getAlturaEmAndares(), "andares.");
	}

}
