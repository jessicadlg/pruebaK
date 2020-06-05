package compos.pb2;

public class Farmacia {
	private String nombre;
	private Direccion direccion;
	private Integer cantEmpleados;
	
	public Farmacia(String nombre, Direccion direccion, Integer cantEmpleados) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.cantEmpleados = cantEmpleados;
	}

	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}
	

	/**
	 * @return the cantEmpleados
	 */
	public Integer getCantEmpleados() {
		return cantEmpleados;
	}

	/**
	 * @param cantEmpleados the cantEmpleados to set
	 */
	public void setCantEmpleados(Integer cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantEmpleados == null) ? 0 : cantEmpleados.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Farmacia other = (Farmacia) obj;
		if (cantEmpleados == null) {
			if (other.cantEmpleados != null)
				return false;
		} else if (!cantEmpleados.equals(other.cantEmpleados))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		return true;
	}
	
	
}
