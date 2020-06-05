package HerenciaCUENTA;

public abstract class Cuenta {
	protected Double saldo;
	protected String nombreCliente;
	
	public Cuenta(String nombreCliente) {
		this.nombreCliente= nombreCliente;
		this.saldo= 0.0;
	}
	
	public abstract Boolean extraer(Double monto);
		
	public abstract void depositar(Double monto);

	
	public Double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
}
	
