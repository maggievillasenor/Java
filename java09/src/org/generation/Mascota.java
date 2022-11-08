package org.generation;

public class Mascota {// hereda de una clase o implementa de una interfaz
	/**
	 * Puede haber más de una clase en el mismo archivo Solo una clase puede tener
	 * el modificador public
	 * 
	 */
	// class perro{}

	
	// fields (atributos)
	String name;
	double ageInYears;
	String type;
	int sizeInCm;
	// atributos de clase
	static int numPets;

	// EL bloque de inicialización de atributos de las instancias, son dos{}
	{
		this.type = "No definido";
		this.name = "";
		this.ageInYears = 0.1;
		this.sizeInCm = 0;
		numPets++;
		//System.out.println("Se entra al bloque de inicialización de atributos");
	}

	// atributos de clase, tiene modificador static - para inicializar los atributos
	// de clase
	static {
		numPets = 0; // inicializo el atributo de clase con 10 mascotas previas
	}

	// Métodos constructores
	// Si no especifico un constructor, Java genera el default (vacío)
	// El nombre de un constructor DEBE tener el mismo nombre que la clase
	// Los métodos constructores no tiene retorno (return)
	// La sobrecarga de métodos es cuando existe más de un método con el mismo nombre
	// Pero tienen diferentes parámetros de entrada
	/**
	 * Método vacío
	 */
	Mascota(){
		// Este es el constructor por default
	}
	
	/**
	 * Método para inicializar el nombre
	 * @param name nombre de la mascota
	 */
	Mascota(String name){
		this();
		this.name = "suave " + name;
	}
	
	/**
	 * Método para inicializar nombre, edad y tamaño
	 * @param name de la mascota
	 * @param ageInYears edad de la mascota en años
	 * @param sizeInCm tamaño de la mascota en centimetros.
	 */
	Mascota(String name, double ageInYears, int sizeInCm) {
		//this.name = name; 
		this(name);
		this.type = "animal";
		this.ageInYears = ageInYears;
		this.sizeInCm = sizeInCm;
		// este es el método default de la clase
		//System.out.println("Se crea un objeto de tipo Mascota");
	}

	// Métodos de la Clase
	// - Métodos sobrecargados
	// - Métodos sobreescritos

	String information() {
		return "nombre: " + this.name + " edad: " + this.ageInYears + " tamaño: " + this.sizeInCm + " tipo: "
				+ this.type;
	}
	
	static String nPets() { //se le agrega static para que sea un metodo de mi clse
		return "N. Total de Máscotas creadas " + numPets; //las clases no pueden acceder a los atributos de los objetos
	}

}
