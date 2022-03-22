package cuartoEjercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 
{

	public static void main(String[] args) 
	{
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingrese el número limitador: ");
		
		Integer numeroLimite = Integer.parseInt(lector.nextLine());
		
		System.out.println();System.out.println();
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Ingrese un número para la posición " + (i + 1) + ": ");
			numeros.add(Integer.parseInt(lector.nextLine()));
		}
		
		System.out.println();System.out.println();
		
		System.out.println("Los números mayores son: ");
		System.out.println(obtenerNumerosMayores(numeros, numeroLimite));
		
		lector.close();
		
	}
	
	private static ArrayList<Integer> obtenerNumerosMayores(ArrayList<Integer> numeros, Integer numeroLimite)
	{
		ArrayList<Integer> numerosMenores = new ArrayList<Integer>();
		
		for (Integer numero : numeros) 
		{
			if (numero <= numeroLimite) 
			{
				numerosMenores.add(numero);
			}
		}
		
		numeros.removeAll(numerosMenores);
		
		return numeros;
	}

}
