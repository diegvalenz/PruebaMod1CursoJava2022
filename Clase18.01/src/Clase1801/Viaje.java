package Clase1801;

public class Viaje {
	private String direccion_origen;
	private String direccion_destino;
	private String hora;
	private int tarifa;
	private int tiempo;
	private Conductor conductor;
	private Usuario usuario;
	private Aplicacion aplicacion;
	
	Viaje(Aplicacion aplicacion, Conductor conductor, Usuario usuario, String direccion_origen, String direccion_destino, String hora){
		this.aplicacion = aplicacion;
		this.direccion_origen = direccion_origen;
		this.direccion_destino = direccion_destino;
		this.hora = hora;
		this.conductor = conductor;
		this.usuario = usuario;
	}

	public String getDireccion_origen() {
		return direccion_origen;
	}

	public void setDireccion_origen(String direccion_origen) {
		this.direccion_origen = direccion_origen;
	}

	public String getDireccion_destino() {
		return direccion_destino;
	}

	public void setDireccion_destino(String direccion_destino) {
		this.direccion_destino = direccion_destino;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Aplicacion getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
		
}