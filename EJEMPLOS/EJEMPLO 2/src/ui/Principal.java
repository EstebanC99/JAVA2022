package ui;

import entidades.Alumno;
import entidades.Persona;

public class Principal 
{

	public static void main(String[] args) 
	{
		Persona p1 = new Persona();
		
		p1.setDni(1111111);
		p1.setApellido("Carignani");
		p1.setNombre("Esteban");
		
		System.out.println(p1.getDetalle(true));
		
		Alumno a1 = new Alumno();
		
		System.out.println(a1.getDetalle(true) + " - legajo: " + a1.getLegajo());
		
		Persona a3 = new Alumno();
		
		a3.setDni(4444);
		a3.setApellido("Algo");
		a3.setNombre("Extraño");
		
		((Alumno)a3).setLegajo(46471);
		
		System.out.println("a3:: " + a3.getDetalle(true));
	}

}
