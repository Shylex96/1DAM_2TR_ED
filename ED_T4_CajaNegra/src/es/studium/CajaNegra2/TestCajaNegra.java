package es.studium.CajaNegra2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TestCajaNegra {

	@Test
	void test1() {
		int resultadoEsperado = 1;
		int resultadoReal1 = Ejercicio2.cambiarSemaforo("rojo");
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void test2() {
		int resultadoEsperado = 1;
		int resultadoReal1 = Ejercicio2.cambiarSemaforo("amarillo");
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void test3() {
		int resultadoEsperado = 1;
		int resultadoReal1 = Ejercicio2.cambiarSemaforo("verde");
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void test4() {
		int resultadoEsperado = 0;
		int resultadoReal1 = Ejercicio2.cambiarSemaforo("azul");
		assertEquals(resultadoEsperado, resultadoReal1);
	}

}
