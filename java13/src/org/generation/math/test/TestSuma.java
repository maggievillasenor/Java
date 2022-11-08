package org.generation.math.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.generation.math.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestSuma {
	Suma suma;
	
	@BeforeEach
	void inicializar() {
		suma = new Suma();
	}
	
	@Test
	@DisplayName("Sumatoria de números positivos")
	void testSumaEnteros() {
		assertEquals(10, suma.sumaEnteros(5, 5) );
	}
	
	@Test
	@DisplayName("Sumatoria con un número negativo")
	void testSumaUnNegativos() {
		assertEquals(8, suma.sumaEnteros(-5, 8) );
	}
	
	@Test
	@DisplayName("Sumatoria de números de punto flotante")
	void testSumaFlotante() {
		assertEquals(10.5, (suma.sumaEnteros(5.3F, 5.2F)), 0.01); //0.01 ES UN DELTA
	}
	
	@Test
	@DisplayName("Verifica si la sumatoria es positiva")
	void isPositive() {
		assertTrue (suma.sumaEnteros(3, 4)>0 );
		//assetEquals( true, suma.sumaEnteros(3, 4)>0); // me deuelve el mismo valor que assertTrue
	}
	

}
