package org.generation.taco.test;

import org.generation.tacos.entity.Taco;
import org.generation.tacos.entity.TacoPastor;

public class TestTaco {

	public static void main(String[] args) {
		Taco tacoGenerico = new Taco("Taco Genérico", "Maíz");
		System.out.println(tacoGenerico);
		
		TacoPastor tacoPastor = new TacoPastor("Taco Pastor", "Maíz-Pequeño", false, 3, true);
		System.out.println(tacoPastor);
		
		System.out.println("Oferta taco pastor: " + tacoPastor.oferta());
		System.out.println("Oferta taco pastor: " + tacoPastor.oferta("hoy"));

	}

}
