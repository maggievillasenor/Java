package org.generation;

public class DatosInmutables {

	public static void main(String[] args) {
		String nombre = "Maggie";
		nombre = "Maya";
		String participante = "Maggie";
		
		String personaCH18 = new String("Maggie");
		
		if(participante.equals(personaCH18) )
			System.out.println("Es la misma persona");
		else 
			System.out.println("La persona es diferente");

	}

}
