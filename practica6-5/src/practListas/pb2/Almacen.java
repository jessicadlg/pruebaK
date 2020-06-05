package practListas.pb2;

import java.util.HashSet;

public class Almacen {
	private String nombre;
	private HashSet <Producto> listaProductos;
	
	public Almacen(String nombre) {
		this.nombre = nombre;
		this.listaProductos = new HashSet<>();
	}
	
	public Boolean agregarProducto(Producto producto) {
		return listaProductos.add(producto);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the listaProductos
	 */
	public HashSet<Producto> getListaProductos() {
		return listaProductos;
	}

	/**
	 * @param listaProductos the listaProductos to set
	 */
	public void setListaProductos(HashSet<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
}
