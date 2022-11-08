package org.generation;

public class ArbolitoNavidad {

	public static void main(String[] args) {
		
		System.out.println("    FELIZ NAVIDAD");
		int n = 11;
		//Arbol
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<= + 2*i-1; k++) {
				System.out.print("\u001B[32m*");
			}
			System.out.println("");
		}
		//Tronco
		for(int i=1; i<n -(n/2)-2; i++) {
			for(int j = n + (n/2)-6; j>1; j--) {
				System.out.print(" ");
			}
		
			System.out.println("\u001B[33m****");
		}
		
		//Base
		for(int i=1; i<n -(n/2)-3; i++) {
			for(int j = n + (n/2)-8; j>1; j--) {
				System.out.print(" ");
			}
				
				System.out.println("\033[31m********");
		}


	}

	
}
