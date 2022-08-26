package entities;

import java.util.ArrayList;
import java.util.LinkedList;

public class Guia extends Empleado{
	
	public Guia() {
		this.idiomas = new LinkedList<>();
	}
	
	private String disponibilidad;
	
	private double valorHora;
	
	private LinkedList<Idioma> idiomas;
	
	private ArrayList<Viaje> viajes;

	public LinkedList<Idioma> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(LinkedList<Idioma> idiomas) {
		this.idiomas = idiomas;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public void addIdioma(Idioma idioma) {
		this.idiomas.add(idioma);
	}
	
	public String getSueldo() {
		return null;
	}
	
	public ArrayList<Viaje> getViajesDelMes(){
		return this.viajes;
	}
}
