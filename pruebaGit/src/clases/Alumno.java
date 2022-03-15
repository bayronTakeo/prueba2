package clases;

public class Alumno {

	private String nombre;
	private String apellido;
	private String id;
	private String email;
	
	//Getters y setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
	//Constructor
	public Alumno(String nombre, String apellido, String id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}
	public Alumno() {
		super();
	}
	
	
}
