package ejemplosbasicos.programa1;

import java.util.*;
import java.lang.*;

public class arraysYCadenas {

	public static void main (String []args) {
		
		// UNIDEMENSIONALES
		int notas[] = {8,7,9};; // int [] notas2; otra opcion para declarar
		notas = new int[3];
		int notas2[] = new int[] {4,1,3};
		int mesas[] = new int[3];
				
		/**
		 * Todo este segmento no complia por error en suma += nota[i];
		 */
		/*
		int nota[] = new int [17];
		int suma = 0;
		double media = 0;
		
		for (int i=0; i<=17; i++) {
			suma += nota[i];                           // ESTA LINEA GENERA ERROR.
			System.out.println(i+" nota: "+suma);
		}
		media = suma/18;
		System.out.println(suma + "promedio"+media);
		*/
		
        //lectura de datos y llenar el array
        
		// REFERENCIAS A UN MISMO ARRAY
		int valor1[];
		int valor2[] = new int [18];
		valor1= valor2;
		
		int valor3[] = {3,3,3};
		System.out.println(valor3[0]);
		int ejemplo[] = valor3;
		ejemplo = valor3;
		ejemplo[0] = 8;
		System.out.println("similitud de valores: valor3: "+ valor3[0]+ " y ejemplo: "+ ejemplo[0]);
		// _____________________________________________________________________________________________________
		
		//MULTIDIMENSIONALES
		
		int finales[][];
		finales = new int [3][10]; // sera, 3 arrays, de 10 cada uno, osea... 30;
		//finales[][] = 9;
		
		int casos [][]=new int [5][];
		casos [0] = new int [100];
		casos [1] = new int [200];
		casos [2] = new int [150];
		casos [3] = new int [220];
		casos [4] = new int [170];
		
		// longitud 
		System.out.println(casos.length);
		System.out.println(casos[4].length);
		
		

		
		
		
		
		
		
		
	}
}
