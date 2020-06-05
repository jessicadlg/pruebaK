package practListas.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testQueAgregaUnProductoAlaAlmacen() {
		Producto p1 = new Producto(111, "rojo");
		Almacen al1 = new Almacen("Almacen keki");

		assertTrue(al1.agregarProducto(p1));
	}

	@Test
	public void testQueNoPuedaAgregarDosProductosConElMismoCodigoAlaAlmacen() {
		// preparacion
		Almacen al1 = new Almacen("Almacen keki");
		Producto p1 = new Producto(111, "rojo");
		Producto p2 = new Producto(111, "rojo");
		al1.agregarProducto(p1);
		al1.agregarProducto(p2);

		// compruebo por consolaa
//		System.out.println(al1.getListaProductos().size());
		assertEquals(1,al1.getListaProductos().size());
	}
}
