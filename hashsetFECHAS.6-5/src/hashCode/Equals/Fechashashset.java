package hashCode.Equals;

import java.util.HashSet;

public class Fechashashset {

	HashSet<Fech> fechas = new HashSet<>();
	
	public Boolean agregarFecha(Fech fecha){
		return fechas.add(fecha);
	}

	public HashSet<Fech> getFechas() {
		return fechas;
	}

	public void setFechas(HashSet<Fech> fechas) {
		this.fechas = fechas;
	}
	
	
}
