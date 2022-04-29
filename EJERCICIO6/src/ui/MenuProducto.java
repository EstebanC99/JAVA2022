package ui;

import java.util.LinkedList;
import java.util.Scanner;

import entities.Producto;
import logic.ProductoLogic;

public class MenuProducto {
	
	private Scanner scanner;

	public void mostrarMenu() {
		
		this.scanner = new Scanner(System.in); 
		
		this.clearConsole();
		
		System.out.println("BIENVENIDO AL MENU DE MANEJO DE PRODUCTO");
		System.out.println("-----------------------------------------");
		
		System.out.println();
		
		System.out.println("(1) -> Ver todos los productos");
		System.out.println("(2) -> Buscar un producto por ID");
		System.out.println("(3) -> Agregar un nuevo producto");
		System.out.println("(4) -> Modificar un producto");
		System.out.println("(5) -> Eliminar un producto");
		
		System.out.println("Elija una opcion del menú:");
		
		try {
			int opcion = Integer.parseInt(this.scanner.nextLine());
			
			switch (opcion) {
			case 1:
				this.buscarProductos();
				break;
			case 2:
				this.buscarProducto();
				break;
			case 3:
				this.menuAlta();
				break;
			case 4:
				this.menuModificar();
				break;
			case 5:
				this.menuBaja();
				break;
			default:
				break;
			}
		}
		catch (NumberFormatException ex) {
			System.out.println("Numero ingresado incorrecto");
		}
		
	}
	
	private void clearConsole() {
		try {
			ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
	        Process startProcess = pb.inheritIO().start();
	        startProcess.waitFor();	
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private void buscarProductos() {
		
		this.clearConsole();
		
		System.out.println("LISTADO DE PRODUCTOS");
		
		ProductoLogic logic = new ProductoLogic();
		
		LinkedList<Producto> productos = logic.obtenerTodos();
		
		for (Producto producto : productos) {
			producto.toString();
			System.out.println();
		}
		
		System.out.println("ENTER para continuar");
		this.scanner.nextLine();
	}
	
	private void buscarProducto() {
		
		this.clearConsole();
		
		System.out.println("INGRESE EL ID DE PRODUCTO:");
		
		ProductoLogic logic = new ProductoLogic();
		
		try {
			int productoID = Integer.parseInt(this.scanner.nextLine());
			
			Producto producto = logic.obtenerPorID(productoID);
			
			if (producto == null) {
				System.out.println("No se encontro ningun producto");
			}
			else {
				producto.toString();
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println();
			System.out.println("ENTER para continuar");
			this.scanner.nextLine();
		}
	}
	
	private void menuAlta() {
		
	}
	
	private void menuModificar() {
		
	}
	
	private void menuBaja() {
		
	}
}
