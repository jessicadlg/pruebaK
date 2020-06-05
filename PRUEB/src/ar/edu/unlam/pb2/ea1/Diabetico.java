package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public class Diabetico extends Paciente {
	private Integer azucarEnSangre;
	
	
	public Diabetico(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);
		this.azucarEnSangre= azucarEnSangre;	
	}
	
	public Integer getAzucarEnSangre() {
		return azucarEnSangre;
	}
	public void setAzucarEnSangre(Integer azucarEnSangre) {
		this.azucarEnSangre = azucarEnSangre;
	}


	@Override
	public void agregarDietaDiaria(DietaDiaria dieta) {
		super.getIngesta().add(dieta);
	}
}
