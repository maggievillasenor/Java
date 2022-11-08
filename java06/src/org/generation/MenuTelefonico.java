package org.generation;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class MenuTelefonico {

	public static void main(String[] args) {
		//Menu Telefonico
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
		 */
		
		//System.out.println("Saldo Inicial: $10,000.00" );
		Scanner scan = new Scanner(System.in);
        int contador = 0;
        int saldo = 10000;
        System.out.println("Gracias por llamar al banco gansito!!");
        do {
                System.out.println("Digite la opcione que desea:");
                System.out.println("Para retirar dinero digite 1");
                System.out.println("Para realizar un deposito digite 2");
                System.out.println("Para conocer su saldo digite 3");
                System.out.println("Para realizar una queja digite 4");
                System.out.println("Para hablar con un asesor digite 7");
                System.out.println("Para salir del cajero digite 9");
                int opcion = scan.nextInt();
                System.out.println("Opcion elegida: " + opcion);
                
                switch(opcion) {
                        case 1:
                                System.out.println("Ingrese el monto a retirar");
                                int cantidad = scan.nextInt();
                                if(cantidad < saldo) {
                                        saldo -= cantidad;
                                        System.out.println("Acabas de retirar: $" + cantidad);
                                        System.out.println("Tu nuevo saldo es de: $" + saldo);
                                } else {
                                        System.out.println("No cuentas con saldo suficiente para retirar $" + cantidad);
                                        System.out.println("Tu saldo es de: " + saldo);
                                }
                                break;
                        case 2:
                                        System.out.println("Donde desea depositar?");
                                        System.out.println("Digite la opcion");
                                        System.out.println("Cuenta de cheques digite 1");
                                        System.out.println("Tarjeta de credito digite 2");
                                        System.out.println("Cuenta de terceros digite 3");
                                        int opt = scan.nextInt();
                                        switch(opt) {
                                        case 1:
                                                System.out.println("Ingresa la cantidad");
                                                int amt = scan.nextInt();
                                                if(amt > 0) {
                                                        saldo += amt;
                                                        System.out.println("Acabas de depositar: $" + amt);
                                                        System.out.println("Tu nuevo saldo es de: $" + saldo);                                                                
                                                } else {
                                                        System.out.println("No se recibio tu respuesta");
                                                }
                                                break;
                                        case 2:
                                                System.out.println("Ingresa la cantidad");
                                                int amtCredit = scan.nextInt();
                                                if(amtCredit > 0) {
                                                        saldo -= amtCredit;
                                                        System.out.println("Acabas de depositar a tarjeta de credito: $" + amtCredit);
                                                        System.out.println("Tu nuevo saldo es de: $" + saldo);                                                                
                                                } else {
                                                        System.out.println("No se recibio tu respuesta");
                                                }
                                                break;
                                        case 3:
                                                System.out.println("Ingresa la cantidad");
                                                int amtT = scan.nextInt();
                                                if(amtT > 0) {
                                                        saldo -= amtT;
                                                        System.out.println("Acabas de depositar a tarjeta de credito: $" + amtT);
                                                        System.out.println("Tu nuevo saldo es de: $" + saldo);                                                                
                                                } else {
                                                        System.out.println("No se recibio tu respuesta");
                                                }
                                                break;
                                        default:
                                                System.out.println("Su respuesta no fue recibida");
                                                break;
                                        }
                                        
                                break;
                        case 3:
                                System.out.println("Su saldo es de: $" + saldo);
                                break;
                        case 4:
                                System.out.println("Aguarde en linea...");
                                new Timer().schedule(new TimerTask() {
                                    public void run() {
                                            System.out.println("...Nadie contesta");
                                    }
                                }, 3000);
                                contador = 3;
                                break;
                        case 7:
                                System.out.println("En este momento nuestros asesores se encuentras ocupados, espere en linea y en un momento lo contactaremos");
                                new Timer().schedule(new TimerTask() {
                                    public void run() {
                                            System.out.println("Hola, soy el lic Gansito, en que le puedo ayudar?");
                                    }
                                }, 3000);
                                break;
                        case 9:
                                contador = 3;
                                break;
                        default:
                                System.out.println("Su respuesta no representa ninguna opcion.");
                                contador++;
                                break;
                }
        } while(contador < 3);
        System.out.println("Llamada finalizada.");
		
		

	}

}
