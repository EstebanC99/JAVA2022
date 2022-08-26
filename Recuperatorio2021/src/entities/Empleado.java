package entities;

import java.util.Date;

public abstract class Empleado {

	private int id;
	private String nombre;
	private Date ingreso;
	private double sueldoBase;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getIngreso() {
		return ingreso;
	}
	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public abstract String getSueldo();
}
