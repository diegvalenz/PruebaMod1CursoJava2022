package fuentes2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ciudad ciudad = new Ciudad("Santiago");
		
		Estudiante estudiante = new Estudiante("Víctor", "Contreras", "López", ciudad);
		Estudiante estudiante2 = new Estudiante("Elaine", "Medeiros");
		Estudiante estudiante3 = new Estudiante("Jocelin", "Contreras");
		
		/*estudiante.setEdad(25);
		estudiante2.setEdad(27);
		estudiante3.setEdad(28);
		*/
		System.out.println(estudiante.getNombreCompleto() + ", " + estudiante2.getNombreCompleto() + " y " + estudiante3.getNombreCompleto());
		System.out.println(estudiante.getCiudad().getNombre());
	}

}
