package fuentes;

public class Estudiante {
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private int edad;
	
	// Constructor
	Estudiante() {
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellidoPaterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
		
	public String getApellidoPaterno() {
		return this.apellido_paterno;
	}
	
	public void setApellidoMaterno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
		
	public String getApellidoMaterno() {
		return this.apellido_materno;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return this.edad;
	}
	
	/*public String getNombreCompleto() {
		return (this.nombre + " " + this.apellido_paterno + " " + this.apellido_materno);
	}*/
	
	public String getNombreCompleto() {
		String apellido_materno = "";
		if (this.apellido_materno != null) {
			apellido_materno = this.apellido_materno;
		}
		
		return (this.nombre + " " + this.apellido_paterno + " " + apellido_materno);
	}
	
}