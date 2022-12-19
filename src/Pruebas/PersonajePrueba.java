package Pruebas;

public class PersonajePrueba {

	public static void main(String[] args) {
		final int NUM_PERSONAJE = 13;
		Personaje[]piña = new Personaje[NUM_PERSONAJE];
		
		piña[0] = new Personaje("Arenita Mejillas","Arenita");
		
		
		for (Personaje p : piña) {
		System.out.println(p);
		}
	}//main

}//class
