package org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		/**
		 * Los arreglos se definen con corchetes []
		 * Los corchetes pueden ir antes o despues de la variable
		 * int[] myArray; int myArray[];
		 * 
		 * Sedebe asignar la cantidad de elementos que contendrá el arreglo
		 * Una vez definido, el arreglo no puede cambiar su tamaño.
		 */
		int[] codigoColores = new int[3];
		String [] nombreColores = new String[3];
		//System.out.println(codigoColores);
		//System.out.println(nombreColores);
		
		//Para acceder a un elemento, indicamos dentro del corchete
		// el índice del dato, el primer elemento es el indice 0.
		nombreColores[0] = "Azul";
		codigoColores[0] = 0x0000ff; //RGB 0,0,255 -> 00 00 ff
		
		nombreColores[1] = "Amarillo";
		codigoColores[1] = 0xffff00;
		
		nombreColores[2] = "Negro";
		codigoColores[2] = 0x000000;
		
		//Iteramos los datos de un arreglo
		for (int i = 0; i< nombreColores.length; i++) {
			System.out.println("El color fav es: " + nombreColores[i]);
			System.out.println("y su código RGB es " + Integer.toHexString(codigoColores[i]));
		}
		
		//nombreColores[3] = "Verde"; // Se crea un error en tiempo de ejecución
		
		//Otra forma de inicializar un arreglo
		//String frutas[] = {"Naranja", "Uva", "Papaya", "Manzana"};
		
		//Para crear una matriz, se indica con doble [][], primero son filas y luego columnas
		String pasteles[][] = new String [3][4]; //3filas 4columnas
		
		pasteles[0][1] = "Moka";
		for (int i=0; i< pasteles.length; i++) {
			for (int j=0; j <pasteles[i].length; j++)
				System.out.println("fila " + i + " columna " + j + " : " + pasteles[i][j]);
		}
	}

}
