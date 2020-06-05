package herencia.pb2;

import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
	private String nombre;
	ArrayList<CuentaCorriente> ListaCcorriente;
	ArrayList<CajaDeAhorro> ListaCajaDeAhorro;

	public Banco(String nombre) {
		this.nombre = nombre;
		ListaCcorriente = new ArrayList<>();
		ListaCajaDeAhorro = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<CuentaCorriente> getListaCcorriente() {
		return ListaCcorriente;
	}

	public void setListaCcorriente(ArrayList<CuentaCorriente> listaCcorriente) {
		ListaCcorriente = listaCcorriente;
	}

	public ArrayList<CajaDeAhorro> getListaCajaDeAhorro() {
		return ListaCajaDeAhorro;
	}

	public void setListaCajaDeAhorro(ArrayList<CajaDeAhorro> listaCajaDeAhorro) {
		ListaCajaDeAhorro = listaCajaDeAhorro;
	}

	public Boolean agregarCuentaCorriente(CuentaCorriente cuentaCorriente) {
		if (!ListaCcorriente.contains(cuentaCorriente))
			return ListaCcorriente.add(cuentaCorriente);
		else
			return false;
	}

	public Boolean agregarCajaDeAhorro(CajaDeAhorro cajaDeAhorro) {
		if (!ListaCajaDeAhorro.contains(cajaDeAhorro))
			return ListaCajaDeAhorro.add(cajaDeAhorro);
		else
			return false;
	}

	public CajaDeAhorro buscarCajaDeAhorro(Integer cbu) {
		for (CajaDeAhorro estacajaDeAhorro : ListaCajaDeAhorro) {
			if( estacajaDeAhorro.getCbu().equals(cbu));
			return estacajaDeAhorro;
		}
		return null;
	}

	public CuentaCorriente buscarCuentaCorriente(Integer cbu) {
		Iterator<CuentaCorriente> it = ListaCcorriente.iterator();
		while (it.hasNext()) {
			CuentaCorriente ListaCcorriente = it.next();
			if (ListaCcorriente.getCbu().equals(cbu)) {
				return ListaCcorriente;
			}
		}
		return null;
	}

	public Boolean transferirEntreCuentasC(Integer cbuOrigen, Integer cbuDestino, Double monto) {
		CuentaCorriente ccOrigen = this.buscarCuentaCorriente(cbuOrigen);
		CuentaCorriente ccDestino = this.buscarCuentaCorriente(cbuDestino);

		Boolean extraccionExit = ccOrigen.extraer(monto);
		if (extraccionExit) {
			ccDestino.depositar(monto);
			return true;
		}
		return false;
	}
	public Boolean transferirEntreCajaDeAhorro(Integer cbuOrigen, Integer cbuDestino, Double monto) {
		CajaDeAhorro cajaOrigen = this.buscarCajaDeAhorro(cbuOrigen);
		CajaDeAhorro cajaDestino = this.buscarCajaDeAhorro(cbuDestino);

		Boolean extraccionExit = cajaOrigen.extraer(monto);
		if (extraccionExit) {
			cajaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	 
	 
	public Integer cantidadDeCuentas() {
		return this.ListaCajaDeAhorro.size() + this.ListaCcorriente.size();
	}
	//AVERIGUAR DE TAREA:
	public ArrayList<Cuenta> obtenerListaDeCuentasTotalesCliente(Long dni) {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        for (CuentaCorriente cuentaCorriente : ListaCcorriente) {
            if (cuentaCorriente.getCliente().getDni().equals(dni)) {
                cuentas.add(cuentaCorriente);
            }
        }
        for (CajaDeAhorro cc : this.ListaCajaDeAhorro) {
            if (cc.getCliente().getDni().equals(dni)) {
                cuentas.add(cc);
            }
        }
        return cuentas;
    }
}
	
