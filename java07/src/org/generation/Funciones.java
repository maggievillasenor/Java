package org.generation;

public class Funciones {

	public static void main(String[] args) {
		OperacionesMath operaciones = new OperacionesMath();
		EntradaUsuario entradaUsuario = new EntradaUsuario();
		
		operaciones.sumaEnterosSinRetorno(10, 50);
		
		int resultado = operaciones.sumaEnteros(50, 8);
		System.out.println("50 + 8 = " + resultado);
		
		
		while( entradaUsuario.entradaTeclado("¿Quieres continuar (s/n) ?") == 's'){
				System.out.println("===Estás dentro del ciclo while===");
		}
		System.out.println("Termina la ejecución");
		//System.out.println("20 + 9 = " + operaciones.sumaEnteros(20, 9));
		//System.out.println("Valor de PI*2 = " + operaciones.piPorDos());
		
		
		//System.out.println("pi/2 = "+ OperacionesMath.piEntreDos() );
		//System.out.println("pi/2 = " + OperacionesMath.piEntreDos() );
		
		//Lo sig no es posible, se requiere instanciar la clase.
		//System.out.println("pi*2 = " + OperacionesMath.piPorDos() );
	}

}
