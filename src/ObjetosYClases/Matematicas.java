package ObjetosYClases;

public class Matematicas {

	public double factorial (int n) {
		double resultado;
		for (resultado=n; n>1; n--) {
			System.out.println(n);
			resultado*=n;
		}
		return resultado;
	}
	
	public static void main (String [] args) {
		
		Matematicas m1 = new Matematicas();
		double x=m1.factorial(25); // llama al metodo
		
		System.out.println("resultado");
		
		
	}
}
