package br.com.devinhouse.formas.main;

import br.com.devinhouse.formas.model.Circulo;
import br.com.devinhouse.formas.model.Cubo;
import br.com.devinhouse.formas.model.Esfera;
import br.com.devinhouse.formas.model.Forma;
import br.com.devinhouse.formas.model.FormaBidimensional;
import br.com.devinhouse.formas.model.FormaTridimensional;
import br.com.devinhouse.formas.model.Quadrado;

public class Main {

	public static void main(String[] args) {

		Forma quadrado = new Quadrado(4);
		Forma circulo = new Circulo(2, 4);
		Forma cubo = new Cubo(4);
		Forma esfera = new Esfera(2, 4);

		Forma[] listaDeFormas = new Forma[Forma.getContadorDeObjetos()];

		listaDeFormas[0] = quadrado;
		listaDeFormas[1] = circulo;
		listaDeFormas[2] = cubo;
		listaDeFormas[3] = esfera;

		for (Forma forma : listaDeFormas) {
			System.out.print(forma.toString());
			if (forma instanceof FormaBidimensional) {
				System.out.println("Área: " + forma.calcularArea() + "\n");
			} else if (forma instanceof FormaTridimensional) {
				FormaTridimensional formaTridimensional = (FormaTridimensional) forma;
				System.out.println("Área: " + formaTridimensional.calcularArea());
				System.out.println("Volume: " + formaTridimensional.calcularVolume() + "\n");
			}
		}
	}

}
