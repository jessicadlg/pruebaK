package practListas.pb2;

import java.util.ArrayList;
import java.util.HashSet;

public class Categoria {
	private String nombre;
	private String descripcion;
	private Integer codigo;
	private Integer precio;
	private String lista;
	ArrayList<String>listaDeCategoria;
	
	public Categoria(Integer codigo) {
		this.codigo = codigo;
		this.listaDeCategoria = new ArrayList<>();
	}
	public Boolean agregaCategorias() {
		return listaDeCategoria.add(lista);
	}


	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the listaDeCategoria
	 */
	public ArrayList<String> getListaDeCategoria() {
		return listaDeCategoria;
	}
	/**
	 * @param listaDeCategoria the listaDeCategoria to set
	 */
	public void setListaDeCategoria(ArrayList<String> listaDeCategoria) {
		this.listaDeCategoria = listaDeCategoria;
	}

	



}
