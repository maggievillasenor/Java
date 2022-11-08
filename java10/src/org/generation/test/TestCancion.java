package org.generation.test;

//import org.generation.entity.Autor;
//import org.generation.entity.Cancion;
import org.generation.entity.*;

public class TestCancion {

	public static void main(String[] args) {
		Cancion sapito = new Cancion("Sapito", "Cómplices", "Infantil");
		
		//Christina Abaroa/Alejandro Abaroa/Pablo Aguirre
		Autor christinaAbaroa = new Autor("Christina", "Abaroa");
		sapito.addAutor(christinaAbaroa);
		sapito.addAutor(new Autor("Alejandro", "Abaroa"));
		sapito.addAutor(new Autor("Pablo", "Aguirre"));
		sapito.setDuracion(3.50);
		System.out.println(sapito);
	}

}
