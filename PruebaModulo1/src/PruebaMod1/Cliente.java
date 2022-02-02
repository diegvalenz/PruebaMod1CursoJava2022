package PruebaMod1;

public class Cliente {
	private int rut;
	private String razonsocial;
	private String direccioncliente;
	private int distanciakm;
	
	//Se crea el constructor
	public Cliente(int rut, String razonsocial, String direccioncliente, int distanciakm) {
		this.rut = rut;
		this.razonsocial = razonsocial;
		this.direccioncliente = direccioncliente;
		this.distanciakm = distanciakm;
	}
	
	//Se crean los get & set
	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccioncliente() {
		return direccioncliente;
	}

	public void setDireccioncliente(String direccioncliente) {
		this.direccioncliente = direccioncliente;
	}

	public int getDistanciakm() {
		return distanciakm;
	}

	public void setDistanciakm(int distanciakm) {
		this.distanciakm = distanciakm;
	}			
}
