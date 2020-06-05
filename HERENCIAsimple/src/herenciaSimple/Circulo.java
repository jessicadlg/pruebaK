package herenciaSimple;

public class Circulo extends Figura {
	private Double radio;
	
	public Circulo(String color ,String descripcion,Double radio) {
		super(color,descripcion);
		this.radio= radio;
	}
	@Override
	public Double calcularSuperficie() {
		Double resultado=(Math.pow(this.radio,2)*Math.PI);
		return resultado;
		}
	
	@Override
	public String mostrarTipo() {
		return "Soy un circulo";
	}
	
//	@Override
//	public calcularPerimetro() {
//		return (double)(this.2 * Math.PI * radio);
//	}
//	
//	@Override
//	public calcularArea() {
//		return  (double) (this. Math.PI * radio* radio);
//	}

	@Override
	public Double dibujarFigura() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Double calcularArea() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Double polimorfismo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
