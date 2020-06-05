package figuraAbstract.pb2;

public class Circulo extends Figura {

	private Double radio;

//constr
	public Circulo(String color, Double radio) {
		super(color);
		this.radio = radio;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public Double calcularSuperficie() {
		Double resultado = (Math.pow(this.radio, 2) * Math.PI);
		return resultado;
	}

	@Override
	public String mostrarColor(String color) {
		return this.color = color;
	}

	@Override
	public String mostrarTipo(String tipo) {
		return this.tipo = tipo;
	}

}
