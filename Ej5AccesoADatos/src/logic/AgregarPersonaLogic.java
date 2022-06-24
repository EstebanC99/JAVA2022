package logic;

import data.DataPersona;
import data.DataRol;
import entities.Persona;

public class AgregarPersonaLogic {
	
	private DataRol dr;
	private DataPersona dp;
	
	public AgregarPersonaLogic() {
		dp = new DataPersona();
		dr = new DataRol();
	}
	
	public void addPersona(Persona per) {
		dp.add(per);
		dr.saveRoles(per);
	}
}
