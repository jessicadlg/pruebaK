package HerenciaCUENTA;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(String nombreCliente) {
		super(nombreCliente);
	}
		@Override
		public Boolean extraer(Double monto) {
			Boolean extraccionRealizada = false;
			if(monto <= this.saldo) {
				this.saldo = (this.saldo - monto);
					extraccionRealizada = true;
			}
			return extraccionRealizada;
		}

		@Override
		public void depositar(Double monto) {
			this.saldo+= monto;
		}
}
