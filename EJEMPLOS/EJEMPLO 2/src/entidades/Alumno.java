package entidades;

public class Alumno extends Persona 
{
	private int legajo;

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public Alumno() 
	{
		this.setLegajo(46471);
	}
	
	public Alumno(int legajo, int dni, String apellido, String nombre) 
	{
		super(dni, apellido, nombre);
		this.setLegajo(legajo);
	}
	
	@Override //Anotacion que sirve para avisar que cometo error en el nombre del metodo heredado
	public String getDetalle(boolean mostrarDatosSensibles) 
	{
		return this.getDetalle(mostrarDatosSensibles) + " - Legajo: " + this.getLegajo();
	}
}
