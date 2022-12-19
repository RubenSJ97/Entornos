package Pruebas;

public class StringBuilderPrueba {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hola");
		StringBuilder sb2 = new StringBuilder("Pepa");
		
		swap(sb1,sb2);
		//sb1.append(" ");
		//sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(sb2);
	}//main
	public static void swap(StringBuilder s1, StringBuilder s2) {
		StringBuilder aux = new StringBuilder(s1);
		
		
	}
}//class
