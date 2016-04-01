package ar.edu.unlam.tallerweb.clase1;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContadorDeGanadoTest {

	@Test
	public void testQuePuedaContar() {
		ContadorDeGanado miContador = new ContadorDeGanado();
		int cantidadEsperada = 2;
		miContador.contar();
		miContador.contar();
		int cantidadObtenida = miContador.mostrarCantidad();
		assertEquals(cantidadEsperada, cantidadObtenida);
		miContador = null;
	}
	
	@Test
	public void testQueDeCero(){
		ContadorDeGanado miContadorCero = new ContadorDeGanado();
		int cantidadEsperada = 0;
		int cantidadObtenida = miContadorCero.mostrarCantidad();
		assertEquals(cantidadEsperada, cantidadObtenida);
//		miContadorCero = null; NO LIMPIAR, DEJAR QUE LIMPIA JAVA
	}

}



//ContadorDeGanado contador = new ContadorDeGanado();
//contador.contar();
//assertEquals(1, contador.mostrarCantidad());