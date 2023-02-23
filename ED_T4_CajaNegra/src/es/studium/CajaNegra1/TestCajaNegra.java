package es.studium.CajaNegra1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestCajaNegra {

	@Test
	void test1() {
		int resultadoEsperado = 31;
		int resultadoReal1 = Ejercicio1.diasDeMes(1);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void test2() {
		int resultadoEsperado = 0;
		int resultadoReal1 = Ejercicio1.diasDeMes(0);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void test3() {
		int resultadoEsperado = 0;
		int resultadoReal1 = Ejercicio1.diasDeMes(13);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void test4() {
		int resultadoEsperado = 28;
		int resultadoReal1 = Ejercicio1.diasDeMes(2);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void test5() {
		int resultadoEsperado = 30;
		int resultadoReal1 = Ejercicio1.diasDeMes(11);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	

}
