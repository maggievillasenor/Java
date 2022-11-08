package org.generation.fiesta.test;

class Automovil{
	{
		System.out.println("D");
	}
	//Bloque de inicializacion de instancia
	public Automovil() {
		System.out.println("E");
	}
}

class Sedan extends Automovil{
	//inicializacion de clase
	static {
		System.out.println("A");
	}
	
	public Sedan() {
		System.out.println("G");
	}
	
	{
		System.out.println("F");
	}
	
	static {
		System.out.println("B");
	}
	
}

public class Vocho extends Sedan {
	
	public static void main(String[] args) {
		System.out.println("C");
		new Vocho(); //Instanciando una clase
		System.out.println("H");
		/**
		 * Imprimir en consola , en los lugares de System.out.println
		 * la adecuada secuencia: 
		 * 	A
		 *  B
		 *  C
		 *  D
		 *  E
		 *  F
		 *  G
		 *  H
		 */
	}

}
