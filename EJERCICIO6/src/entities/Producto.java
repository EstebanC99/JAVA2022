package entities;

import java.time.*;


public class Producto {
	
	private int ID;
	private String Nombre;
	private String Descripcion;
	private double Precio;
	private int Stock;
	private Boolean EnvioIncluido;
	private LocalDateTime DisabledOn;
	private LocalDate DisabledDate;
	private LocalTime DisabledTime;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public Boolean getEnvioIncluido() {
		return EnvioIncluido;
	}
	public void setEnvioIncluido(Boolean envioIncluido) {
		EnvioIncluido = envioIncluido;
	}
	
	public String EvaluarEnvio() {
		return this.EnvioIncluido ? "Envio incluido" : "Envio no incluido";
	}
	
	@Override
	public String toString() {
		String mensaje = "Producto " + this.ID + ": " + this.Nombre + ", " + this.Descripcion + ", Precio: $" + this.Precio +", Cantidad en stock: "+ this.Stock + " unidades, " + this.EvaluarEnvio() + this.ObtenerDesactivacion() + ".";
		return mensaje;
	}
	
	public LocalDateTime getDisabledOn() {
		return DisabledOn;
	}
	public void setDisabledOn(LocalDateTime disabledOn) {
		DisabledOn = disabledOn;
	}
	public LocalDate getDisabledDate() {
		return DisabledDate;
	}
	public void setDisabledDate(LocalDate disabledDate) {
		DisabledDate = disabledDate;
	}
	public LocalTime getDisabledTime() {
		return DisabledTime;
	}
	public void setDisabledTime(LocalTime disabledTime) {
		DisabledTime = disabledTime;
	}
	
	private String ObtenerDesactivacion() {
		
		if (this.DisabledOn != null) {
			return ", Desactivado (" + this.DisabledOn + "), Fecha: " + this.DisabledDate + ", Hora: " + this.DisabledTime;
		}
		else {
			return "";
		}
	}
}
