package GregorianCalendar;

public class Traductor{
	
	protected String diaE;
	protected String mesE;
	

	
	public void ResiDiaI(String diaI)   //Setter
	{
	if (diaI == "Mon")
	{this.diaE = "Lun";}
	else if (diaI == "Tue")
	{this.diaE = "Mar";}
	else if (diaI == "Wed")
	{this.diaE = "Mie";}	
	else if (diaI == "Thu")
	{this.diaE = "Jue";}
	else if (diaI == "Fri")
	{this.diaE = "Vie";}
	else if (diaI == "Sat")
	{this.diaE = "Sab";}
	else if (diaI == "Sun")
	{this.diaE = "Dom";}
	}
	
	public String TraDiaE() //getter
	{return diaE;}
	
	
	public void ResiMesE(String mesI)   //setter
	{	
		if (mesI == "Jan")
		{this.mesE = "Ene";}
		else if (mesI == "Feb")
		{this.mesE = mesI;}
		else if(mesI == "Mar")
		{this.mesE = mesI;}
		else if (mesI == "Apr")
		{this.mesE = "Abr";}
		else if (mesI == "May")
		{this.mesE = mesI;}
		else if (mesI == "Jun")
		{this.mesE = mesI;}
		else if (mesI == "Jul")
		{this.mesE = mesI;}
		else if (mesI == "Agu")
		{this.mesE = "Ago";}
		else if (mesI == "Sep")
		{this.mesE = mesI;}
		else if (mesI == "Oct")
		{this.mesE = mesI;}
		else if (mesI == "Nov")
		{this.mesE = mesI;}
		else if (mesI == "Dec")
		{this.mesE = "Dic";}
	}

	
	public String TraMesE()
	{return mesE;}
	
}
