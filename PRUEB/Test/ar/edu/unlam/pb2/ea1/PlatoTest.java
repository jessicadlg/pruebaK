package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlatoTest {

	@Test
	public void testQueSePuedanAgregarIngredientesIguales() {
		// preparacion
		Ingrediente i1 = new Ingrediente("tomate", 25, 3);
		Ingrediente i2 = new Ingrediente("tomate", 25, 3);
		Plato p1 = new Plato();
		// ejecucion
		p1.agregarIngredienteAlPlato(i1);
		p1.agregarIngredienteAlPlato(i2);
		// verificacion
		assertTrue(i1.equals(i2));

	}

	@Test
	public void testQueSeObtengaLaCantidadDeSalCorrecta() {

		
		Ingrediente i1 = new Ingrediente("tomate", 2, 3);
		Ingrediente i2 = new Ingrediente("tomate", 1, 13);
		Plato miPlato = new Plato();
		
		miPlato.agregarIngredienteAlPlato(i1);
		miPlato.agregarIngredienteAlPlato(i2);
		
		assertEquals(3,(miPlato),0.01);

	}

	@Test
	public void testQueSeObtenegaLaCantidadDeAzucarCorrecta() {
		Plato miPlato2 = new Plato();
		Ingrediente i1 = new Ingrediente("tomate", 2, 3);
		Ingrediente i2 = new Ingrediente("tomate", 1, 13);
		miPlato2.agregarIngredienteAlPlato(i1);
		miPlato2.agregarIngredienteAlPlato(i2);
		
		assertEquals(16,miPlato2.obtenerCantidadDeAzucar(),0.01);

	}

}
