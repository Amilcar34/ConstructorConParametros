package GregorianCalendar;

import java.util.Date;
import java.util.GregorianCalendar;

public class FichaDeInscripcion {
	
	private String nombre;
	private String apellido;
	private Date fechaEntrada;
	private Date fechaSalida;
	private double altura;
	 
	public FichaDeInscripcion(String nomb, String apel, int dia1, int mes1, int anno1, int dia2 , int mes2, int anno2, double altu )
	{this.nombre= nomb; this.apellido = apel; 
		GregorianCalendar datoCalendario = new GregorianCalendar(anno1,mes1,dia1);
		this.fechaEntrada = datoCalendario.getTime();

		GregorianCalendar datoCalendario2 = new GregorianCalendar(anno2, mes2, dia2);
		this.fechaSalida = datoCalendario2.getTime();

		this.altura = altu;}
	
	
	public String dime_datos()
	{return "el nombre es: " + nombre;} //+ apellido + fechaEntrada + fechaSalida + altura
}
