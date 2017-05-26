package GregorianCalendar;

public class FichaDeInscripcion {
	
	private String nombre;
	private String apellido;

	private double altura;
	 
	public FichaDeInscripcion(String nombre, String apellido, double altura )
	{
		this.nombre= nombre;
		this.apellido = apellido;
		this.altura = altura;}
	
//Metodo comun creado
	public String dime_datos()
			{
				return "el nombre es: " + nombre + ", su apellido es " + apellido + " y su altura es de " + altura + " metros.";
			}	
	
//Metodo toString de la clase Object
	public String toString()
			{
				return "El apellido es: " + apellido; 
			}	
	
//Metodo toString de la clase object sobrecargado	
	public String toString(double altura)
			{
				return "La altura es: " + altura;
			}
	
	public void setAltura(double altura){
		this.altura= altura;
	}
	
//No se porque no te aparecía nada, sin embargo como verás ahora anda y muy bien.
//Fijate la sobre carga al metodo toString()
//Lo más probable es que no hayas asignado parametros al cuerpo del constructor, sin embargo la
//hice facil y borre todo y lo modifique para que ande.
//Mira el main vas a ver que todos devuelven un String pero sométodos distintos y que funcionan los constructores
//Como un setter gigante con la diferencia que no se le debe declarar el return al final.
}
