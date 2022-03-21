package primerEjercicio;

public class Ejercicio1 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Muestra de los 10 primeros números enteros:");
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(i+1);
		}
		System.out.println();
		
		System.out.println("Muestra de los 10 primeros números impares:");
		for (int i = 0; i < 10; i++) 
		{
			int n = (i * 2) + 1;
			System.out.println(n);
		}
		System.out.println();

	}

}
