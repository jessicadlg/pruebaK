package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TestContenedor {

	@Test
	public void testQueSeAgregueUnRectangulo() {
		Rectangulo r1= new Rectangulo(2.0,3.0,"Azul");
		ContenedorFigura contenedor= new ContenedorFigura();
		assertTrue(contenedor.agregar(r1));
	}
		
	@Test
	public void testQueSeAgregueUnCirculo() {
		Circulo c1 = new Circulo (10.0,"Azul");
		ContenedorFigura contenedor= new ContenedorFigura();
		assertTrue(contenedor.agregar(c1));
	}
	@Test
	public void testQueSeAgregueUnaFigura() {
		Figura f1=new Circulo(10.0,"Azul");
		Circulo c1 = new Circulo (10.0,"Azul");
		ContenedorFigura contenedor= new ContenedorFigura();
		f1=c1;
		assertTrue(f1 instanceof Circulo);
		//verificacion
		assertTrue(contenedor.agregar(f1));
	}
	@Test
	public void testQueVerificaQueSeObtieneRectangulos() {
		Rectangulo r1= new Rectangulo(2.0,3.0,"Azul");
		Rectangulo r2= new Rectangulo(2.0,3.0,"Rojo");

		ContenedorFigura contenedor= new ContenedorFigura();
		contenedor.agregar(r1);
		contenedor.agregar(r2);
	
		Integer ve=2;
		Integer vo=(contenedor.obtenerRectangulos().size());
		assertEquals(ve,vo);
	}

	@Test
	public void testQueElPromedioDetodasLasFiguras() {
		Figura f1=new Circulo(10.0,"Azul");
		Figura f2=new Rectangulo(2.0,3.0,"Rojo");;
		ContenedorFigura contenedor= new ContenedorFigura();
		contenedor.agregar(f1);
		contenedor.agregar(f2);
		
		assertEquals(160.07, contenedor.calcularPromedioDeAreaDeTodasLasFiguras(),0.01);
	}
}
