package PruebaMod1;

import java.util.ArrayList;

public class Venta {
	private int numpedido;
	private Cliente cliente;
	private Vendedor vendedor;
	private Repartidor repartidor;
	private ArrayList<Producto> producto;
	private Local local;
	private String estadoentrega;
	
	//Se crea el constructor
	public Venta(int numpedido, Cliente cliente, Vendedor vendedor, Repartidor repartidor, ArrayList<Producto> producto, Local local, String estadoentrega) {
		this.numpedido = numpedido;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.repartidor = repartidor;
		this.producto = producto;
		this.local = local;
		this.estadoentrega = estadoentrega;
	}

	//Se crean los get & set
	public int getNumpedido() {
		return numpedido;
	}

	public void setNumpedido(int numpedido) {
		this.numpedido = numpedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}

	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}
	
	public ArrayList<Producto> getProducto() {
		return producto;
	}

	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public String getEstadoentrega() {
		return estadoentrega;
	}

	public void setEstadoentrega(String estadoentrega) {
		this.estadoentrega = estadoentrega;
	}
	
}
