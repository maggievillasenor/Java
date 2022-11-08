package org.generation.tacos.entity;

public class TacoPastor extends Taco { //con extends heredamos de la clase Taco
	
	boolean conPinia;
	int nivelAdobo;
	boolean esDeTrompo;
	public TacoPastor(String nombreTaco, String tipoTortilla, boolean conPinia, int nivelAdobo, boolean esDeTrompo) {
		super(nombreTaco, tipoTortilla); //la primera linea siempre debe de ser super
		this.conPinia = conPinia;
		this.nivelAdobo = nivelAdobo;
		this.esDeTrompo = esDeTrompo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TacoPastor [conPinia=");
		builder.append(conPinia);
		builder.append(", nivelAdobo=");
		builder.append(nivelAdobo);
		builder.append(", esDeTrompo=");
		builder.append(esDeTrompo);
		builder.append("]");
		builder.append( super.toString());
		return builder.toString();
	}
	
	@Override
	public String oferta() {
		return "Tacos al pastor al 2x1";
	}
	
	@Override
	public String oferta(String tiempoOferta) {
		return "Tacos al pastor al 2x1 el día de " + tiempoOferta;
	}
	
	

}
