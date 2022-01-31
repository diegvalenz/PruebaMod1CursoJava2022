package Clase1801;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Crear aplicacion");
		Aplicacion aplicacion = new Aplicacion("UBER", 3);
		System.out.println("La aplicacion en uso es " + aplicacion.getNombre() + " versión " + Integer.toString(aplicacion.getVersion()));
		System.out.println("-------------");
		
		System.out.println("Crear usuario");
		Usuario usuario = new Usuario(205916903, "Diego", 965189039, "Santaigo");
		System.out.println("Se creó el usuario " + usuario.getNombre());
		System.out.println("-------------");
		
		System.out.println("Crear conductor");
		Conductor conductor = new Conductor(103242169, "Cristian", 7305, new Vehiculo("Toyota", "RAV4", "Gris", 2010, "BTBT59"));
		
		Viaje viaje = new Viaje(aplicacion, conductor, usuario, "Amalia Armstrong 7305", "Lago Collico 3350", "20:06");
		System.out.println("Se creó el viaje desde " + viaje.getDireccion_origen() + " hasta " + viaje.getDireccion_destino());
		System.out.println("El conductor es " + viaje.getConductor().getNombre() + " y el usuario es " + viaje.getUsuario().getNombre());
		System.out.println("------------");
		
		viaje.setTiempo(43);
		viaje.setTarifa(7000);
		System.out.println("El viaje terminó");
		System.out.println("Dada la duración de " + Integer.toString(viaje.getTiempo()) + " minutos, su tarifa es de: $" + Integer.toString(viaje.getTarifa()));
	}

}
