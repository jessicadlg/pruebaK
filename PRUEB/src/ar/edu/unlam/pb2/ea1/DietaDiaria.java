package ar.edu.unlam.pb2.ea1;

import java.util.HashSet;

public class DietaDiaria {
	//mio meti composicion:
	private Ingrediente ingrediente;
	/**
	 * No se permite repetir platos duarante todo el día.
	 */
	private HashSet<Plato> platos;

		// constructor
	public DietaDiaria(Ingrediente ingrediente) {
		this.ingrediente=ingrediente;
		this.platos = new HashSet<>();
	}
	// GETY SET-----------------------------
	public HashSet<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(HashSet<Plato> platos) {
		this.platos = platos;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	// GETY SET-----------------------------
	
	// mioAGREGO PLATO------------------------------------
	public Boolean agregarPlatoALaDieta(Plato plato) {
		
		return platos.add(plato);
	}
	// mioAGREGO PLATO------------------------------------

	private Integer totalDeSalEnDieta(DietaDiaria dieta) {
		Integer totalCantidadDeSal = 0;
		for (Plato plato : platos) {
			totalCantidadDeSal += dieta;
		}
		return totalCantidadDeSal;
	}

	private Integer totalDeAzucarEnDieta(){
		Integer totalCantidadDeAzucar=0;
		for (Plato plato : platos) {
			totalCantidadDeAzucar = plato.obtenerCantidadDeAzucar();	
		}
		return totalCantidadDeAzucar;
	}
	
//	public Boolean aptaHipertenso(){
//		if(platos.contains(o)<=3)
//		return ;
//		
//	}
	public Boolean aptaDiabetico() {
		if(ingrediente.getCantidadAzucar())
		return ;

	}
}
