package ejemplosbasicos.programa1;

class estructurasDeControlDeFlujo {
	
	public static void main (String []args) {
		int diaSemana = 6, mesAnio = 4;
		boolean trabajar;
		String dia, mes;
		
		
		if((diaSemana >= 1)&&(diaSemana<=5)) {
			trabajar = true;
		}
		else {
			trabajar = false;
		}
		System.out.println("trabajo esta semana? " + trabajar);
		
		if (diaSemana == 1) dia = "Lunes";
		else if (diaSemana == 2) dia = "Martes";
		else if (diaSemana == 3) dia = "Miercoles";
		else if (diaSemana == 4) dia = "Jueves";
		else if (diaSemana == 5) dia = "Viernes";
		else if (diaSemana == 6) dia = "Sabado";
		else if (diaSemana == 7) dia = "Domingo";
		else dia = "?";
		System.out.println("Trabajo el dia : "+dia);
		
		switch (mesAnio) {
			case 1: mes = "Enero"; 		break;
			case 2: mes = "Febrero";	break;
			case 3: mes = "Marzo";		break;
			case 4: mes = "Abril";		break;
			case 5: mes = "Mayo";		break;
			case 6: mes = "Junio";		break;
			default: mes = "no es del primer semestre";
		}
		System.out.println("Cursando mes: "+mes);
		
		switch (diaSemana) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: dia = "Laborable"; break;
			case 6:
			case 7: dia = "Fin de semana"; break;
		default: dia = "Fuera de rango";
		}
		System.out.println("hoy es dia:" + dia);

	// Sentenicia WHILE
	int numero=10;
	int factorial =1, temporal = numero;
	System.out.println("Factorial de "+numero+ " es ");
	while (temporal >= 0) {
		System.out.println(temporal);
		factorial *= temporal --;
	}
	
	// SENTENCIA DO WHIE
	int fact = 1, temp = numero;
	do {
		System.out.println("Segundo factorial de "+numero+" es "+ temp);
		fact *= temp-- ;
	}while (fact >= 1);
	
	
	// SENTENCIA FOR
	
	
	
	}
}
