package HerenciaCUENTA;

import static org.junit.Assert.*;

import org.junit.Test;

public class testQ {

	@Test
	public void testQuePermitaExtraerCuandoTengaSaldoSuficiente() {
		// preparacion
		CuentaSueldo c = new CuentaSueldo("keki");
		c.setSaldo(4000.0);
		Double montoaExtraer = 4000.0;
		// ejecucion
		Boolean extraccionRealizada = c.extraer(montoaExtraer);

		// evaluar
		assertTrue(extraccionRealizada);
	}
	@Test
	public void testQueNoPermitaExtraerLuegoDe5Veces() {
		// preparacion
		CuentaSueldo c = new CuentaSueldo("cris");
		c.setSaldo(4000.0);
		Double montoaExtraer = 4500.0;
		// ejecucion
		Boolean extraccionRealizada = c.extraer(montoaExtraer);

		// evaluar
		assertFalse(extraccionRealizada);
	}
	

	
	@Test
	public void testQueNoPermitaExtraerCuandoTengaSaldoInsuficiente() {
		// preparacion
		CuentaSueldo c = new CuentaSueldo("cris");
		c.setSaldo(4000.0);
		Double montoaExtraer = 4500.0;
		// ejecucion
		Boolean extraccionRealizada = c.extraer(montoaExtraer);

		// evaluar
		assertFalse(extraccionRealizada);
	}
	

}
