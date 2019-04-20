package ejemplosbasicos.programa1;

import java.util.*;

public class ObjetosYClases {
	
	 
		double radio;		
		void girar(int velocidad) { }
		void parar(int velocidad) {	}
		
		//INSTANCIAR objeto.atributo;
		//INSTANCIAR objeto.metodo(argumentosDelMetodo);
		/*
		Julio.radio;
		Julio.girar(3);
		Julio julioConductor;
		julioConductor = new Julio();
		*/
	
	
		
	public static void main (String [] args) {
		
		ObjetosYClases prueba1 = new ObjetosYClases();
		prueba1.girar(3);
		prueba1.parar(2);
	}

}
