package tercerEjercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> palabras = new ArrayList<String>();
		
		Scanner lector = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("Ingrese la palabra " + (i+1) +  ": ");
			palabras.add(lector.nextLine());
		}
		
		System.out.println("Ingrese palabra de prueba: ");
		
		if (palabras.contains(lector.nextLine())) 
		{
			System.out.println("La palabra ya fue ingresada.");
		} else {
			System.out.println("La palabra no se ingresó.");
		}
		
		lector.close();
		
	}

}
