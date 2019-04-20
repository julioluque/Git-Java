package ObjetosYClases;

public class Ficha {
	private int casilla;
	
	Ficha (){
		casilla =1;
	}
	
	Ficha(int n){
		casilla = n;
	}
		
	public void avanzar (int n) {
		casilla += n;
	}
	
	public int casillaActual () {
		return casilla;
	}

}
