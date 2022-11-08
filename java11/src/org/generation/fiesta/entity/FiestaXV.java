package org.generation.fiesta.entity;

public final class FiestaXV implements Fiesta, Vals {
	
	private int numInvitados; 
	final static int EDAD_PERSONA = 15; // final(constante) son de tipo static -> para que sea atributo solo de esta clase

	@Override
	public String invitarPersonas() {
		return "Se invita a la chaviza de la secu";
	}

	@Override
	public String parquearseBotanas() {
		return "Se arma de chetos y paketazos";
	}

	@Override
	public String comprarBebidas() {
		return "Juguitos y aguas semilocas";
	}

	@Override
	public String terminarFiesta() {
		return "Se llama a los papás para que recojan a las bendis";
	}
	
	@Override
	public String resumenFiesta() {
		return String.format("Resumen: %n%s %n%s %n%s %n%s %n%s %n%s %n%s",
				this.invitarPersonas(), 
				this.parquearseBotanas(),
				this.comprarBebidas(),
				this.escogerChambelanes(),
				this.escogerMusica(),
				this.seleccionarVestuarioVals(),
				this.terminarFiesta()
				);
	}
	
	@Override
	public String escogerChambelanes() {
		return "Se escogen a los chambelanes que elija la quinceañera";
	}
	
	@Override
	public String escogerMusica() {
		return "Se escoge la música que suene en tiktok";
	}
	
	@Override
	public String seleccionarVestuarioVals() {
		return "Seleccionamos el vestuario para el vals";
	}

}
