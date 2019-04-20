package ObjetosYClases;

class Persona {

	public String nombre; // Se puede acceder desde cualquier clase
	private int contraseña; // Solo se accede desde la clase persona
	protected String direccion; // Acceden a esta propiedad, solo esta clase y sus descendientes
	
	class auto {
		public int nRuedas	= 4;
	}
}
