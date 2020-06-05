package herencia.pb2;

public class CuentaCorriente extends Cuenta {
	private Double limiteAlDescubierto;

	public CuentaCorriente( Integer cbu, Double saldo, Cliente cliente) {
		super(cbu ,saldo,cliente);
		this.limiteAlDescubierto = 1000.0;
		
	}

	// metodo sobreescritura de metodo
	@Override
	public void depositar(Double monto) {
//		this.saldo-= monto; solo para usar cuando saldo esta como protected
		setSaldo(super.getSaldo() + monto);//se recomienda esta forma.
	}

	@Override
	public Boolean extraer(Double monto) {
		if(monto<= getSaldo () + limiteAlDescubierto) {
			setSaldo(super.getSaldo()- monto);
		return true;
		}
		return false;
	}

	public Double getLimiteAlDescubierto() {
		return limiteAlDescubierto;
	}

	public void setLimiteAlDescubierto(Double limiteAlDescubierto) {
		this.limiteAlDescubierto = limiteAlDescubierto;
	}

		
}
