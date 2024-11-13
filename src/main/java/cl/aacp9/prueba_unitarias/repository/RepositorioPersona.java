package cl.aacp9.prueba_unitarias.repository;

import java.util.HashMap;
import java.util.Map;

import cl.aacp9.prueba_unitarias.model.Persona;

public class RepositorioPersona {
	private Map<String, String> mapPersonas = new HashMap<String, String>();

	//métodos emulados para uso de mockito 
	public String crearPersona(Persona persona) {
		mapPersonas.put(persona.getRut(), persona.getNombre());
		return "OK";
	}
	
	public String actualizarPersona(Persona persona) {
		mapPersonas.put(persona.getRut(), persona.getNombre());
		return "OK";
	}
	
	public String eliminarPersona(Persona persona) {
		mapPersonas.remove(persona.getRut(),persona.getNombre());
		return "OK";
	}

	public Map<String, String> listarPersona() {
		return mapPersonas;		
	}

		
}
