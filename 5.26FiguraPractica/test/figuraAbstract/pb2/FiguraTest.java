package figuraAbstract.pb2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FiguraTest {

	@Test
	public void testQueVerificaQueEsCirculo () {
		Circulo circulo = new Circulo ("Azul", 21.0);
		assertEquals ("Soy un circulo", circulo.mostrarTipo("Soy un circulo"));
		assertEquals ("Azul", circulo.getColor());
	}
	
	@Test
	public void testQueVerificaElPerimetroDeUnRectangulo() {
//	parametros:	String color, Integer base, Integer altura
		Rectangulo r1 = new Rectangulo ("Azul",2,5);
		Integer verifica = r1.calcularPerimetro(2, 5);
		assertTrue(verifica);

		assertEquals (14, r1.calcularPerimetro(2,5),0.0);
	}

	private void assertTrue(Integer verifica) {
		// TODO Auto-generated method stub
		
	}
}
