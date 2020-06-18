package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRectangulo {

	//Desarrolle Todos Los test para verificar el correcto funcionamiento de Un Rectangulo
	@Test 
	public void testQueVerificaQueEsUnRectangulo () {
		Rectangulo r1 = new Rectangulo (2.0,3.0,"Azul");
		assertEquals ("Rectangulo", r1.dibujarFigura());
	}
	
	@Test
	public void testQueVerificaElAreaDeUnRectangulo() {

		Rectangulo r1 = new Rectangulo (2.0,3.0,"Azul");
		assertEquals (6.0, r1.calcularElArea(),0.0);
	}
	
	@Test
	public void testQueVerificaElPerimetroDeUnRectangulo() {

		Rectangulo r1 = new Rectangulo (2.0,3.0,"Azul");
		assertEquals (10.0, r1.calcularElPerimetro(),0.0);
	}
}
