package logic;

import java.util.LinkedList;
import data.ProductoData;
import entities.Producto;

public class ProductoLogic {
	
	private ProductoData data;
	
	public ProductoLogic() {
		
		this.data = new ProductoData();
	}
	
	public LinkedList<Producto> obtenerTodos(){
		
		return this.data.getAll();
	}
	
	public Producto obtenerPorID(int id) {
		
		if (id <= 0) {
			return null;
		}
		
		return this.data.getByID(id);
	}
	
	public void agregar(Producto nuevoProducto) {
		
		String validaciones = this.validarProducto(nuevoProducto);
		
		if (!validaciones.isEmpty()){
			System.out.print(validaciones);
		} else {
			this.data.add(nuevoProducto);
		}
	}
	
	
	public void modificar(Producto productoModificado) {
		
		String validaciones = this.validarProducto(productoModificado);
		
		if (!validaciones.isEmpty()) {
			System.out.print(validaciones);
		} else {
			this.data.modify(productoModificado);
		}
	}
	
	
	public void eliminar(int id) {
		
		if (id <= 0) {
			System.out.print("ID Invalido");
		}
		
		this.data.remove(id);
	}
	
	private String validarProducto(Producto nuevoProducto) {
		
		String validaciones = new String();
		
		return validaciones;
	}
}
