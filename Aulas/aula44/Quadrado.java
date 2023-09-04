package aula44;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
	private double lado;

	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return Math.pow(lado, 2);
	}
	
}
