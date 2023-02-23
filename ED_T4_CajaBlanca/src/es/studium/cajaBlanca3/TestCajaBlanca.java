package es.studium.cajaBlanca3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca {

	@Test
	void test1() {
	int resultadoEsperado = 3;
	int resultadoReal = Ejercicio8.posicion("p", "pepe");
	
	assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void test2() {
	int resultadoEsperado = 0;
	int resultadoReal = Ejercicio8.posicion("p", "maria");
	
	assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void test3() {
	int resultadoEsperado = 0;
	int resultadoReal = Ejercicio8.posicion("p", "");
	
	assertEquals(resultadoEsperado, resultadoReal);
	}
	
	

}
