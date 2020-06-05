package herenciaSimple;

public abstract class Rectangul extends Figura {
	private Double base;
	private Double altura;
	//constructor de herencia
	public Rectangul(String color, String descripcion, Double base,Double altura) {
		super(color, descripcion);
		this.base = base;
		this.altura = altura;
	}
	
	public Double calcularArea() {
		return base*altura;
	}
	
	
	public Double getBase() {
		return base;
	}
	
	public void setBase(Double base) {
		this.base = base;
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public void setColor(String color) {
		System.out.println("estoy en el hijo");
		super.setColor("rojo");
	}
}
