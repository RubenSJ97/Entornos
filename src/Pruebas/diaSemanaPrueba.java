package Pruebas;

public class diaSemanaPrueba {

	public static void main(String[] args) {
		
		diaSemana hoy = diaSemana.MIERCOLES;
		
		//Paso a entero
		System.out.println(hoy.ordinal());
		//¿Como paso de entero a Enum?

		
		diaSemana futuro = diaSemana.diaEnNDias(hoy,100);
		System.out.println(futuro);
		
		/*
		 int numMañana = (hoy.ordinal() + 4)% diaSemana.values().length;
		 
		 */
		
	}

}
