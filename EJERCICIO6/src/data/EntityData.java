package data;

import java.sql.*;

public class EntityData<TEntity> {
	
	TEntity obj;
	
	protected TEntity entity;
	
	protected String tableName;
	
	protected PreparedStatement stmt = null;
	protected ResultSet rs = null;
	
	
	protected PreparedStatement getStmt(String query) {

		try {
			if (query.contains("INSERT")) {
				this.stmt = DbConnector.getInstancia().getConnection().prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
			} else {
				this.stmt = DbConnector.getInstancia().getConnection().prepareStatement(query);
			}
			
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return this.stmt;
	}
	
	protected void closeConnection() {
		
		try {
			if (this.rs != null) {this.rs.close();}
			if (this.stmt != null) {this.stmt.close();}
			DbConnector.getInstancia().realeaseConnection();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
