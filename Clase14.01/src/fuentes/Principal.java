package fuentes;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante estudiante = new Estudiante();
		Estudiante estudiante2 = new Estudiante();
		Estudiante estudiante3 = new Estudiante();
		
		estudiante.setNombre("Víctor");
		estudiante.setEdad(25);
		estudiante.setApellidoPaterno("Contreras");
		estudiante.setApellidoMaterno("Rojas");
		estudiante2.setNombre("Elaine");
		estudiante2.setEdad(27);
		estudiante2.setApellidoPaterno("Medeiros");
		estudiante2.setApellidoMaterno("Verdes");
		estudiante3.setNombre("Jocelyn");
		estudiante3.setEdad(28);
		estudiante3.setApellidoPaterno("Contreras");
		//estudiante3.setApellidoMaterno("Café");
		
		//estudiante.edad=30
		System.out.println(estudiante.getNombreCompleto() + ", " + estudiante2.getNombreCompleto() + " y " + estudiante3.getNombreCompleto());
		//System.out.println(estudiante.getNombreCompleto());
	}

}
