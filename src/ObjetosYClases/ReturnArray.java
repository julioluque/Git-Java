package ObjetosYClases;

public class ReturnArray {
	
	public static void main (String [] args) {
		
		FabricaDeArrays fab = new FabricaDeArrays();
		int nuevoArray[] = fab.ObtenerArray();
		
		System.out.println(fab);
		
	}

}
