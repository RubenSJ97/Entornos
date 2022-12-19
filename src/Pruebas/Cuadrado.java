package Pruebas;

public class Cuadrado {
	private int lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public String toString() {
		return "Soy un cuadrado de lado: " + lado;
	}
	
	public double area() {
		return lado * lado;
	}

}//ClassCuadrado
