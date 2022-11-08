package org.generation;

import java.util.HashMap;

public class HashMapConcepto {

	public static void main(String[] args) {
		/**
		 * Una colección Map, es una relació de llave(key)-valor
		 * que forma una especie de tabla de datos.
		 */
		
		//Definimos un tipo de colección HasMap
		//	< key, value >
		HashMap<Integer, String > amores = new HashMap<Integer, String>();
		
		//Agregamos valores a nuestra colección
		amores.put(20201011, "Legolas");
		amores.put(20211102, "Edward Cullen");
		amores.put(20220101, "Akane Tendo");
		amores.put(19980214, "Máximo Décimo Meridio");
		amores.put(19900324, "Maribel Guardia");
		amores.put(20060520, "Chayanne");
		amores.put(20220830, "Legolas");
		System.out.println(amores);
		
		//Desplegamos el tamaño de la colección
		System.out.println("N. de amores = " + amores.size());
		
		//Mostramos el amor de Chayanne
		System.out.println("El gran gran amor : " + amores.get(20060520));
		
		//Removemos un elemento de la colección.
		amores.remove(19900324);
		System.out.println(amores);
		
		//Iteramos los elementos de la colección
		for(int fechaAniversario : amores.keySet())
			System.out.println("El día  " + fechaAniversario + " conocí a: " + amores.get(fechaAniversario));
		
		//Iteramos solo los valores
		for (String nombreAmor: amores.values())
			System.out.println("Una persona más a mi colección: " + nombreAmor);
		
		if( amores.containsValue( "Chayanne") )
			System.out.println("Bailaste Torero");
	}

}
