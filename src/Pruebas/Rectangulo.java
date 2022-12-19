package Pruebas;

public class Rectangulo {
	private int alto,ancho;
	
	public Rectangulo (int alto, int ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public Rectangulo () {
	}
	
	public Rectangulo(int lado) {
		this.alto = lado;
		this.ancho = lado;
		//this(lado,lado);
	}
	
	public String toString() {
		return String.format("Soy un rectangulo con " + "alto %d y ancho %d",alto,ancho );
	}
	
	public double area() {
		return alto * ancho;
	}
	

}//ClassRectangulo