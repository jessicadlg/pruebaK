package nohomerosbarHashset.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testQueseNoSePuedaAgregarClietesConElMismoNombre() {
		//preparacion
		Cliente cli1 = new Cliente("Juan",23);
		Cliente cli2 = new Cliente("Juan",24);
		Cliente cli3 = new Cliente("Juana",30);
		
		Bar BarDeLosHomeros = new Bar("el bar de los no Homeros");
		BarDeLosHomeros.agregarCliente(cli1);
		//verificacion
		assertTrue(cli1.equals(cli2));
		//2forma:
		assertFalse(BarDeLosHomeros.agregarCliente(cli2));
		
	}

}
