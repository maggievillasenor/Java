package mx.com.Maggie;

public class Pastel {
	/**
	 * Hacer una clase de lo que gusten y hacer las pruebas de esa clase Debe tener
	 * como mínimo: - 3 atributos de instancia. - 1 atributo de clase. - 2
	 * constructores. - 2 métodos.
	 * 
	 * Pruebas: - Creción de 3 objetos. - Imprimir los datos completos (atributos de
	 * instancia). - llevar la contabilidad de los objetos creados. Terminamos a las
	 * 12
	 */

	// fields (atributos)
	String flavor;
	String size;
	double weightInKg;

	// atributo de clase
	static int numPastel;

	// EL bloque de inicialización de atributos de las instancias, son dos{}
	{
		this.flavor = "";
		this.size = "";
		this.weightInKg = 0.1;
		numPastel++;
		// System.out.println("Se entra al bloque de inicialización de atributos");
	}
	
	// atributos de clase, tiene modificador static - para inicializar los atributos
		// de clase
		static {
			numPastel = 0; // inicializo el atributo de clase con 10 mascotas previas
		}
		
	// Métodos constructores
		
		/**
		 * Método vacío
		 */
		Pastel(){
			//constructor por default
		}
		
		/**
		 * Método para inicializar el sabor
		 * @param flavor sabor del pastel
		 */
		Pastel(String flavor){
			this();
			this.flavor = "" + flavor;
		}
		
		/**
		 * Método para inicializar sabor, tamaño y peso.
		 * @param flavor sabor del pastel	.
		 * @param size	tamaño del pastel.
		 * @param weightInKg peso del pastel en Kg.
		 */
		Pastel(String flavor, String size, double weightInKg){
			this(flavor);
			this.size = size;
			this.weightInKg = weightInKg;
		}
		
	
	// Métodos de la Clase

		String information() {
			return "Sabor: " + this.flavor + " tamaño: " + this.size + " peso: " + this.weightInKg;
		}
		
		static String nPastel() { //se le agrega static para que sea un metodo de mi clase
			return "N. Total de Pasteles creados " + numPastel; //las clases no pueden acceder a los atributos de los objetos
		}
		
	

}
