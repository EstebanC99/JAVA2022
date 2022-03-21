package cuartoEjercicio;

import java.util.Scanner;

public class Ejercicio4 
{

	public static void main(String[] args) 
	{
		Scanner lector = new Scanner(System.in);
		Integer[] numeros = new Integer[5];
		
		
		int numeroBarrera = ingresarNumerosYDevolverLimite(lector, numeros);
		
		Integer[] numerosMayores = obtenerNumerosMayores(numeros, numeroBarrera);
		
		System.out.println("Los numeros mayores son:");
		
		for (Integer numero : numerosMayores) 
		{
			if (numero != null) 
			{
				System.out.println(numero);
			}
		}

	}

	private static Integer[] obtenerNumerosMayores(Integer[] numeros, int numeroBarrera) 
	{
		Integer[] numerosMayores = new Integer[5];
		int i = 0;
		
		for (Integer numero: numeros) 
		{
			if (numero > numeroBarrera) 
			{
				numerosMayores[i] = numero;
				i++;
			}
		}
		return numerosMayores;
	}

	private static int ingresarNumerosYDevolverLimite(Scanner lector, Integer[] numeros) 
	{
		System.out.println("Ingrese el numero entero de barrera:");
		int numeroBarrera = Integer.parseInt(lector.nextLine());
		
		for (int i = 0; i < numeros.length; i++) 
		{
			System.out.println("Ingrese el número [" + (i + 1) +"]: ");
			numeros[i] = Integer.parseInt(lector.nextLine());
		}
		
		lector.close();
		return numeroBarrera;
	}

}
