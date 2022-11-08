package org.generation;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		/**
		 * Fizz Buzz game: realizar el ejercicio para los números enteros
		 * del 1 al 20
		 * 
		 * Para números divisibles por 3, imprimir Fizz.
		 * Para números divisibles por 5, imprimir Buzz.
		 * Para números divisibles por 3 y 5, imprimir FizzBuzz
		 * En cualquier otro caso, imprimir el número.
		 */
		
		//scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngrese el número: ");
		// Lee el número
		int n = sc.nextInt();
		System.out.println("The Fizz, Buzz, and FizzBuzz numbers are: ");
		//ciclo for se ejecuta hasta que la condición i<=n se vuelve falsa
		for(int i=1;i<=n; i++) {
			if(i%3==0 && i%5==0) {
				// devuelve verdadero si ambas condiciones devuelven verdadero
				System.out.print("FizzBuzz"); //imprime si el número es un múltiplo de 3 y 5
			}
			else if (i%3==0) {
				//se ejecuta si la condicion devuelve verdadero
				System.out.print("Fizz");//se imprime si el número es un múltiplo de 3
			}
			else if (i%5==0) {
				//se ejecuta si la condicion devuelve verdadero
				System.out.print("Buzz");//se imprime si el número es un múltiplo de 5
			}
			else {
				//imprime el número si este no es divisible por 3 y 5
				System.out.print(i);
			}
			//prints space  
			System.out.print(","+" ");  
		}
		//close the Scanner  
		sc.close(); 
	}
		
			

}
