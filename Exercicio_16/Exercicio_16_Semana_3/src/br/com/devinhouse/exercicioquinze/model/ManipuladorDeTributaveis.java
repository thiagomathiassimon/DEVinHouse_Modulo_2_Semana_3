package br.com.devinhouse.exercicioquinze.model;

import br.com.devinhouse.exercicioquinze.interfaces.Tributavel;

public abstract class ManipuladorDeTributaveis {
	
	public static double total = 0;
	
	public static void calculaImpostos(Tributavel[] tributaveis) {
		for (Tributavel tributavel : tributaveis) {
			total += tributavel.getValorImposto();
		}
	}

}
