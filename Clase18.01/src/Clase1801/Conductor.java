package Clase1801;

public class Conductor extends Persona {
	private int licenciaconducir;
	Vehiculo vehiculo;
	
	Conductor(int rut, String nombre, int licenciaconducir, Vehiculo vehiculo) {
		super(rut, nombre);
		this.licenciaconducir = licenciaconducir;
		this.vehiculo = vehiculo;
		// TODO Auto-generated constructor stub
	}

	public int getLicenciaconducir() {
		return licenciaconducir;
	}

	public void setLicenciaconducir(int licenciaconducir) {
		this.licenciaconducir = licenciaconducir;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
}
