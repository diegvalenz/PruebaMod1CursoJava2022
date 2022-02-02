package PruebaMod1;

public class Local {
	private String nombrelocal;
	private int numerolocal;
	
	//Se crea el constructor
	public Local(String nombrelocal, int numerolocal) {
		this.nombrelocal = nombrelocal;
		this.numerolocal = numerolocal;
	}

	//Se crean los get & set
	public String getNombrelocal() {
		return nombrelocal;
	}

	public void setNombrelocal(String nombrelocal) {
		this.nombrelocal = nombrelocal;
	}

	public int getNumerolocal() {
		return numerolocal;
	}

	public void setNumerolocal(int numerolocal) {
		this.numerolocal = numerolocal;
	}
		
}
