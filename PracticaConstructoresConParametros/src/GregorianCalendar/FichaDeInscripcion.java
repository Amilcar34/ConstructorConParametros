package GregorianCalendar;

import java.util.*;

public class FichaDeInscripcion {
	
	String nombreApellido;
	double altura;
	Date fechaInscripcion;
	
	
	public FichaDeInscripcion(String nomApe, double altura, int dia, int mes, int anno)
	{
		this.nombreApellido = nomApe;
		this.altura = altura;
		
		GregorianCalendar calendario = new GregorianCalendar (anno, mes - 1, dia);
		
		this.fechaInscripcion = calendario.getTime();
	}
	
	public String devuelve_noAp()
	{return nombreApellido;}
	
	public double devuelve_al()
	{return altura;}
	
	public Date devuelve_feIn(){
		return fechaInscripcion;
		}

}
