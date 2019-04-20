package ObjetosYClases;

public class PruebaPorValor {

	public void metodo1(int entero) {
		entero = 18;
	}
	
	public void metodo2(int [] entero) {
		entero [0]= 17;
	}
	
	
	public static void main (String [] args) {
		int x = 24;
		int y[] = {23, 23};
		
		PruebaPorValor miPrueba = new PruebaPorValor();
		
		miPrueba.metodo1(x);
		System.out.println("Metodo 1: "+ x);
		
		miPrueba.metodo2(y);
		System.out.println("Metodo 2: " + y[0]);
		
		
	}
}
