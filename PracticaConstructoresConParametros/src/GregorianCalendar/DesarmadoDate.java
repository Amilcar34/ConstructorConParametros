package GregorianCalendar;

public class DesarmadoDate {
	
	protected String diaI;
	protected String mesI;
	protected String anno;
	protected String nDia;
	
	public DesarmadoDate(String convertido){
		
		this.diaI = convertido.substring(0, 3);
		this.mesI = convertido.substring(4, 7);
		this.anno = convertido.substring(24, 28);
		this.nDia = convertido.substring(8, 10);
	}

	public String devuelve_diaI()
	{return diaI;}
	
	public String devuelve_mesI()
	{return mesI;}
	
	public String devuelve_anno()
	{return anno;}
	
	public String devuelve_nDia()
	{return nDia;}
	
}
