package Ejercicios;

public class Atleta {

	private String DNI;
	private String nombre;
	private int año_nac;
	private float altura;
	private int peso;
	private boolean estudia;
	
	public Atleta (String DNI, String nombre, int año_nac, float altura, int peso, boolean estudia) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.año_nac = año_nac;
		this.altura = altura;
		this.peso = peso;
		this.estudia = estudia;
	}
	
	public String toString () {
		StringBuffer Competidor = new StringBuffer();
		Competidor.append("El atlta se llama " + nombre + " mide " + altura + "pesa " + peso);
		return Competidor.toString();
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño_nac() {
		return año_nac;
	}

	public void setAño_nac(int año_nac) {
		this.año_nac = año_nac;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isEstudia() {
		return estudia;
	}

	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}
	
	

}
