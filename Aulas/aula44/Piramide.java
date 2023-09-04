package aula44;

public class Piramide extends Figura3D implements DimensaoVolumetrica{
	
	private double area;
	private double altura;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularVolume() {
		return area * altura;
	}
	
	
}