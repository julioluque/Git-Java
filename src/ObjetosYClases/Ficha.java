package ObjetosYClases;

public class Ficha {
	private int casilla;
	
	Ficha (){		// constructor incializado
		casilla =1;
	}
	
	Ficha(int n){	// constructor vacio
		casilla = n;
	}
		
	/**
	 * metodos
	 * @param n valor de la casilla
	 */
	public void avanzar (int n) {
		casilla += n;
	}
	
	public int casillaActual () {
		return casilla;
	}

}
