package ObjetosYClases;

//import javax.swing.jframe;

/**
 * Inicial, pruebas de constructores inicializados y vacios.
 * @author Alfredo
 *
 */
public class FichaApp {

	public static void main (String[] args) {
		
		// variable master que modifica ambas fichas
		int i=5;
		
		Ficha ficha1 = new Ficha();
		ficha1.avanzar(i);
		System.out.println("Avance con constructor vacio= "+ficha1.casillaActual());
		
		Ficha ficha2 = new Ficha(9);
		ficha2.avanzar(i);
		System.out.println("avance con constructor lleno= "+ficha2.casillaActual());
	}
}
