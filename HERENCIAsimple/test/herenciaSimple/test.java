package herenciaSimple;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

//	@Test
//	public void testQueVerficaConAssertEquals() {
//		Rectangul r1 = new Rectangul("Rojo","rectangulo", 2.0,4.0);
//		assertEquals(0.0,r1.calcularArea());
//	}
	@Test
	public void testQueVerficaConAssertEqualsElPadre() {
//		preparacion:
		Circulo c1 = new Circulo("Rojo","cir", 2.0);
//		verificacion
		assertEquals("Soy un circulo ",c1.mostrarTipo());
	}
}
