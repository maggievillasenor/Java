package org.generation.math.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.generation.math.Resta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestResta {
	Resta resta;
	
	@BeforeEach
	void inicializar() {
		resta = new Resta();
	}
	
	@Test
	@DisplayName("Resta de números positivos")
	void testrestaEnteros() {
		assertEquals(0, resta.restaEnteros(5, 5) );
	}
	
	@Test
	@DisplayName("Resta con un número negativo")
	void testRestaUnNegativos() {
		assertEquals(-8, resta.restaEnteros(-5, 8) );
	}
	
	@Test
	@DisplayName("Resta de números de punto flotante")
	void testRestaFlotante() {
		assertEquals(0.1, (resta.restaEnteros(5.3F, 5.2F)), 0.01); //0.01 ES UN DELTA
	}
	
	@Test
	@DisplayName("Verifica si la resta es positiva")
	void isPositive() {
		assertTrue (resta.restaEnteros(3, 4)<0 );
		//assetEquals( true, suma.sumaEnteros(3, 4)>0); // me deuelve el mismo valor que assertTrue
	}
	

}
