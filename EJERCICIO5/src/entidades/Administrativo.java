package entidades;

public class Administrativo extends Empleado 
{
	private int hsExtra;
	
	private int hsMes;
	
	public Administrativo(String dni, String nombre, String apellido, String email, Double sueldoBase, int hsExtra, int hsMes) 
	{
		super(dni, nombre, apellido, email, sueldoBase);
		this.SetHsExtra(hsExtra);
		this.SetHsMes(hsMes);
	}
	
	protected void SetHsExtra(int hsExtra)
	{
		this.hsExtra = hsExtra;
	}
	
	protected void SetHsMes(int hsMes)
	{
		this.hsMes = hsMes;
	}
	
	public int GetHsExtra() 
	{
		return this.hsExtra;
	}
	
	public int GetHsMes()
	{
		return this.hsMes;
	}
	
	public Double GetSueldoBase()
	{
		return this.sueldoBase * ((this.hsExtra * 1.5) + this.hsMes) / this.hsMes;
	}
}
