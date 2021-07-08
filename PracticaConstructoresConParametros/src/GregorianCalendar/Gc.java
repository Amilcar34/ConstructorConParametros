
package GregorianCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Gc {

	public static void main(String[] args) {
		
		Gc gc= new Gc();

	}
	
	//Este siguiente es un constructor sin parámetros que directamente imprime al ser instanciada la clase.
	public Gc(){
		/*
		 * En todos los casos con fechas Java convierte los datos desde Date que es un 'objeto'
		 * donde podés convertirlo en un String con toString() o manualmente en un String nuevo.
		 *
		 */
		
			//Gregorian calendar le da un formato estructurado de una manera determinada al String y sirve esencialmente si hay parámetros de por medio.
				GregorianCalendar gr_Sin_Param= new GregorianCalendar();	//Creamos objeto Gregorian, si no le das parámetro solo crea un Date()
				Date date_Gr_Sin_Param = gr_Sin_Param.getTime();						//getTime() lo convierte a una serie de números String no identificables por humanos
				String str_date_Gr_Sin_Param = date_Gr_Sin_Param.toString();			//toString() sólo sirve en este caso.
				System.out.println(str_date_Gr_Sin_Param);					//Imprimimos el String anterior.
			
			//Simple date format impone un formato y luego a Date lo parsea. 
				SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
				Date d= new Date();
				String format= f.format(d);
				System.out.println(format);
			
			/*
			 * Date sólo crea un objeto sin parseo o formato, el método getTime() directamente
			 * lo convierte en un String asi no tenes que hacer todos los pasos pero no es identific.
			 */
				Date dateCrudo= new Date();					//Creamos la fecha
				String convertir= dateCrudo.toString();		//Convertimos el objeto fecha en String con toString() de la clase Object
				System.out.println(convertir);				//Lo imprimimos
				
			/*
			 * Acá hay algo que tenés que tener en cuenta, tanto GregorianCalendar es una clase verso si no tiene parámetros,
			 * Porqué? porque no es necesario crear una instancia de la misma para obtener un mismo resultado, como la hora actual
			 * en cambio si se usan parámetros dentro del GregorianCalendar cambia su uso, tené en cuenta que ya con el sólo
			 * hecho de crear una instancia de Date estás creando un objeto fecha, el cual si llamás
			 * al métodos getTime() tampoco necesitás convertirlo en String, porqué? porque los de Java
			 * no son pelotudos y dentro del método getTime() está incluido la función String automáticamente
			 * probablemente después de usar getTime() tendrás que parsearlo para poder entenderlo como humano.
			 */
				Date dateCrudisimo= new Date();		//Creamos el objeto fecha(Date)
				System.out.println(dateCrudisimo);	//Ahora si imprimimos directamente el objeto sale como un String
				
			
			 /*
			  * Porqué el más crudo de todos imprime lo mismo que el GregorianCalendar?
			  * Porque como te darás cuenta todos los pasos anteriores son al pedo si
			  * no tenés parámetros de por medio, ya que aunque Creés una clase GregorianCalendar,
			  * SimpleDateFormat, uses toString() o lo que sea, apenas creás el Date() Java ya te
			  * creó un objeto que es un 'String' crudo de la hora actual de tu pc. y todo por no usar parámetros
			  * dentro del contructor de GregorianCalendar o cualquiera de las Clases que usamos.
			  * En resumen el resultado es siempre el mismo.
			  */
				
				
				
			/*
			 * Acá cambia todo ya que se ingresaron parámetros en Gregorian Calendar
			 * por ende se usó el contructor del mismo y se tiene que hacer manualmente aplicar
			 *  el eétodo getTime(), luego parsearlo a String y finalmente ahí sí imprimirlo.
			 */
				GregorianCalendar gregorian_Parametros= new GregorianCalendar(1995,11-1,21);	//Creamos objeto Gregorian, si no le das parámetro solo crea un Date()
				Date date_Gregorian_Parametros = gregorian_Parametros.getTime();				//getTime() lo convierte a una serie de números String no identificables por humanos
				String str_date_Gregorian_Parametros = date_Gregorian_Parametros.toString();	//toString() sólo sirve en este caso.
				System.out.println(str_date_Gregorian_Parametros);		
				
			
			/*
			 * Mirá que pasa si a GregorianCalendar u a otra le pasás parámetros y pretendés
			 * imprimirlo directamente:
			 */
				
				GregorianCalendar gregorian_con_Parametros= new GregorianCalendar(1995,11-1,21);
				System.out.println(gregorian_con_Parametros);
	}

}
