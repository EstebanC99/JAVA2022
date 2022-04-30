package data;

import java.sql.*;
import java.util.LinkedList;
import entities.Producto;



public class ProductoData extends EntityData<Producto> {
	
	public ProductoData() {
		
		this.tableName = "t_Producto";
	}
	
	public LinkedList<Producto> getAll() {
		
		LinkedList<Producto> productos = new LinkedList<Producto>();
		
		try {
			this.rs = this.getStmt("SELECT ID_Producto, Nombre, Descripcion, Precio, Stock, EnvioIncluido FROM " + this.tableName).executeQuery();
			
			if (this.rs != null) {
				while (rs.next()) {
					this.entity = new Producto();
					this.entity.setID(rs.getInt("ID_Producto"));
					this.entity.setNombre(rs.getString("Nombre"));
					this.entity.setDescripcion(rs.getString("Descripcion"));
					this.entity.setPrecio(rs.getDouble("Precio"));
					this.entity.setStock(rs.getInt("Stock"));
					this.entity.setEnvioIncluido(rs.getBoolean("EnvioIncluido"));
					
					productos.add(this.entity);
				}
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			this.closeConnection();
		}
		
		return productos;
	}
	
	public Producto getByID(int id) {
		
		try {
			this.getStmt("SELECT ID_Producto, Nombre, Descripcion, Precio, Stock, EnvioIncluido FROM " + this.tableName + " WHERE ID_Producto =?")
				.setInt(1, id);
			this.rs = this.stmt.executeQuery();
			
			if (this.rs != null && this.rs.next()) {
				this.entity = new Producto();
				this.entity.setID(rs.getInt("ID_Producto"));
				this.entity.setNombre(rs.getString("Nombre"));
				this.entity.setDescripcion(rs.getString("Descripcion"));
				this.entity.setPrecio(rs.getDouble("Precio"));
				this.entity.setStock(rs.getInt("Stock"));
				this.entity.setEnvioIncluido(rs.getBoolean("EnvioIncluido"));
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			this.closeConnection();
		}
		
		return this.entity;
	}
	
	public void add(Producto nuevoProducto) {
		
		try {
			this.getStmt("INSERT INTO " + this.tableName + "(Nombre, Descripcion, Precio, Stock, EnvioIncluido) VALUES (?, ?, ?, ?, ?)");
			
			this.stmt.setString(1, nuevoProducto.getNombre());
			this.stmt.setString(2, nuevoProducto.getDescripcion());
			this.stmt.setDouble(3, nuevoProducto.getPrecio());
			this.stmt.setInt(4, nuevoProducto.getStock());
			this.stmt.setBoolean(5, nuevoProducto.getEnvioIncluido());
			
			this.stmt.executeUpdate();
			
			this.rs = this.stmt.getGeneratedKeys();
			
			if (this.rs != null && this.rs.next()) {
				this.entity = nuevoProducto;
				this.entity.setID(this.rs.getInt(1));
			}
		}
		catch (SQLException ex){
			ex.printStackTrace();
		}
		finally {
			this.closeConnection();
		}
	}
	
	public void modify(Producto productoModificado) {
		
		try {
			this.getStmt("UPDATE " + this.tableName + " SET Nombre =?, Descripcion =?, Precio =?, Stock =?, EnvioIncluido =? WHERE ID_Producto =?");
			this.stmt.setString(1, productoModificado.getNombre());
			this.stmt.setString(2, productoModificado.getDescripcion());
			this.stmt.setDouble(3, productoModificado.getPrecio());
			this.stmt.setInt(4, productoModificado.getStock());
			this.stmt.setBoolean(5, productoModificado.getEnvioIncluido());
			this.stmt.setInt(6, productoModificado.getID());
			
			this.stmt.executeUpdate();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			this.closeConnection();
		}
	}
	
	public void remove(int id) {
		
		try {
			this.getStmt("DELETE FROM " + this.tableName + " WHERE ID_Producto =?");
			this.stmt.setInt(1, id);
			this.stmt.executeUpdate();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			this.closeConnection();
		}
	}
	
}
