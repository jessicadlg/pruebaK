package herenciaSimple;

public abstract class Figura {
	protected String color;
	protected String descripcion;
	protected Double altura;
	protected Double base;

	//const
	public Figura(String color,String descripcion) {
		this.color = color;
		this.descripcion = descripcion;
	}
//	metodos abstract
	public abstract Double calcularArea();
	
	public abstract Double calcularSuperficie();
	public abstract Double dibujarFigura();
	public abstract Double polimorfismo();

	
	public String mostrarTipo() {
		return null;
	}
	
	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}



	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

