package org.generation.fiesta.entity;

/**
 * Una interfaz es una declaración formal de un 
 * contrato, en la cuál los métodos no contienen
 * implementación alguna, es similar a los métodos 
 * abstractos.
 * 
 * Una clase puede implementar muchas interfaces, 
 * aunque no tengan relación las interfaces.
 * 
 * Las clases abstractas se deben utilizar para 
 * objetos que estén estrechamente relacionados, mientras
 * que las interfaces son más adecuadas para
 * proporcionar una funcionalidad comun a clases
 * que no estén relacionadas entre si.
 * 
 * Para los patrones de diseño se suelen utilizar interfaces
 * @author Maggie
 *
 */
public interface Fiesta {
	/**
	 * Los métodos de una interfaz
	 * ya son de tipo public y abstract
	 * 
	 * y los atributos son de tipo final. //que son constantes
	 */
	
	String invitarPersonas();
	
	String parquearseBotanas();
	
	String comprarBebidas();
	
	String terminarFiesta();
	
	String resumenFiesta();

}
