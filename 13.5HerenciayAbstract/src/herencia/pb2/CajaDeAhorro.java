package herencia.pb2;

public class CajaDeAhorro extends Cuenta {
	private Integer cantidadDeExtracciones;
	private final Double comision=6.0;


	public CajaDeAhorro( Integer cbu, Cliente cliente){
		super(cbu, /*saldo*/ 0.0, cliente);
		this.cantidadDeExtracciones = 0;
		
	}
	public CajaDeAhorro( Integer cbu,  Double saldo,Cliente cliente){
		super(cbu,saldo , cliente);
		this.cantidadDeExtracciones = 0;
		
	}

	//  sobreescritura de metodo
		@Override
		public void depositar(Double monto) {
			setSaldo(super.getSaldo()+ monto);
		}

		@Override
		public Boolean extraer(Double monto) {
			Double costoAdicional=0.0;
			if(this.cantidadDeExtracciones>=5) {
				costoAdicional=comision;
			}
			
			if(monto<= getSaldo ()- costoAdicional) {
				setSaldo(super.getSaldo()- monto);
				cantidadDeExtracciones++;
				return true;
			}
				return false;
		}
		
		
		
		
}

