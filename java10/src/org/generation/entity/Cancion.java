package org.generation.entity;

import java.util.HashMap;

public class Cancion {
	//Encapsulo mis atributos
	private String nombre;
	private String album;
	private String genero;
	private double duracion;
	private HashMap<String, Autor> autores;
	
	{
		this.nombre = "";
		this.album = "";
		this.genero = "";
		this.duracion = 0;
		this.autores = new HashMap<String, Autor>();
	}
	
	public Cancion(String nombre, String album, String genero){
		this.nombre = nombre;
		this.album = album;
		this.genero = genero;
	}
	
	public void setDuracion(double duracion) { //Modifica el atributo de duracion
		this.duracion = duracion;
	}
	
	public double getDuracion() { //para leet el atributo de duracion
		return this.duracion;
	}
	
	public void addAutor(Autor autor) {
		autores.put(autor.nombreCompleto(), autor);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String toString() {
		//return this.nombre +" " + this.album + " etc";
		StringBuilder builder = new StringBuilder(); //new StringBuilder es el constructor
		builder.append("Nombre: ");
		builder.append(this.nombre);
		builder.append("\n Album: ");
		builder.append(this.album);
		builder.append("\n Genero: ");
		builder.append(this.genero);
		builder.append("\n Duracion: ");
		builder.append(this.duracion);
		if(autores.size()>1)builder.append("\n Autores:");
		else builder.append("\n Autor:");
		for (Autor autor:autores.values()) {
			builder.append("\n\t");
			builder.append(autor.nombreCompleto());
		}
		return builder.toString();
		
	}

}
