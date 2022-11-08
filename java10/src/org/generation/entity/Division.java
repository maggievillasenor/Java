package org.generation.entity;

public class Division {
	
	public Double divisionByCero(int a) {
		double div = 0;
	try {
		div = a/0;
	}
	catch(ArrayStoreException e) { //e es una variable de exception
		System.out.println("Estoy en la excepción ArrayStoreException");
		System.out.println(e.toString());		
	}
	catch(ArrayIndexOutOfBoundsException e) { //e es una variable de exception
		System.out.println("Estoy en la excepción ArrayIndexOutOfBoundsException");
		System.out.println(e.toString());		
	}
	catch(Exception e) { //e es una variable de exception
		System.out.println("Estoy en la excepción Exception");
		//System.out.println(e.toString());	
		e.printStackTrace();
	}
	finally {
		System.out.println("Estoy en el bloque finally");
	}
	
		return div;
	}

}
