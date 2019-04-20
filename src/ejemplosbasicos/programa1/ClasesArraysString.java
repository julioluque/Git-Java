package ejemplosbasicos.programa1;

import java.util.*;

public class ClasesArraysString {
	public static void main (String[]args) {
		
		int valor[] = new int [25];
		Arrays.fill(valor,15,20,-1);
		
		for (int i=0; i<=24; i++)
			System.out.println(i+" es " +valor[i]);
	
		int x[] = {9,2,3,4,5,6,5,4,5,6,7,8,1,0,4,1};
		for (int i=0; i<=15; i++)
			System.out.println(i+" Orden por posicion: "+x[i]);
		System.out.println(Arrays.binarySearch(x, 1));
		
		Arrays.sort(x);
		for (int i=0; i<=15; i++)
			System.out.println(i+" Ordenado por valores "+x[i]);
		System.out.println(Arrays.binarySearch(x, 2));
		
		String texto1 = "prueba "; System.out.println(texto1);
		String texto2 = "valor " + " concatenado"; System.out.println(texto2);
		
		System.out.println(texto1+texto2);
		System.out.println("comparacion de ambas cadenas de texto: "+texto1.equals(texto2));
		System.out.println("comaparacion " + texto1.compareTo(texto2));
	
		
		String numero = String.valueOf(1234d);
		String fecha = String.valueOf(new Date());
		System.out.println(numero + " y " + fecha);
		System.out.println(numero.length());  // muestra longitud del string
		
		String concatenar;
		concatenar= texto1.concat(texto2);
		System.out.println("concatenacion: "+concatenar);
		
		//indexOf
		String idea = "Necesito repasar todo java desde el principio y repasar Spring";
		System.out.println(idea.indexOf("repasar",10));
		System.out.println(idea.indexOf("repasar"));
		System.out.println(idea.lastIndexOf("repasar"));
		
		System.out.println(idea.replace("todo", "poco de"));
		System.out.println(idea.replaceAll(idea, concatenar));
		System.out.println(idea.replaceAll("e", "_"));
		System.out.println(idea);
		
		
	}
}

