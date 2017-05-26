package GregorianCalendar;

public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	FichaDeInscripcion alumno1 = new FichaDeInscripcion("Juan Carlos", "ALberino", 01,02,1993,05,07,2000, 1.80);
	FichaDeInscripcion alumno2 = new FichaDeInscripcion("Florencia", "Montenegro", 02, 03, 1994, 05, 12 , 2000 , 1.60 );
	
	System.out.println(alumno1.dime_datos());
	System.out.println(alumno2.dime_datos());
	}

}
