package Pruebas;

public class PersonajesPrueba {

	public static void main(String[] args) {
		GrupoPersonajes piña = new GrupoPersonajes();
		piña.añadePersonaje(new Personaje("Don Patricio","Patricio"));
		System.out.println(piña);

	}

}
