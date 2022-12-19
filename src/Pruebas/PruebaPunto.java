package Pruebas;

public class PruebaPunto {
	public static void main(String[] args) {
		Punto p1 = new Punto();
		Punto p2 = new Punto(3,4);
		p1.setPosX(3);
		p1.setPosY(4);
		
		System.out.println(p1);
		System.out.println(p1.equals(p2));
		
		
	}//main
}//class 
