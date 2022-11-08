package org.generation.test;

import org.generation.entity.*;


public class TestRockola {

	public static void main(String[] args) {
		Rockola cantinera = new Rockola("La Cantinera");
		
		Cancion sapito = new Cancion("Sapito", "Cómplices", "Infantil");
		sapito.addAutor(new Autor("Cristina", "Abaroa"));
		sapito.addAutor(new Autor("Alejandro", "Abaroa"));
		sapito.addAutor(new Autor("Pablo", "Aguirre"));
		sapito.setDuracion(3.50);

		Cancion boneless = new Cancion("Boneless", "Dim Mark 20th Anniversary", "Electrónica");
		boneless.addAutor(new Autor("Chris", "Lake"));
		boneless.addAutor(new Autor("Aid", "Vllasaliu"));
		boneless.setDuracion(2.60);
		
		Cancion orpheus = new Cancion("Orpheus", "The dark and the light", "rock");
		orpheus.addAutor(new Autor("Shawn", "James"));
		orpheus.addAutor(new Autor("Jimmy", "Messer"));
		orpheus.setDuracion(3.58);
		
		Cancion rosaPastel = new Cancion("Rosa Pastel", "Dulce Beat", "Pop");
		rosaPastel.addAutor(new Autor("Denisse", "Guerrero"));
		rosaPastel.addAutor(new Autor("Edgar", "Huerta"));
		rosaPastel.setDuracion(3.00);
		
		Cancion cadaQue = new Cancion("Cada Que", "Fantasía Pop", "Pop");
		cadaQue.addAutor(new Autor("Denisse", "Guerrero"));
		cadaQue.addAutor(new Autor("Edgar", "Huerta"));
		cadaQue.setDuracion(3.00);
		
		
		
		cantinera.setCanciones(sapito);
		cantinera.setCanciones(boneless);
		cantinera.setCanciones(orpheus);
		cantinera.setCanciones(rosaPastel);
		cantinera.setCanciones(cadaQue);
		
		System.out.println(cantinera.listaCompletaCanciones());
		
		// Imprimir todas las canciones donde aparezca "Denisse Guerrero".
		//Espero que aparezca la canción rosaPastel y cadaQue.

	}

}
