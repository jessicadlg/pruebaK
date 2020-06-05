package ar.edu.unlam.pb2.ea1;


import java.util.ArrayList;

public class Plato {
	/** Por ejemplo, si para un Plato se necesitan DOS (2) tomates,
	se deberá agregar DOS(2) unidades de tomate. 
	*/
	private ArrayList<Ingrediente> ingredientes;
	//constructor
	public Plato() {
		this.ingredientes = new ArrayList<>();
	}
	//public void crearPlato
	
	/* voy agregando unos detras de otro ingrediente a la lista:*/
	public Boolean agregarIngredienteAlPlato(Ingrediente ingrediente1) {
		return ingredientes.add(ingrediente1);
		
	}
	public Integer obtenerCantidadDeSal(Plato plato){
		Integer cantidadSal =0;
		for (Ingrediente ingrediente : ingredientes) {
			cantidadSal+=ingrediente.getCantidadSal();
			}
		return cantidadSal;	
	}
	
	public Integer obtenerCantidadDeAzucar(Plato plato){
		Integer cantidadAzucar =0;
		for (Ingrediente ingrediente : ingredientes) {
			cantidadAzucar+=ingrediente.getCantidadAzucar();
			}
		return cantidadAzucar;		
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

}
