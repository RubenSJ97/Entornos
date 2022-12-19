package Pruebas;

public class Alumnoprueba {

	public static void main(String[] args) {
		
		final int MAX_ALUM_CLASE = 10;
		Alumno [] clase = new Alumno [MAX_ALUM_CLASE];
		
		clase[0] = new Alumno("Ruben",25,10);
		clase[1] = new Alumno ("Fran",23,7);
		
		//for (int i=0;i<clase.length;i++) {
		for (Alumno a :clase) {
		if (a == null) break;
		System.out.println(a);
		}
	}

}
