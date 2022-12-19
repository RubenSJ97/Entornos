package Ejercicios;

public class EjerAlumno {

	private String nombre;
	private int edad;
	
	public EjerAlumno (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public EjerAlumno () {
		nombre = "";
		edad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return "El alumno se llama" + nombre + " y tiene " + edad + " años.";
	}

}
