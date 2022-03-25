package ui;

import java.util.Scanner;

import entidades.*;

public class Menu 
{

	public static void main(String[] args) 
	{
		Scanner lector = new Scanner(System.in);
		
		System.out.println("¿Resulve con Colecciones(C) o Arrays(A)?");
		
		String Colecciones = "C";
		String Arrays = "A";
		
		if (lector.nextLine().equalsIgnoreCase(Colecciones))
		{
			ResolverConColecciones(lector);
		} 
		else if (lector.nextLine().equalsIgnoreCase(Arrays)) 
		{	
			ResolverConArrays(lector);
		}
		else
		{
			System.out.println("CARACTER INVALIDO!");
		}
		
		lector.close();
	}
	
	private static void ResolverConColecciones(Scanner lector)
	{
		
	}
	
	private static void ResolverConArrays(Scanner lector)
	{
		Empleado[] empleados = new Empleado[2];
		
		String Administrativo = "A";
		String Vendedor = "V";
		
		System.out.println("BIENVENIDO A LA CARGA DE EMPLEADOS");
		
		System.out.println();System.out.println();
		
		System.out.println("Ingreso de datos: ");
		
		for (int i = 0; i < empleados.length; i++) 
		{
			System.out.println();System.out.println();
			
			System.out.println("EMPLEADO NUMERO " + (i + 1));
			
			System.out.println();System.out.println();
			
			System.out.println("Ingrese el DNI:");
			String dni = lector.nextLine();
			
			System.out.println("Ingrese el nombre:");
			String nombre = lector.nextLine();
			
			System.out.println("Ingrese el apellido:");
			String apellido = lector.nextLine();
			
			System.out.println("Ingrese el email:");
			String email = lector.nextLine();
			
			System.out.println("Ingrese el sueldo base:");
			Double sueldoBase = Double.parseDouble(lector.nextLine());
			
			System.out.println("Introduzca el tipo de empleado (A: Administrativo, V: Vendedor): ");
			String tipoDeIngreso = lector.nextLine();
			
			Empleado nuevoEmpleado;
			
			if (tipoDeIngreso.equalsIgnoreCase(Administrativo))
			{
				System.out.println("Ingrese la cantidad de Hs Extra:");
				var hsExtra = Integer.parseInt(lector.nextLine());
				
				System.out.println("Ingrese la cantida dde Hs en el Mes:");
				var hsMes = Integer.parseInt(lector.nextLine());
				
				nuevoEmpleado = new Administrativo(dni, nombre, apellido, email, sueldoBase, hsExtra, hsMes);
				
			} else if (tipoDeIngreso.equalsIgnoreCase(Vendedor)){
				
				System.out.println("Ingrese el porcentaje de comision:");
				var porcComision = Double.parseDouble(lector.nextLine());
				
				System.out.println("Ingrese el total de ventas:");
				var totalVentas = Double.parseDouble(lector.nextLine());
				
				nuevoEmpleado = new Vendedor(dni, nombre, apellido, email, sueldoBase, porcComision, totalVentas);
			} else {
				
				System.out.println("CARACTER INVALIDO!");
				i--;
				
				continue;
			}
			
			empleados[i] = nuevoEmpleado;
		}
		
		System.out.println();System.out.println();
		
		System.out.println("LISTADO DE EMPLEADOS");

		for (int i = 0; i < empleados.length; i++) 
		{
			System.out.println(empleados[i].GetEmpleado());
		}
	}
}
