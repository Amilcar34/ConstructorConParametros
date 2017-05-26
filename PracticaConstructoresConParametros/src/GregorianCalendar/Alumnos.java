package GregorianCalendar;

public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//El constructor funciona como un setter gigante y obligatorio, en cambio el setter es opcional.
	FichaDeInscripcion alumno1 = new FichaDeInscripcion("Juan Carlos", "Alberino", 1.80);
	
	System.out.println(alumno1.dime_datos());
	System.out.println(alumno1.toString());
	System.out.println(alumno1.toString(20.35));
	
	System.out.println(alumno1.dime_datos()); // una vez impreso vas a ver que hay un ciclo, donde acabo de 
	// usar un método para sobre escribir la altura en un método pero cuando lo vuelvo a llamar usa el del constructor
	// si se usa un setter se sobrescribe totalmente.

	}

}
