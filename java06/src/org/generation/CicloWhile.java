package org.generation;

import java.util.Scanner;

public class CicloWhile {
	
	static final int NOMBRE_CH = 18; // esto es una constante y se le pone final

	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 * 	while(condicion) instruccion;
		 * 
		 * 	while(condicion){
		 * 		instrucciones;
		 * }
		 *Mientras mi condición sea verdadera, la instrucción while se seguira    		ejecutando
		 */
		
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("\n¿Quieres comer pan (si/no) ? ");
		String respuesta = (sc.next()).toLowerCase(); //no importa como escribamos la respuesta, la convierte en minuscula y la detecta así.
		while ( respuesta.equals( "si" ) ) {
			System.out.println("Llevas comiendo " + ++contador + " panes");
			
			if(contador>6) System.out.println("(Ya déjale a los demás");
			
			System.out.print("\n¿Quieres comer pan (si/no) ? ");
			respuesta = (sc.next()).toLowerCase();
		}
		System.out.println("Termina la oferta"); */
		/**
		 * Sintaxis do while
		 * 
		 * 	do{
		 * 	
		 * 	}while(dondicion);
		 */
		String respuesta;
		do {
			System.out.println("Llevas comiendo " + ++contador + " panes");
			System.out.print("\n¿Quieres comer pan (si/no) ? ");
			respuesta = (sc.next()).toLowerCase();
		} while (respuesta.equals("si"));
		
		System.out.println("Termina la oferta");
		
		//break, continue;
		boolean bandera = true;
		int nIteraciones= 10;
		while(bandera) {
			System.out.println(nIteraciones--);
			if(nIteraciones == 5)break;
		}
		
		/**
		 * Comenzar con $10,000.00
		 * Hacer un menú telefónico
		 * Opción 1: retirar dinero
		 * Opción 2: hacer depósitos
		 * 				opción 1: cuenta de cheques (Sumar la cantiad)
		 * 				opción 2: tarjeta de crédito (restar la cantidad)
		 * 				opción 3: cuenta de terceros (restar la cantidad)
		 * Opción 3: estado de cuenta (indicar la cantidad)
		 * Opción 4: quejas (No te contesta y te cuelga la llamada)	
		 * Opción 7: hablar con un asesor
		 * Opción 9: Salir del cajero
		 * Opción descpnocida: indica el error y vuelve a preguntar,
		 * 				Si se equivoca 3 veces seguidas, se cuelga la llamada
		 * 
		 * Indicar la cantidad final del cliente
		 * 
		 * en class MenuTelefonico.
		 */
		
		/*long edad = 1254625664879L;//se le agrega la L para indicar de tipo long.
		int edad = (int) 1254625664879L; // en variable int se hace un casteo para decir que es long*/
		
		int edad = 123;
		//Los datos primitivos no tienen propiedades, ni métodos
		Integer edad2 = 123;
		String valorString = edad2.toString();
		
		long dato = 256L; //0000 0000 ... 0000 0000 0000 0000 0000 0000 0000 0001 0000 0000
		byte datoDuplicado = (byte) dato;
		// caracteres válidos a-z, _ , $, 0-9
		// Números no se pueden al inicio
		//se usa camelCase para la convensión de las variables.
		
		
		int a;
		int b;
			for (a=0, b=0; b > a; a++, b++) {
				System.out.println(a + " " + b);
			}
		System.out.println(a + " " + b);
	}				

}
