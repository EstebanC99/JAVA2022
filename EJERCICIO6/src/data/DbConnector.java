package data;

import java.sql.*;

public class DbConnector {
	
	private static DbConnector instancia;
	
	private String driver="com.mysql.cj.jdbc.Driver";
	private String host="localhost";
	private String port="3306";
	private String user="java";
	private String password="user1";
	private String db="javamarket";
	private int conectados=0;
	private Connection connection=null;
	
	private DbConnector() {
		
		try {
			Class.forName(driver);
		}
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	public static DbConnector getInstancia(){
		
		if (instancia == null) {
			instancia = new DbConnector();
		}
		return instancia;
	}
	
	public Connection getConnection() {
		
		try {
			if (this.connection == null || this.connection.isClosed()) {
				this.connection = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.db, this.user, this.password);
				this.conectados = 0;
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		this.conectados ++;
		
		return this.connection;
	}
	
	public void realeaseConnection() {
		
		this.conectados--;
		
		try {
			if (this.conectados <= 0) {
				this.connection.close();
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
}
