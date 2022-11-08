package org.generation.fiesta.entity;

public class FiestaDespedidaSoltera implements Fiesta {

	@Override
	public String invitarPersonas() {
		return "Invitar a las que griten Solteras";
	}

	@Override
	public String parquearseBotanas() {
		return "Jicamas con Chamoy";
	}

	@Override
	public String comprarBebidas() {
		return "Cockteles";
	}

	@Override
	public String terminarFiesta() {
		return "¿Se puede terminar?";
	}

	@Override
	public final String resumenFiesta() { 
		//final para evitar que clases que hereden FiestaDespedidaSoltera sobreescriban este metodo
		return String.format("Resumen: %n%s %n%s %n%s %n%s", 
				this.invitarPersonas(), 
				this.parquearseBotanas(),
				this.comprarBebidas(),
				this.terminarFiesta()
				);
	}
}
