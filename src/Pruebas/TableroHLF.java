package Pruebas;

public class TableroHLF {

	public static void main(String[] args) {
		
		Tablero t1= new Tablero(8, '*');
		//t1.rellena('*');
		t1.setCasilla(3, 3, ' ');
		System.out.println(t1);
		

	}//main

}//class
