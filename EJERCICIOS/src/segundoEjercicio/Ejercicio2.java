package segundoEjercicio;

import java.util.Scanner;

public class Ejercicio2 
{

	public static void main(String[] args) 
	{
		String[] palabras = new String[10];
		Scanner texto = new Scanner(System.in);
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("Ingrese la palabra " + (i+1) + ": ");
			palabras[i] = texto.nextLine();
		}
		
		for (int i = palabras.length - 1; i >= 0 ; i--) 
		{
			System.out.println(palabras[i]);
		}
		
		texto.close();
	}

}
