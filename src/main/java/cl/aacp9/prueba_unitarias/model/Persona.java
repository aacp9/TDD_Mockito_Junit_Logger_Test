package cl.aacp9.prueba_unitarias.model;

public class Persona {
	private String rut;
	private String nombre;
	
	

	//método constructor
	public Persona(String rut, String nombre) {
		super();
		this.rut = rut;
		this.nombre = nombre;
	}
	//getter y setter
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
