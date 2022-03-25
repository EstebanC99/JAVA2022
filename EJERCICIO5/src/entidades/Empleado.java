package entidades;

public abstract class Empleado 
{
	private String dni;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	protected Double sueldoBase;
	
	public Empleado()
	{
		
	}
	
	public Empleado(String dni, String nombre, String apellido, String email, Double sueldoBase) 
	{
		this.SetDNI(dni);
		this.SetNombre(nombre);
		this.SetApellido(apellido);
		this.SetEmail(email);
		this.SetSueldoBase(sueldoBase);
	}
	
	protected void SetDNI(String dni) 
	{
		this.dni = dni;
	}
	
	protected void SetNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	protected void SetApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	
	protected void SetEmail(String email)
	{
		this.email = email;
	}
	
	protected void SetSueldoBase(Double sueldoBase)
	{
		this.sueldoBase = sueldoBase;
	}
	
	public String GetDNI()
	{
		return this.dni;
	}
	
	public String GetNombre()
	{
		return this.nombre;
	}
	
	public String GetApellido() 
	{
		return this.apellido;
	}
	
	public String GetEmail()
	{
		return this.email;
	}
	
	public abstract Double GetSueldoBase();

	public String GetEmpleado() 
	{
		return this.GetDNI() + " - " + this.GetNombre() + ", " + this.GetApellido() + " - Sueldo: $" + this.GetSueldoBase().toString(); 
	}
}
