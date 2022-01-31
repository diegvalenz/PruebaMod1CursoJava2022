package fuentes2;

public class Estudiante {
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private int edad;
	private Ciudad ciudad;
	
	// Constructor
	Estudiante(String nombre, String apellido_paterno) {
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
	}
	
	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	Estudiante(String nombre, String apellido_paterno, String apellido_materno) {
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
	}
	
	Estudiante(String nombre, String apellido_paterno, String apellido_materno, Ciudad ciudad){
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.ciudad = ciudad;
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