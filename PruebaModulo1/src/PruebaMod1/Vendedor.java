package PruebaMod1;

public class Vendedor {
	private int rut;
	private String nombre;
	private int idtrabajador;
	
	//Se crea el constructor
	public Vendedor(int rut, String nombre, int idtrabajador) {
		this.rut = rut;
		this.nombre = nombre;
		this.idtrabajador = idtrabajador;
	}

	//Se crean los get & set
	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdtrabajador() {
		return idtrabajador;
	}

	public void setIdtrabajador(int idtrabajador) {
		this.idtrabajador = idtrabajador;
	}
		
}
