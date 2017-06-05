package GregorianCalendar;

import java.util.*;

public class FichaDeInscripcion {
	
	
	private final String nombreApellido;
	private final double altura;
	private String fechaInscripcion;
	
	private final String diaI;
	private final String mesI;
	
	private final String diaE;
	private final String mesE;
	
	private final String annoE;
	private final String nDia;
	String convertido;
	
	public FichaDeInscripcion(String nomApe, double altura, int dia, int mes, int anno)
	{
		this.nombreApellido = nomApe;
		this.altura = altura;
		
		GregorianCalendar calendario = new GregorianCalendar (anno, mes - 1, dia);
		Date date = calendario.getTime();
		convertido = date.toString();
		
		DesarmadoDate fechaDesarmada = new DesarmadoDate(convertido);
		this.diaI = fechaDesarmada.devuelve_diaI();
		this.mesI = fechaDesarmada.devuelve_mesI();
		this.annoE = fechaDesarmada.devuelve_anno();
		this.nDia = fechaDesarmada.devuelve_nDia();
		
		Traductor fechaTraducida = new Traductor();
		fechaTraducida.ResiDiaI(fechaDesarmada.devuelve_diaI());  // no le llega el parametro
		fechaTraducida.ResiMesE(fechaDesarmada.devuelve_mesI());  //no le llega el parametro
		
		this.diaE = fechaTraducida.TraDiaE();
		this.mesE = fechaTraducida.TraMesE();
	}
	
	public String devuelve_noAp()
	{return nombreApellido;}
	
	public double devuelve_al()
	{return altura;}
	
	public String devuelve_feIn()
		{return diaE + nDia + mesE + annoE + diaI + mesI + convertido;}

	
}
