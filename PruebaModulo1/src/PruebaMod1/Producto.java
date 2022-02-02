package PruebaMod1;

public class Producto {
	private int sku;
	private String nombre;
	private int cantidad;
	private int	coste;
	private int precio;
	
	// Se crea la variable booleana de escontable ya que hay productos que se venden como contable (unidades) o como no contables (peso en kilogramos)
	public boolean escontable;

	//Se crea el constructor
	public Producto(int sku, String nombre, int cantidad, int coste, int precio, boolean escontable) {
		this.sku = sku;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.coste = coste;
		this.precio = precio;
		this.escontable = escontable;
	}

	//Se crean los get & set
	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isEscontable() {
		return escontable;
	}

	public void setEscontable(boolean escontable) {
		this.escontable = escontable;
	}
			
}
