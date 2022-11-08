package org.generation.terreno.entity;

public abstract class Terreno {
	private String nombreTerreno;
	private double largo;
	private double ancho;
	private String propietario;
	
	
	//constructor
	public Terreno(String nombreTerreno, double largo, double ancho, String propietario) {
		super();
		this.nombreTerreno = nombreTerreno;
		this.largo = largo;
		this.ancho = ancho;
		this.propietario = propietario;
	}
	
	/**
	 * Los métodos abstractos no tienen cuerpo, terminan con punto y coma.
	 * 
	 * Debido a que el método abstracto el padre no ha definido el comportamiento, 
	 * se dice que la clase hija implementará el comportamiento, es decir, las subclases
	 * son responsables de la implementación.
	 * @return
	 */
	public abstract String formaDeObtenerlo();


	public String getNombreTerreno() {
		return nombreTerreno;
	}


	public void setNombreTerreno(String nombreTerreno) {
		this.nombreTerreno = nombreTerreno;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Terreno [nombreTerreno=");
		builder.append(nombreTerreno);
		builder.append(", largo=");
		builder.append(largo);
		builder.append(", ancho=");
		builder.append(ancho);
		builder.append(", propietario=");
		builder.append(propietario);
		builder.append("]");
		return builder.toString();
	}
	
	
	

	
	

}
