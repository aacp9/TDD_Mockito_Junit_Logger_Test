package cl.aacp9.prueba_unitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.aacp9.prueba_unitarias.model.Persona;
import cl.aacp9.prueba_unitarias.repository.RepositorioPersona;

//acá probamos los métodos EMULADOS para mockito
public class RepositorioPersonaTest {
	//acá mock toma control para emular la clase RepositorioPersona
	private static RepositorioPersona repositorioPersona = mock(RepositorioPersona.class);
	private static Logger myLogger = Logger.getLogger("cl.aacp9.pruebas_unitarias");
	
	@BeforeAll
	static void setUp() {
		myLogger.info("iniciamos clase RepositorioPersonaTest\n");
	}
	
	@BeforeEach //ejecuta antes de cada método
	void init() {
		myLogger.info("Iniciando test de prueba con Mockito");
	}
	
	@AfterEach //ejecuta después de cada test
	void tearDown() {
		myLogger.info("Terminando método de prueba con mockito\n");
	}
	
	@Test
	@DisplayName("Test crearPersona()")
	public void crearPersona() {
		myLogger.info("Ejecutando test crearPersona");
		Persona persona = new Persona("1-9","Pepa");
		//acá utilizamos Mockito, aca se emula el método de crearPersona
		//el cuál definimos de manera arbitraria la respuesta "OK"
		when(repositorioPersona.crearPersona(persona)).thenReturn("OK");
		String respuesta = repositorioPersona.crearPersona(persona);
		assertEquals("OK", respuesta);
		//verifica que se haya ejecutado el método emulado línea despues del when..
		verify(repositorioPersona).crearPersona(persona);
	}
	
	@Test
	@DisplayName("Test actualizarPersona()")
	public void actualizarPersona() {
		myLogger.info("Ejecutando test actualizarPersona");
		Persona persona = new Persona("1-9","Pepa");
		//acá utilizamos Mockito, aca se emula el método de actualizarPersona
		//el cuál definimos de manera arbitraria la respuesta "OK"
		when(repositorioPersona.actualizarPersona(persona)).thenReturn("OK");
		String respuesta = repositorioPersona.actualizarPersona(persona);
		assertEquals("OK", respuesta);
		//verifica que se haya ejecutado el método emulado línea despues del when..
		verify(repositorioPersona).actualizarPersona(persona);
	}
	
	@Test
	@DisplayName("Test eliminarPersona")
	public void eliminarPersona() {
		myLogger.info("Ejecutando test eliminarPersona");
		Persona persona = new Persona("1-9","Pepa");
		//acá utilizamos Mockito, aca se emula el método de eliminarPersona()
		//el cuál definimos de manera arbitraria la respuesta "OK"
		when(repositorioPersona.eliminarPersona(persona)).thenReturn("OK");
		String respuesta = repositorioPersona.eliminarPersona(persona);
		assertEquals("OK", respuesta);
		//verifica que se haya ejecutado el método emulado línea despues del when..
		verify(repositorioPersona).eliminarPersona(persona);
		
	}

	@Test
	@DisplayName("Test listarPersona")
	public void listarPersona() {
		myLogger.info("Ejecutando test listarPersona");
		Map<String, String> mapPersonas = new HashMap<String, String>();
		//acá utilizamos Mockito, aca se emula el método de eliminarPersona()
		//el cuál definimos de manera arbitraria la respuesta "OK"
		when(repositorioPersona.listarPersona()).thenReturn(mapPersonas);
		Map<String, String> respuesta = repositorioPersona.listarPersona();
		assertNotNull(respuesta);
		//verifica que se haya ejecutado el método emulado línea despues del when..
		verify(repositorioPersona).listarPersona();
		
	}

	
}
