package entidades;

public class Vendedor extends Empleado 
{
	private double porcenComision;
	
	private double totalVentas;
	
	public Vendedor(String dni, String nombre, String apellido, String email, Double sueldoBase, double porcenComision, double totalVentas)
	{
		super(dni, nombre, apellido, email, sueldoBase);
		this.SetPorcenComision(porcenComision);
		this.SetTotalVentas(totalVentas);
	}
	
	protected void SetPorcenComision(double porcenComision) 
	{
		this.porcenComision = porcenComision;
	}
	
	protected void SetTotalVentas(double totalVentas)
	{
		this.totalVentas = totalVentas;
	}
	
	public double GetPorcenComision()
	{
		return this.porcenComision;
	}
	
	public double GetTotalVentas()
	{
		return this.totalVentas;
	}
	
	public Double GetSueldoBase()
	{
		return this.sueldoBase + ((this.porcenComision * this.totalVentas) / 100);
	}
}
