package PruebaMod1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Se establecen las instancias iniciales
		Vendedor vendedor = new Vendedor(205916903, "Diego Valenzuela", 2532);
		Local local = new Local("Verduras Java", 7305);
		Cliente cliente = new Cliente(799428008, "Instituto de Capacitación Profesional", "Domeyko 1762", 12);
		Repartidor repartidor = new Repartidor(12525823, "Óscar Undurraga", 3312, 400);
		
		//Venta
			//Se crea la instancia Venta
		Venta venta = new Venta(404, cliente, vendedor, repartidor, new ArrayList<Producto>(), local, "En camino");
		
			//Se agregan los productos correspondientes a la compra
		Producto producto1 = new Producto(3358760, "Zapallo", 2, 550, 990, false);
		Producto producto2 = new Producto(3358759, "Zahahoria", 3, 430, 590, false);
		Producto producto3 = new Producto(3358772, "Lechuga", 1, 570, 890, true);
		Producto producto4 = new Producto(3358761, "Choclo", 12, 300, 490, true);
		
		venta.getProducto().add(producto1);
		venta.getProducto().add(producto2);
		venta.getProducto().add(producto3);
		venta.getProducto().add(producto4);
		
			//Se prepara el costo total de los productos con la variable costoagregado
		int costoagregado = 0;
		for (int i = 0; i< venta.getProducto().size(); i++) {
			costoagregado = costoagregado + venta.getProducto().get(i).getPrecio()*venta.getProducto().get(i).getCantidad();
		}
				
			//Se imprime el respectivo resumen
		System.out.println("Venta número " + venta.getNumpedido() + " ordenada por " + venta.getCliente().getRazonsocial() + " en el local '" + venta.getLocal().getNombrelocal() +"' a manos del vendedor " + venta.getVendedor().getNombre() + " y el repartidor " + venta.getRepartidor().getNombre());
		System.out.println("-----------------------");
		System.out.println("Los productos correspondientes son: ");
				//Mediante la el siguiente método se repasa la lista y se verifica si es que los productos corresponden a unidades o a kilogramos
		for (int i = 0; i< venta.getProducto().size(); i++) {
			System.out.print(venta.getProducto().get(i).getCantidad() +" "); 
			if(venta.getProducto().get(i).escontable == true) {
				System.out.print("unidades");
			}else {
				System.out.print("kilogramos");
			}
			System.out.println(" de "+  venta.getProducto().get(i).getNombre() + " a un precio total de $" + venta.getProducto().get(i).getPrecio()*venta.getProducto().get(i).getCantidad());
		}
		System.out.println("Costo de envío correspondiente a $" + venta.getCliente().getDistanciakm()*venta.getRepartidor().getCostorepartidorkm());
		System.out.println("-----------------------");
		System.out.println("Su costo final incluyendo envío es de $" + (costoagregado + venta.getCliente().getDistanciakm()*venta.getRepartidor().getCostorepartidorkm()));
	
}
	}
