package logic;

import java.util.LinkedList;

import data.DataRol;
import entities.Rol;

public class RolLogic {
	
	private DataRol dr;
	
	public RolLogic() {
		dr = new DataRol();
	}
	
	public LinkedList<Rol> getAll(){
		return dr.getAll();
	}
	
	public Rol getByID(Rol rol) {
		return dr.getById(rol);
	}

}
