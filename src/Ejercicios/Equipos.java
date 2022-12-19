package Ejercicios;

public class Equipos {

	private String ciudad;
	private String apodo;
	
	public Equipos (String ciudad, String apodo) {
		this.ciudad = ciudad;
		this.apodo = apodo;
	}
	
	public String toString () {
		return "El equipo se llama " + ciudad + " "  + apodo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	

	
}
