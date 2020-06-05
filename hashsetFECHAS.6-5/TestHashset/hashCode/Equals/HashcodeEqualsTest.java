package hashCode.Equals;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

import hashCode.Equals.Fech;
import hashCode.Equals.Fechashashset;

public class HashcodeEqualsTest {

	@Test
	public void testQueVerificaQueNoSePuedeAgregarFechaRepetidas() {

		Fechashashset fechas = new Fechashashset();

		Fech fe1 = new Fech(5, 5, 20);
		Fech fe2 = new Fech(5, 5, 20);
		Fech fe3 = new Fech(10, 5, 20);
		Fech fe4 = new Fech(10, 5, 19);
		Fech fe5 = new Fech(1, 12, 2025);
//repeti una fecha, las otras son todas fechas distintas(x eso el 4) q pueda agregarlas
		fechas.agregarFecha(fe1);
		fechas.agregarFecha(fe2);
		fechas.agregarFecha(fe3);
		fechas.agregarFecha(fe4);
		fechas.agregarFecha(fe5);

		assertEquals(4, fechas.getFechas().size());
		
		Iterator<Fech> it = fechas.getFechas().iterator();
		while (it.hasNext()) {
			Fech f = it.next();
			System.out.println(f.getDia() + "/" + f.getMes() + "/" + f.getAnio() + "  hashCode# " + f.hashCode());

		}

	}
	// condiciones necesarias p q compile en verde
		@Test
		public void testQueSePuedaCrearUnaFechaConLosDatosRequeridos() {
			
			Fech f1= new Fech(5, 5, 2025);
		}
		@Test
		public void testQuEDosFechasSeanIguales() {
			//preparacion
			Integer dia=5;
			Integer mes=5;
			Integer anio=2025;
			
			Fech f1 = new Fech(dia,mes,anio);
			Fech f2 = new Fech(dia,mes,anio);
			Boolean valorEsperado=true;

			//ejecucion
			Boolean valorObtenido=f1.equals(f2);

			//verificacion
			
//			digo  q  el valor esp es igual a el obtenido q indica 
			assertEquals(valorEsperado,valorObtenido);
			assertEquals(f1,f2);
//			digo q es verdad q f1 es igual a f2
			assertTrue(f1.equals(f2));
			
			System.out.println(f1.hashCode());
			System.out.println(f2.hashCode());
			}
}
