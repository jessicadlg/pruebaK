package compos.pb2;

public class Direccion {
	private String calle;
	private Integer nro;
	private Integer cp;
	private Barrio barrio;
	
	public Direccion(String calle, Integer nro, Integer cp, Barrio barrio) {
		this.calle = calle;
		this.nro = nro;
		this.cp = cp;
		this.barrio = barrio;
	}

	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return the nro
	 */
	public Integer getNro() {
		return nro;
	}

	/**
	 * @param nro the nro to set
	 */
	public void setNro(Integer nro) {
		this.nro = nro;
	}

	/**
	 * @return the cp
	 */
	public Integer getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(Integer cp) {
		this.cp = cp;
	}

	/**
	 * @return the barrio
	 */
	public Barrio getBarrio() {
		return barrio;
	}

	/**
	 * @param barrio the barrio to set
	 */
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}
	
	
}
