package nohomerosbarHashset.pb2;

import java.util.HashSet;

public class Bar {
	private String nombreBar;
	private HashSet<Cliente>listaClientes;
	
	public Bar(String nombreBar) {
		this.nombreBar = nombreBar;
		this.listaClientes= new HashSet<>();
	}

	public Boolean agregarCliente(Cliente cli) {
		return listaClientes.add(cli);
	}
	
	public Integer cantidadDeClientes() {
		return listaClientes.size();
	}
	
}
