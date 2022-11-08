package org.generation.fiesta.entity;

public class FiestaTematica extends FiestaDespedidaSoltera {
	
	@Override 
	public String comprarBebidas() {
		return "Bebidas sorpresas y de bromas";
	}
	
	//No se puede sobreescribir este método, por que la clase
	// padre lo tiene definida como final.
//	@Override
//	public String resumenFiesta() {
//		return null;
//	}

}
