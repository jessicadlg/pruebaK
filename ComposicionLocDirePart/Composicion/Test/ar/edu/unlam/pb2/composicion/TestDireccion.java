package ar.edu.unlam.pb2.composicion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDireccion {

	@Test
	public void testQueVerificaELPartidoDeUnaDireccion() {
		
		Partido  partido=new Partido ("moron");
		Localidad haedo= new Localidad ("Haedo", partido);
		Direccion direccion= new Direccion ("juan b Justo",1000, haedo);			
		
		Partido part1 = new Partido("merlo");
		Localidad Merlo = new Localidad("MerloLoc",part1);
		Direccion dir1 = new Direccion("Rojas",444,Merlo);
		
		//verif:
		assertEquals("merlo",dir1.getLocalidad().getPartido().getNombre());

		
		assertEquals("moron",direccion.getLocalidad().getPartido().getNombre());
		
		
	}

}
