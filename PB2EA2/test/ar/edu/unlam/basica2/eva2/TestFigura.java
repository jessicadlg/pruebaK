package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.*;

import org.junit.Test;

public class TestFigura {
	
	
	@Test
	public void testQueVerificaQueUnaMismaFiguraSePuedaInstanciaTantoComoUnRectangoYTambienComoUncirculo() {
				
		Rectangulo r1 = new Rectangulo (2.0,3.0,"Azul");
		
		Circulo c1 = new Circulo (21.0,"Azul");
		Figura f1= r1;
		//verificacion
		assertTrue(f1 instanceof Rectangulo);
		//intancio figura como circulo
		f1= c1;
		
		//verificacion:
		
		assertTrue(f1 instanceof Circulo);
	}

}
