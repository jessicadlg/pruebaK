package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCirculo {

	//Desarrolle Todos Los test para verificar el correcto funcionamiento de Un circulo 
	@Test 
	public void testQueVerificaQueEsCirculo () {
		Circulo c1 = new Circulo (10.0,"Azul");
		assertEquals ("Circulo", c1.dibujarFigura());
		
	}
	@Test
	public void testQueVerificaElAreaDeUnCiculo() {

		Circulo c1 = new Circulo (10.0,"Azul");
		assertEquals (314.15, c1.calcularElArea(),0.01);
	}
	
	@Test
	public void testQueVerificaElPerimetroDeUncirculo() {

		Circulo c1 = new Circulo (10.0,"Azul");
		assertEquals (62.83, c1.calcularElPerimetro(),0.01);
	}
	
}
