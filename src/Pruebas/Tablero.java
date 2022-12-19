package Pruebas;

public class Tablero {
	private char[][] tablero;
	
	public Tablero(int tamagno, char caracter) {
		this.tablero = new char[tamagno][tamagno];
		rellena(caracter);
	}
	
	public String toString() {
		String res=" ";
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				res+=tablero[i][j];
			}
		}
		return res;
	} //toString
	
	
	public void rellena (char caracter) {
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				tablero[i][j] = caracter;
			}
		}
	}//rellena

	public char getCasilla (int ancho, int alto) {
		return tablero[ancho][alto];
	}//getcasilla
	
	public void setCasilla (int ancho, int alto, char cambio) {
		tablero[ancho][alto]=cambio;
	}//setcasilla	
	
}//class
