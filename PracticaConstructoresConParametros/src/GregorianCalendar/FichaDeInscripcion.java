package GregorianCalendar;

import java.util.*;

public class FichaDeInscripcion {
	
	
	String nombreApellido;
	double altura;
	String fechaInscripcion;
	
	String diaI;
	String mesI;
	
	String diaE;
	String mesE;
	
	String annoE;
	String nDia;
	
	public FichaDeInscripcion(String nomApe, double altura, int dia, int mes, int anno)
	{
		this.nombreApellido = nomApe;
		this.altura = altura;
		
		GregorianCalendar calendario = new GregorianCalendar (anno, mes - 1, dia);
		Date date = calendario.getTime();
		String convertido = date.toString();
		
		DesarmadoDate fechaDesarmada = new DesarmadoDate(convertido);
		this.diaI = fechaDesarmada.devuelve_diaI();
		this.mesI = fechaDesarmada.devuelve_mesI();
		this.annoE = fechaDesarmada.devuelve_anno();
		this.nDia = fechaDesarmada.devuelve_nDia();
		
		Traductor fechaTraducida = new Traductor();
		fechaTraducida.ResiDiaI(diaI);
		fechaTraducida.ResiMesE(mesI);
		
		this.diaE = fechaTraducida.TraDiaE();
		this.mesE = fechaTraducida.TraMesE();
		
		
	}
	
	public String devuelve_noAp()
	{return nombreApellido;}
	
	public double devuelve_al()
	{return altura;}
	
	
	
	public String devuelve_feIn()
		{return diaE + nDia + mesE + annoE + diaI + mesI;}

	
}
