package ui;

import java.util.LinkedList;
import java.util.Scanner;

import entities.Producto;
import logic.ProductoLogic;

public class MenuProducto {
	
	private Scanner scanner;
	private ProductoLogic logic = new ProductoLogic();

	public void mostrarMenu() {
		
		boolean salir = false;
		
		while (!salir) {
			 
			this.clearConsole();
			
			System.out.println("BIENVENIDO AL MENU DE MANEJO DE PRODUCTO");
			System.out.println("-----------------------------------------");
			
			System.out.println();
			
			System.out.println("(1) -> Ver todos los productos");
			System.out.println("(2) -> Buscar un producto por ID");
			System.out.println("(3) -> Agregar un nuevo producto");
			System.out.println("(4) -> Modificar un producto");
			System.out.println("(5) -> Eliminar un producto");
			System.out.println("(6) -> Desactivar un producto");
			System.out.println("(0) -> Salir");
			
			System.out.println("Elija una opcion del menú:");
			
			try {
				this.scanner = new Scanner(System.in);
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
				case 6:
					this.menuDesactivar();
					break;
				case 0:
					salir = true;
					this.scanner.close();
					break;
				default:
					break;
				}
			}
			catch (NumberFormatException ex) {
				System.out.println("Numero ingresado incorrecto");
			}
		}
	}
	
	private void clearConsole() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
	
	private void buscarProductos() {
		
		this.clearConsole();
		
		System.out.println("LISTADO DE PRODUCTOS");
		
		LinkedList<Producto> productos = this.logic.obtenerTodos();
		
		for (Producto producto : productos) {
			System.out.println(producto.toString());
			System.out.println();
		}
		
		System.out.println("ENTER para continuar");
		this.scanner.nextLine();
	}
	
	private void buscarProducto() {
		
		this.clearConsole();
		
		System.out.println("INGRESE EL ID DE PRODUCTO:");
		
		try {
			int productoID = Integer.parseInt(this.scanner.nextLine());
			
			Producto producto = this.logic.obtenerPorID(productoID);
			
			if (producto == null) {
				System.out.println("No se encontro ningun producto");
			}
			else {
				System.out.println(producto.toString());
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
		
		this.clearConsole();
		
		System.out.println("NUEVO PRODUCTO");
		System.out.println("---------");
		System.out.println();
		
		Producto nuevoProducto = new Producto();
		
		System.out.print("Ingrese Nombre:");
		nuevoProducto.setNombre(this.scanner.nextLine());
		
		System.out.print("Ingrese Descripcion:");
		nuevoProducto.setDescripcion(this.scanner.nextLine());
		
		System.out.print("Ingrese Precio:");
		nuevoProducto.setPrecio(Double.parseDouble(this.scanner.nextLine()));
		
		System.out.print("Ingrese Stock:");
		nuevoProducto.setStock(Integer.parseInt(this.scanner.nextLine()));
		
		System.out.print("¿Envio incluido? (true o )");
		nuevoProducto.setEnvioIncluido(Boolean.parseBoolean(this.scanner.nextLine()));
		
		this.logic.agregar(nuevoProducto);
		
		System.out.println("Nuevo producto agregado:");
		System.out.println(nuevoProducto.toString());
		
		System.out.println("ENTER para continuar");
	}
	
	private void menuModificar() {
		
		this.clearConsole();
		
		for (Producto prod : this.logic.obtenerTodos()) {
			
			System.out.println(prod.toString());
		}
		
		System.out.println();
		System.out.println("INGRESE ID DE PRODUCTO A MODIFICAR:");
		Producto producto = this.logic.obtenerPorID(Integer.parseInt(this.scanner.nextLine()));
		
		this.clearConsole();
		
		System.out.println(producto.toString());
		System.out.println();
		
		System.out.print("Nuevo nombre:");
		producto.setNombre(this.scanner.nextLine());
		
		System.out.print("Nueva descripcion:");
		producto.setDescripcion(this.scanner.nextLine());
		
		System.out.print("Nuevo precio:");
		producto.setPrecio(Double.parseDouble(this.scanner.nextLine()));
		
		System.out.print("Nuevo stock:");
		producto.setStock(Integer.parseInt(this.scanner.nextLine()));
		
		System.out.print("¿Envio incluido? (true o false):");
		producto.setEnvioIncluido(Boolean.parseBoolean(this.scanner.nextLine()));
		
		this.logic.modificar(producto);
		
		System.out.println(producto.toString());
		System.out.println();
		System.out.print("ENTER para continuar....");
		this.scanner.nextLine();
	}
	
	private void menuBaja() {
		
		this.clearConsole();
		
		for (Producto prod : this.logic.obtenerTodos()) {
			
			System.out.println(prod.toString());
		}
		
		System.out.println();
		System.out.println("INGRESE ID DE PRODUCTO A ELIMINAR:");
		Producto producto = this.logic.obtenerPorID(Integer.parseInt(this.scanner.nextLine()));
		
		this.clearConsole();
		
		System.out.println(producto.toString());
		System.out.println();
		
		System.out.println("¿Seguro de eliminar? (true o false)");
		Boolean respuesta = Boolean.parseBoolean(this.scanner.nextLine());
		
		if (respuesta) {
			this.logic.eliminar(producto.getID());
		}
		else
		{
			System.out.println("Eliminacion cancelada");
		}
		
		for (Producto prod : this.logic.obtenerTodos()) {
			
			System.out.println(prod.toString());
		}
		
		System.out.print("ENTER para continuar....");
		this.scanner.nextLine();
	}

	private void menuDesactivar() {
		
this.clearConsole();
		
		for (Producto prod : this.logic.obtenerTodos()) {
			
			System.out.println(prod.toString());
		}
		
		System.out.println();
		System.out.println("INGRESE ID DE PRODUCTO A ELIMINAR:");
		Producto producto = this.logic.obtenerPorID(Integer.parseInt(this.scanner.nextLine()));
		
		this.clearConsole();
		
		System.out.println(producto.toString());
		System.out.println();
		
		System.out.println("¿Seguro de eliminar? (true o false)");
		Boolean respuesta = Boolean.parseBoolean(this.scanner.nextLine());
		
		if (respuesta) {
			this.logic.desactivar(producto);
		}
		else
		{
			System.out.println("Desactivacion cancelada");
		}
		
		System.out.println(producto.toString());
		System.out.println();
		System.out.print("ENTER para continuar....");
		this.scanner.nextLine();
	}
}
