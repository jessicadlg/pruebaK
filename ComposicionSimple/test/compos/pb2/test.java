package compos.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testQueFuncione() {
		//preparacion:

	Barrio barrio1 = new Barrio ("Once");
	Direccion direccion1 = new Direccion("rios",22,1708, barrio1);
	Farmacia farmacia = new Farmacia("farmacity", direccion1, 3);
	//ejecucion:
	//de Farmacia(String nombre, Direccion direccion, Integer cantEmpleados) {
	Farmacia farmacia2 = new Farmacia("farmacity", direccion1, 3);
	//verificacion:

	assertTrue(farmacia.equals(farmacia2));
	//me trae la direccion q esta trae x composicion
	farmacia2.getDireccion();

	
	}

}
