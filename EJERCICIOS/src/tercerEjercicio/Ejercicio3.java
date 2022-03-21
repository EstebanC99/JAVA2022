package tercerEjercicio;

import java.util.Scanner;

public class Ejercicio3 
{

	public static void main(String[] args) 
	{
		String[] palabras = new String[10];
		
		Scanner lector = new Scanner(System.in);
		
		for (int i = 0; i < palabras.length; i++) 
		{
			System.out.println("Ingrese la palabra " + (i+1) + ": ");
			palabras[i] = lector.nextLine();
		}
		
		System.out.println("");
		System.out.println("Ingrese una palabra mas: ");
		String ultimaPalabra = lector.nextLine();
		Boolean palabraYaIngresada = false;
		
		for (String palabra : palabras) 
		{
			if (palabra.equals(ultimaPalabra)) 
			{
				palabraYaIngresada = true;
			}
		}
		
		if (palabraYaIngresada) 
		{
			System.out.println("La palabra ya se había ingresado.");
		} else {
			System.out.println("La palabra no se había ingresado.");
		}
		
		lector.close();
		
	}

}
