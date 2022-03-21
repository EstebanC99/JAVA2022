package primerEjemplo;

import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		System.out.println("Primer ejemplo");
		
		int n1 = 2, n2 = 3;
		
		Scanner lector =  new Scanner(System.in);
		
		System.out.println("Ingrese un texto: ");
		String texto = lector.nextLine();
		System.out.println("Ingrese un numero: ");
		int n = Integer.parseInt(lector.nextLine());
		
		System.out.println("texto: " + texto);
		System.out.println("numero :" + n);
		
		if (n == n2 + n1) {
			System.out.println("Iguales");
		} else {
			System.out.println("Distintos");
		}
		
		lector.close();
	}
	
	

}
