package logic;

import data.DataPersona;
import data.DataRol;
import entities.Persona;

public class EditarPersonaLogic {
	private DataPersona dp;
	private DataRol dr;
	
	public EditarPersonaLogic() {
		dp = new DataPersona();
		dr = new DataRol();
	}
	
	public void edit(Persona p) {
		dp.update(p);
		dr.saveRoles(p);
	}
	
}
