package herencia.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void agregarCuentaCorrienteAlBanco() {

		Banco miBanco = new Banco("unlam");
		// Long dni, String nombre, String apellido
		Cliente cliente = new Cliente(26000L, "Juan", "Diaz");
//		Integer cbu, Cliente cliente, Double saldo
		CuentaCorriente cc = new CuentaCorriente(12, 10.0, cliente);
				
		miBanco.agregarCuentaCorriente(cc);
		CuentaCorriente ccEsperada = miBanco.buscarCuentaCorriente(110);
		//en este equLS NO IMPORTA EL ORDEN DE LOS FACTORES
		assertEquals(cc.getCbu(), ccEsperada.getCbu());
	}
	@Test
	public void agregarCajaDeAhorroAlBanco() {

		Banco miBanco = new Banco("unlam");
		// Long dni, String nombre, String apellido
		Cliente cliente = new Cliente(26000L, "Juan", "Diaz");
//		Integer cbu, Cliente cliente, Double saldo
		CajaDeAhorro cah = new CajaDeAhorro(1, 5000.0,cliente);

		miBanco.agregarCajaDeAhorro(cah);
		CajaDeAhorro caObt= miBanco.buscarCajaDeAhorro(1);
		assertEquals(caObt.getCbu(),cah.getCbu());
	}
	@Test
	public void VerifcarTransferenciaEntreDosCuentasCorriente() {
//		preparacion datos necesarios banco cliente y cuentas
		Banco miBanco = new Banco("unlan");
		//creo el primer cliente:
		Cliente rene= new Cliente (26000L,"Rene","Diaz");
		//cuenta pasa x paramet: el cbu y el monto,mas el cliente
		CuentaCorriente cc1 = new CuentaCorriente (1, 5000.0 ,rene);
			miBanco.agregarCuentaCorriente(cc1);
		//creo el 2º cliente:
		Cliente ruben= new Cliente (26000L,"Ruben","Diaz");
		CuentaCorriente cc2 = new CuentaCorriente (1, 10000.0, ruben);
			miBanco.agregarCuentaCorriente(cc2);
			//ejecucion:
			//Integer cbuOrigen, Integer cbuDestino, Double monto estos para trasnf
			Boolean trasnfRealizada = miBanco.transferirEntreCuentasC(1, 2,5000.0);
//		con dos assertequals se pueba a ver cuanto dinero hay en cada uno
		assertEquals(0.0,cc1.getSaldo(),0.0);
		assertEquals(15000.0, cc2.getSaldo(),0.0);
		
		assertTrue(trasnfRealizada);
		
	}

}
