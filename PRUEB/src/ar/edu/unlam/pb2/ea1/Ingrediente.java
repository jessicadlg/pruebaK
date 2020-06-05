package ar.edu.unlam.pb2.ea1;

public class Ingrediente {

	private String nombre;
	private Integer cantidadSal;
	private Integer cantidadAzucar;

	public Ingrediente(String nombre, Integer cantidadSal,
			Integer cantidadAzucar) {
		this.nombre = nombre;
		this.cantidadSal = cantidadSal;
		this.cantidadAzucar = cantidadAzucar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Ingrediente other = (Ingrediente) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadSal() {
		return cantidadSal;
	}

	public void setCantidadSal(Integer cantidadSal) {
		this.cantidadSal = cantidadSal;
	}

	public Integer getCantidadAzucar() {
		return cantidadAzucar;
	}

	public void setCantidadAzucar(Integer cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}

}
