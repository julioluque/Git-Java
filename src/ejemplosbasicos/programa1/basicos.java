package ejemplosbasicos.programa1;

import java.util.Date;
import java.lang.Math;


public class basicos {

	public static void main (String []args) {
		System.out.println("Primer programa con comentarios");
	
		/**
		 * contiene codigo ejecutable de la clase
		 * @param args
		 */
		//int j=12; byte m = j; // Error de compilacion
		int i=12; byte b=(byte)i; //convertir valores haciendo cast
		int f=1200; byte c = (byte)f;  // El valor F no tiene sentido
		System.out.println("el valor F no tiene sentido"+f);
		
		double num2 = 1.5d;
		boolean activo = false;
		char letra = 'c';
		char letra2 = 67;
		System.out.println("letra por unicode y por caracter "+letra+" y "+letra2);
		
		
		// OPERADOR NOT
		// Niega condiciones simples
		int edad = 21;
		boolean mayorDeEdad = edad >= 18;
		boolean menorDeEdad = !mayorDeEdad;
		System.out.println("Edad ingresada "+edad+" es mayor de edad? "+mayorDeEdad);
				
		
		// OPERADOR AND
		// Si la edad es al menos de 18 años, y carnet de conducir es true, puede conducir es true
		boolean carnetConducir = true;
		boolean puedeConducir = (edad >= 18) && carnetConducir;
		System.out.println("edad ingresada "+edad+" puede conducir?"+puedeConducir);
		// OPERADOR OR
		// evalua dos o mas epresiones, asi si cumple al menos una condicion, es TRUE
		boolean nieva = true, llueve = false, graniza = false;
		boolean maltiempo = nieva || llueve || graniza;
		System.out.println("hay mal tiempo en Bs As: "+maltiempo);
	
	}
}
