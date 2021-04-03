package br.com.devinhouse.pegacarbono.main;

import br.com.devinhouse.pegacarbono.interfaces.PegadaCarbono;
import br.com.devinhouse.pegacarbono.model.Carro;
import br.com.devinhouse.pegacarbono.model.Moto;
import br.com.devinhouse.pegacarbono.model.Predio;

public class Main {

	public static void main(String[] args) {
		PegadaCarbono[] pegadaCarbono = new PegadaCarbono[3];

		pegadaCarbono[0] = new Predio("DEVinHouse", "Tecnologia", 5);
		pegadaCarbono[1] = new Carro("Toyota", "Corolla GLi", "prata", 2, "Gasolina", 50);
		pegadaCarbono[2] = new Moto("Harley-Davidson", "2021 ROAD KING™ SPECIAL", "Snake Venom", "Gasonlina", 22.7);

		for (PegadaCarbono pg : pegadaCarbono) {
			System.out.print(pg.toString());
			System.out.println("Pegada de carbono: " + pg.getPegadaCarbono() + " toneladas.\n");
		}
		
	}
}