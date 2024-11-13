package cl.aacp9.prueba_unitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.aacp9.prueba_unitarias.model.Persona;
import cl.aacp9.prueba_unitarias.service.ServicioPersona;

public class ServicioPersonaTest {

	ServicioPersona servicioPersona = new ServicioPersona();
	private static Logger miLogger = Logger.getLogger("cl.aacp9.pruebas_unitarias");
	
	@BeforeAll //antes de todo
	static void setup() { //método debe ser static
		miLogger.info("Iniciando pruebas unitrarias \n");
	}
	
	@BeforeEach //ejecuta antes de cada método
	void init() {
		miLogger.info("iniciando test de prueba");
	}
	
	@AfterEach //ejecuta después de cada test
	void tearDown() {
		miLogger.info("Terminando método de prueba\n");
	}
	
	@AfterAll //ejecuta después de todo
	static void done() {//método debe ser static
		miLogger.info("fin de la clase servicioPersonaTest");
	}
	
	@Test
    @DisplayName("Test crear persona con @DisplayName")
	public void crearPersona() {
    	miLogger.info("iniciando test unitario crearPersona");
    	Persona persona = new Persona("999-9", "Pepa");
    	String respuesta = servicioPersona.crearPersona(persona);
    	//acá va la magia del test unitario
    	assertEquals("Creada", respuesta);
    }

	@Test
	@DisplayName("Test actualizarPersona()")
	public void actualizarPersona() {
		miLogger.info("Iniciando test unitario actualizarPersona");
    	Persona persona = new Persona("999-9", "Pepa");
    	String respuesta = servicioPersona.actualizarPersona(persona);
    	//acá va la magia del test unitario
    	assertEquals("Actualizada", respuesta);
	}
	
	@Test
	@DisplayName("Test eliminarPersona()")
	public void eliminarPersona() {
		miLogger.info("Iniciando test unitario elimanarPersona");
    	Persona persona = new Persona("999-9", "Pepa");
    	String respuesta = servicioPersona.eliminarPersona(persona);
    	//acá va la magia del test unitario
    	assertEquals("Eliminada", respuesta);
	}
	
	@Test
	@DisplayName("Test listarPersona()")
	public void listarPersona() {
		miLogger.info("Iniciando test unitario listarPersona");
		Map<String, String> respuesta = servicioPersona.listarPersona();
    	//acá va la magia del test unitario
    	assertNotNull(respuesta);
	}

}
