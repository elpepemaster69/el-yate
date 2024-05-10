package javaEjemplo1;


public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("Lucio","Gayoso");
		p1.setEdad(33);
		
		Estudiante e1 = new Estudiante("Jose","Flores");
		e1.setEdad(30);
		
		Estudiante pr1 = new Estudiante("Danilo","Casagrande");
		pr1.setEdad(50);
		
		System.out.println("Mi nombre es: "+ p1.getNombre());
		System.out.println("Mi apellido es: "+ p1.getApellido());
		System.out.println(e1.saludar());
		System.out.println(pr1.saludar());
		
		//buen codigo, pero no hagas cosas como ("Jorge","jorge")
		//TANTO CUESTA DEJAR UN ESPACIO EN LA COMAAAAA "", ""
	}
	
	

}
