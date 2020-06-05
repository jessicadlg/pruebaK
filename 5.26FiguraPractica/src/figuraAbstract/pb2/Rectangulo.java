package figuraAbstract.pb2;
public class Rectangulo extends Figura {
	private Integer base;
	private Integer altura;
	
	
	public Rectangulo(String color, Integer base, Integer altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public Integer calcularPerimetro(Integer base, Integer altura) {
		this.base=base;
		this.altura=altura;
		Integer resultado = 2 * (base+altura);
		return resultado;
	}
	
	public Integer getBase() {
		return base;
	}
	public void setBase(Integer base) {
		this.base = base;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	@Override
	public String mostrarColor(String color) {
		return this.color=color;
	}
	@Override
	public String mostrarTipo(String tipo) {
		return this.tipo=tipo;
	}

	
	
}
