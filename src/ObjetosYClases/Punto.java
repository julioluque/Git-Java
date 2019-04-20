package ObjetosYClases;


public class Punto {

	int posX, posY; // posicion del putno
	
	Punto (){
		this.posX=posX;
		this.posY=posY;
	}
	
	public void suma (Punto punto2) {
		posX = punto2.posX;
		posY = punto2.posY;
	}
	
	public void dobla () {
		suma(this);
	}
	
}
