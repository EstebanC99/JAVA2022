package entities;

import java.util.ArrayList;
import java.util.Date;

public class Chofer {

	private String carnet;
	private Date proximoVencimiento;
	private double cantViajesPremio;
	private double premio;
	private ArrayList<Viaje> viajes;
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public Date getProximoVencimiento() {
		return proximoVencimiento;
	}
	public void setProximoVencimiento(Date proximoVencimiento) {
		this.proximoVencimiento = proximoVencimiento;
	}
	public double getCantViajesPremio() {
		return cantViajesPremio;
	}
	public void setCantViajesPremio(double cantViajesPremio) {
		this.cantViajesPremio = cantViajesPremio;
	}
	public double getPremio() {
		return premio;
	}
	public void setPremio(double premio) {
		this.premio = premio;
	}
	
	public ArrayList<Viaje> getViajesDelMes(){
		return this.viajes;
	}
}
