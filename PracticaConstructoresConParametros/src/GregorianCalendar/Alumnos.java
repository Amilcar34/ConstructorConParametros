package GregorianCalendar;

public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FichaDeInscripcion alumno1 = new FichaDeInscripcion("Javier Alvaro", 1.7 , 1, 6, 2017 );
		FichaDeInscripcion alumno2 = new FichaDeInscripcion("Jav Alv", 1.8 , 12, 8, 1993 );
		FichaDeInscripcion alumno3 = new FichaDeInscripcion("Maria Este", 1.8 , 29, 5, 2017 );
	
		System.out.println(alumno1.devuelve_noAp() + " " + alumno1.devuelve_al() + " " + alumno1.devuelve_feIn());
		System.out.println(alumno2.devuelve_noAp() + " "+ alumno2.devuelve_al() + " " + alumno2.devuelve_feIn());
		System.out.println(alumno3.devuelve_noAp() + " "+ alumno3.devuelve_al() + " " + alumno3.devuelve_feIn());
		
		System.out.println(alumno1.devuelve_feIn());
		
	
	}
}