package org.generation;

public class PrimitiveData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Este es un comentario de líena
		/**
		 * Este es un comentario de bloque
		 * En esta sesión veremos los datos
		 * primitivos que existen en Java
		 */
		
		//La variable de tipo byte almacena
		// valores del -128 al +127
		byte datoTipoByte = 10;
		System.out.println("Tipo byte: " + datoTipoByte);
		//La variable del tipo short almacena
		// valores del -32,768 al +32,767
		short datoTipoShort = 150;
		System.out.println("Short Max value: " + Short.MAX_VALUE);
		System.out.println("Short Min value: " + Short.MIN_VALUE);
		//La variable de tipo int almacena
		// valores de -2^31 al +(2^31-1)
		System.out.println("Int Max value: " + Integer.MAX_VALUE);
		System.out.println("Int Min value: " + Integer.MIN_VALUE);
		//La variable de tipo long almacena
		// valores de -2^63 al +(2^63-1)
		long datoTipoLong = 9223372036854775807L;
		System.out.println("Long Max value: " + Long.MAX_VALUE);
		System.out.println("Long Min value: " + Long.MIN_VALUE);
		// byte, short, int y long es para valores enteros
		// float y double son para valores de punto flotante
		
		//La variable de tipo float almacena
		//valores de punto flotante de 32 bits.
		float datoTipoFloat = 2.58f;
		System.out.println("float Max value: " + Float.MAX_VALUE);
		System.out.println("float Min value: " + Float.MIN_VALUE);
		//la variable de tipo double almacena
		// valores de punto flotante de 64 bits
		double datoTipoDouble = 3.254;
		System.out.println("double Max value: " + Double.MAX_VALUE);
		System.out.println("double Min value: " + Double.MIN_VALUE);
		//La variable de tipo boolean
		// solo puede contener el valor de true o false
		boolean datoTipoBoolean = true;
		//La variable de tipo char almacena un caracter
		// el dato de tipo char es de 16 bits.
		char datoTipoChar = 'A';
		
		//Los datos de tipo String son considerados objetos
		// el valor null se puede establecer para los objetos.
		String datoTipoString = "Ya mero nos vamos a la conferencia";
		
		//las literales númericas, podemos separarlas por un guión bajo
		int miValor = 120_101_252;
		double miValorDouble = 12_254.34_22D;
		
		//Representación de literales numéricas en
		//hexadecimal 0x1a;
		int miValHex = 0x1a; //26 decimal
		System.out.println("Valor de 0x1a: " + miValHex);
		//binarios 0b11010
		int miValBinary = 0b0001_1010;
		System.out.println("Valor de 0b0001_1010: " + miValBinary);
		
		//Conversion de tipos
		byte coquita127ml = 100;
		int coca1Litro = coquita127ml; //Int MAX 2147483647
		System.out.println("Cantidad de líquido en coca 1 litro:  " + coca1Litro);
		
		coca1Litro = 256;
		coquita127ml = (byte) coca1Litro;
		System.out.println("Cantidad de líquido en coquita 127ml: " + coquita127ml);
		
		/**
		 * Se usa camel Case para la convención del nombre de variables
		 * ejemplo:
		 * int datoAlmacenado;
		 * 
		 * Para el nombre de las variables, podemos usar dígitos o letras, también
		 * el signo de $ y _
		 * 
		 * Ejemplo:
		 * int_miTiempoVida;
		 * 
		 * Se recomienda no usar $ y _ porque eso los usa Java.
		 * No se puede comenzar el nombre de la variable con números.
		 * Ejemplo:
		 * 	int 18amigos; ES INCORRECTO.
		 * 
		 * Para las variables que son constantes, se puede usar el nombre
		 * en mayúsculas.
		 * 
		 * 	palabra reservada para que sea constante:  final int NUM_COHORTE = 18;
		 * 
		 * 
		 */
		
		/**
		 * Los operadores que puedo usar en JAVA, los puedo encontrar en:
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		 */
		int edad = 22;
		boolean bandera = true && false; // es válido
		bandera = edad>18 && edad<30; // es válido
		//bandera = edad && edad<30 // NO es válido
		//bandera = edad>"18" && edad<30; //NO es válido
		
		/**
		 * La conversión de strings númericos a números se realiza con
		 * las instrucciones parseInt, parseFloat, parseDouble.
		 * 
		 */
		String edadString ="22";
		edad = Integer.parseInt(edadString);
		System.out.println("La edad promedio es de: " + edad);
		
		/**
		 * Los operadores lógicos &&, || y ! se usan en valores booleanos.
		 */
		int numMascotas = 2;
		boolean tieneMichis = true;
		
		boolean supMaxMascotas = numMascotas>10 || tieneMichis!= false;
		System.out.println("Supera Max de Mascotas: " +supMaxMascotas);
		
		//Suponiendo que:
		boolean X = true;
		boolean Y = false;
		boolean Z = true;
		System.out.println("El resultado de X || Y || X && !Z && !Y: " + (X || Y || X && !Z && !Y));
		System.out.println(  (X && Y) || (X && Z));
		System.out.println( X || Y && Z);
		System.out.println( "3: " +( X || Y || X && !Z && !Y));
		System.out.println((X || !Y)&& (!X || Z));
		System.out.println(!(X || Y) && Z);
		System.out.println( !X || !Y || Z && X && !Y);
		
		int a=8;
		int b=3;
		int c=-5;
		System.out.println("a+b+c : " + (a+b+c) );
        System.out.println("a*b/c : " + (a*b/c) );
        System.out.println("(a*c)%b : " + ( (a*c)%b) );
        System.out.println("2*b+3*(a-c) : " + ( 2*b+3*(a-c)) );
        System.out.println("a*(b/c) : " + (a*(b/c) ) );
        System.out.println( b/c ); //Obtenemos solo la parte entera
        System.out.println( (float)b/c ); //para obtener decimales
        System.out.println("a*(c%b) : " + (a*(c%b)) );
        System.out.println("a-b-c*2 : " + (a-b-c*2) );
	};

}
