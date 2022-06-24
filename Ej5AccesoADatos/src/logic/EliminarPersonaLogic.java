package logic;

import data.DataPersona;
import entities.Persona;

public class EliminarPersonaLogic {
	private DataPersona dp;
	
	public EliminarPersonaLogic() {
		dp = new DataPersona();
	}
	
	public void delete(Persona p) {
		dp.delete(p);
	}
	
}
