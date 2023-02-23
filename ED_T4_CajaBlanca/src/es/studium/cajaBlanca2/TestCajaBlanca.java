package es.studium.cajaBlanca2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca {

	@Test
	void test1() {
		String resultadoEsperado = "La edad debe ser un número positivo.";
		String resultadoReal1 = Ejercicio3.edadPerro(-1);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void test2() {
		String resultadoEsperado = "La edad es 10.5";
		String resultadoReal1 = Ejercicio3.edadPerro(1);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void test3() {
		String resultadoEsperado = "La edad es 25.0";
		String resultadoReal1 = Ejercicio3.edadPerro(3);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void extra() {
		String resultadoEsperado = "La edad es 21.0";
		String resultadoReal1 = Ejercicio3.edadPerro(2);
		assertEquals(resultadoEsperado, resultadoReal1);
	}

}
