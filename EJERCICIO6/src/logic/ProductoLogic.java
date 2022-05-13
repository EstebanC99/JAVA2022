package logic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
			try {
				this.data.add(nuevoProducto);
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
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
	
	public void desactivar(Producto productoDesactivado) {
		
		productoDesactivado.setDisabledOn(LocalDateTime.now());
		productoDesactivado.setDisabledDate(LocalDate.now());
		productoDesactivado.setDisabledTime(LocalTime.of(productoDesactivado.getDisabledOn().getHour(), productoDesactivado.getDisabledOn().getMinute(), productoDesactivado.getDisabledOn().getSecond()));
		
		this.data.desactivarProducto(productoDesactivado);
	}
	
	private String validarProducto(Producto nuevoProducto) {
		
		String validaciones = new String();
		
		return validaciones;
	}
}
