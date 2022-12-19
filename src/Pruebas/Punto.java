package Pruebas;

public class Punto {
	private int posX;
	private int posY;
	
	public Punto() {
		this(0,0);
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Punto(int x, int y) {
		posX = x;
		posY = y;
	}

	public boolean equals(Punto p2) {
		return ( this.posX == p2.posX && this.posY == p2.posY);
	}
	
	@Override
	public String toString() {
		return String.format("(%d,%d)",posX,posY); //== return "(" + posX + "," + posY + ")";
	
	}//toString
	
	public double distancia(Punto p2) {
		return Math.sqrt(Math.pow(Math.abs(p2.posX-posX),2)+Math.pow(Math.abs(p2.posY-posY),2));
	}//distancia
	

}//classPunto
