package cl.aacp9.prueba_unitarias.service;

import java.util.HashMap;
import java.util.Map;

import cl.aacp9.prueba_unitarias.model.Persona;

public class ServicioPersona {

	private Map<String, String> mapPersonas = new HashMap<String, String>();

	public String crearPersona(Persona persona) {
		//validacion de no nula
		if (persona != null) {
			mapPersonas.put(persona.getRut(), persona.getNombre());
			return "Creada";
		}else {
			return "No creada";
		}
	}
	
	//método actualizar persona
	public String actualizarPersona(Persona persona) {
		if (persona != null) {
			mapPersonas.put(persona.getRut(), persona.getNombre());
			return "Actualizada";
		}else {
			return "No Actualizada";
		}
	}
	
	//método eliminarPersona
	public String eliminarPersona(Persona persona) {
		if (persona != null) {
			
			mapPersonas.remove(persona);
			return "Eliminada";
		}else {
			return "No eliminada";
		}
	}
	
	//método listarPersona
	public Map<String, String> listarPersona() {
		return mapPersonas;		
	}
}
