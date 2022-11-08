package org.generation.test;

import org.generation.entity.Division;

public class TestTryCatch {

	public static void main(String[] args) {
		/**
		 * Una excepción es una situación inesperada
		 * durante la ejecución de un programa.
		 * 
		 * Existen dos tipos de excepciones.
		 * 
		 * A) Checked Exceptions o Excepciones que se heredan
		 * 	de la clase Exception.
		 *  Las excepciones de este tipo se tiene que declarar en 
		 *  la firma del método o bien usar los bloques try-catch
		 * B) Unchecked Exception o Excepciones que se heredan de la
		 *  clase RuntimeExceptions no se está obligado a procesarlas.
		 *  Es opcional el uso de los bloques try-catch.
		 *  
		 *  Las excepciones de tipo Erros, son arrojadas por la JVM.(Java Virtual Machine)
		 *  Estos son errores de los que no nos podemos recuperar.
		 *  Por ejemplo: un desbordamiento en la memoria.
		 *  
		 *  El stacktrace de una excepción es el conjunto de 
		 *  mensajes de error desde el origen del error hasta la última
		 *  clase que recive el error.
		 *  
		 */
		
		Division div = new Division();
		
		System.out.println("El resultado es: " + div.divisionByCero(5));
		
		System.out.println("Este es el fin del programa");

	}

}
