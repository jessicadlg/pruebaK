package practListas.pb2;

import java.util.ArrayList;

public class Producto {
	private Integer codigo;
	private String descripcion;
	private ArrayList<Categoria> listaDeCategoria;
	
	public Producto(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.listaDeCategoria = new ArrayList<>();
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the listaDeCategoria
	 */
	public ArrayList<Categoria> getListaDeCategoria() {
		return listaDeCategoria;
	}

	/**
	 * @param listaDeCategoria the listaDeCategoria to set
	 */
	public void setListaDeCategoria(ArrayList<Categoria> listaDeCategoria) {
		this.listaDeCategoria = listaDeCategoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((listaDeCategoria == null) ? 0 : listaDeCategoria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (listaDeCategoria == null) {
			if (other.listaDeCategoria != null)
				return false;
		} else if (!listaDeCategoria.equals(other.listaDeCategoria))
			return false;
		return true;
	}
	

	
}
