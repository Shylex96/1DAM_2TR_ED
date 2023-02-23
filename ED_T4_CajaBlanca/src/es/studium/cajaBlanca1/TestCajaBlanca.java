package es.studium.cajaBlanca1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca {

	@Test
	void path1() {
		// CajaBlanca c = new CajaBlanca();
		boolean resultadoEsperado = true;
		//boolean resultadoReal1 = c.esPar(4);
		boolean resultadoReal1 = Ejercicio1.esPar(4);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void path2() {
		// CajaBlanca c = new CajaBlanca();
		boolean resultadoEsperado = false;
		//boolean resultadoReal1 = c.esPar(3);
		boolean resultadoReal1 = Ejercicio1.esPar(3);
		assertEquals(resultadoEsperado, resultadoReal1);
	}

}
