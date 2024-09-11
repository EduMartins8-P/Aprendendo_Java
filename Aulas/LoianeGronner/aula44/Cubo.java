package aula44;

public class Cubo extends Figura3D implements DimensaoVolumetrica{
	
	private double lado;

	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularVolume() {
		return Math.pow(lado, 3);
	}
	
}
