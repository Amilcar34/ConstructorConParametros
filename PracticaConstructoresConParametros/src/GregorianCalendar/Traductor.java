package GregorianCalendar;

public class Traductor{
	
protected String diaE;
	protected String mesE;
	
	public void ResiDiaI(String diaI)   //Setter
	{
	if (diaI.equals("Mon"))
			{
				this.diaE = "Lun";
			}
	else if (diaI.equals("Tue"))
			{
				this.diaE = "Mar";
			}
	else if (diaI.equals("Wed"))
			{
				this.diaE = "Mie";
			}	
	else if (diaI.equals("Thu"))
			{
				this.diaE = "Jue";
			}
	else if (diaI.equals("Fri"))
			{
				this.diaE = "Vie";
			}
	else if (diaI.equals("Sat"))
			{
				this.diaE = "Sab";
			}
	else if (diaI.equals("Sun"))
			{
				this.diaE = "Dom";
			}
	}
	
	public String TraDiaE() //getter
		{
			return diaE;
		}
	
	
	public void ResiMesE(String mesI)   //setter
	{	
		if (mesI.equals("Jan"))
			{
				this.mesE = "Ene";
			}
		else if (mesI.equals("Feb"))
			{
				this.mesE = mesI;
			}
		else if(mesI.equals("Mar"))
			{
				this.mesE = mesI;
			}
		else if (mesI.equals("Apr"))
			{
				this.mesE = "Abr";
			}
		else if (mesI.equals("May"))
			{
				this.mesE = mesI;
			}
		else if (mesI.equals("Jun"))
			{
				this.mesE = mesI;
			}
		else if (mesI.equals("Jul"))
			{
				this.mesE = mesI;
			}
		else if (mesI.equals("Agu"))
			{
				this.mesE = "Ago";
			}
		else if (mesI.equals("Sep"))
			{
				this.mesE = mesI;
			}
		else if (mesI.equals("Oct"))
			{
				this.mesE = mesI;
			}
		else if (mesI.equals("Nov"))
			{
				this.mesE = mesI;
			}
		else if (mesI.equals("Dec"))
			{
				this.mesE = "Dic";
			}
	}

	
	public String TraMesE()
		{
			return mesE;
		}
	
}
