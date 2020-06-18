package ar.edu.unlam.basica2.eva2;


import java.util.ArrayList;
import java.util.LinkedList;

public class ContenedorFigura {
	
	private ArrayList<Figura> listaFiguras;
	
	public ContenedorFigura() {
		this.listaFiguras=new ArrayList<>();
	}
	
	public Boolean agregar (Figura figura) {
		return listaFiguras.add(figura);
	}
	
	public ArrayList <Rectangulo> obtenerRectangulos(){
		ArrayList <Rectangulo> rectangulos= new ArrayList<>();
		for (Figura figura : listaFiguras) {
			if(figura instanceof Rectangulo) {
				rectangulos.add((Rectangulo)figura);
			}
		}
		return rectangulos;
	}

	public LinkedList <Circulo> obtenerCirculos() {
		LinkedList<Circulo> circulos= new LinkedList<>();
		for (Figura figura : listaFiguras) {
			if(figura instanceof Circulo) {
				circulos.add((Circulo)figura);
			}
		}
		return circulos;
	}
	
	public Double calcularPromedioDeAreaDeTodasLasFiguras() {
		Double totalAreas=0.0;
		
		for (Figura figura : listaFiguras) {
			totalAreas+= figura.calcularElArea();
		}
		return (totalAreas/ this.listaFiguras.size());
		

	}

	public ArrayList<Figura> getListaFiguras() {
		return listaFiguras;
	}

	public void setListaFiguras(ArrayList<Figura> listaFiguras) {
		this.listaFiguras = listaFiguras;
	}
		
}
