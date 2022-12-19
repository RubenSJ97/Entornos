package Pruebas;

public enum diaSemana {
	LUNES, MARTES, MIERCOLES, JEVES, VIERNES, SABADO, DOMINGO;
	
	public static diaSemana diaEnNDias(diaSemana dia, int dias) {
	diaSemana nuevoDia;
	final int MAX =diaSemana.values().length -1; 
	int nuevo = dia.ordinal() + dias;
		for (int n=1; n<dias;n++) {
			nuevo = nuevo + 1;
			if (nuevo>MAX) nuevo = 0;
		
		}
	nuevoDia = diaSemana.values()[nuevo];
	
	return nuevoDia;
	}
}
