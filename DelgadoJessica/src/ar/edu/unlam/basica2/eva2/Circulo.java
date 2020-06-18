package ar.edu.unlam.basica2.eva2;

import java.lang.Math;

public class Circulo extends Figura {
	private Double radio; 
	
	public Circulo(Double radio,String color){
		super(color);
		this.radio=radio;
		
	}

	@Override
	public Double calcularElArea() {
		Double area;
		area = (this.radio * this.radio * Math.PI);
		return area;
	}

	@Override
	public Double calcularElPerimetro() {
		Double longitud;
		longitud = (2 * this.radio * Math.PI);
		return longitud;
	}

	@Override
	public String dibujarFigura() {
		return "Circulo";
	}

}
