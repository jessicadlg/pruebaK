package HerenciaCUENTA;

public class CajaDeAhorros extends Cuenta {

	public CajaDeAhorros(String nombreCliente) {
		super(nombreCliente);
	}
	
		@Override
		public Boolean extraer(Double monto) {
			Boolean extraccionRealizada = false;
			if(monto <= this.saldo) {
				this.saldo = (this.saldo - monto);
					extraccionRealizada = true;
			}
			//for ( iterable_element : iterable) {
				
//			}
			return extraccionRealizada;
		}

		@Override
		public void depositar(Double monto) {
			this.saldo+= monto;
		}
	
}
