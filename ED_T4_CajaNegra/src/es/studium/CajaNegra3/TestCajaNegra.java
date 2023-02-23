package es.studium.CajaNegra3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestCajaNegra {

	@Test
	void testPedirProducto1() {
		int resultadoEsperado = 1;
		int resultadoReal1 = Ejercicio3.pedirProducto(1);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void testPedirProducto2() {
		int resultadoEsperado = 0;
		int resultadoReal1 = Ejercicio3.pedirProducto(0);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void testPedirProducto3() {
		int resultadoEsperado = 0;
		int resultadoReal1 = Ejercicio3.pedirProducto(51);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void testSeleccionarTipoPago1() {
		int resultadoEsperado = 1;
		int resultadoReal1 = Ejercicio3.seleccionarTipoPago(10);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void testSeleccionarTipoPago2() {
		int resultadoEsperado = 1;
		int resultadoReal1 = Ejercicio3.seleccionarTipoPago(20);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void testSeleccionarTipoPago3() {
		int resultadoEsperado = 1;
		int resultadoReal1 = Ejercicio3.seleccionarTipoPago(30);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void testSeleccionarTipoPago4() {
		int resultadoEsperado = 1;
		int resultadoReal1 = Ejercicio3.seleccionarTipoPago(40);
		assertEquals(resultadoEsperado, resultadoReal1);
	}
	
	@Test
	void testSeleccionarTipoPago5() {
		int resultadoEsperado = 0;
		int resultadoReal1 = Ejercicio3.seleccionarTipoPago(12);
		assertEquals(resultadoEsperado, resultadoReal1);
	}

}
