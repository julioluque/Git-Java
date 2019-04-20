package ObjetosYClases;

public class Vehiculo {

	//FUNCION PRINCIPAL
	int ruedas;
	private double velocidad = 0;
	String nombre;
	
	//AUMENTA VELOCIDAD
	public void acelerar(double cantidad) {
		velocidad += cantidad;
	}
	
	//DISMINUYE VELOCIDAD
	public void frenar(double cantidad) {
		velocidad -= cantidad;
	}
	
	//DEVUELVE VELOCIDAD
	public double obtenerVelocidad() {
		return velocidad;
	}
	
	
	public static void main(String []args) {
		
		Vehiculo miCoche = new Vehiculo();
		miCoche.acelerar(12);
		miCoche.frenar(5);
		
		System.out.println(miCoche.obtenerVelocidad());
		
	}
	
	
	
	
}
