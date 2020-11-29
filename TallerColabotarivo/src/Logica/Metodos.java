package Logica;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
/**
 * 
 * Clase donde se crearon los metodos
 *
 */
public class Metodos {
	
	//Metodo usado para convertir en mayuscula la primera letra de cada palabra
	public String convertir(String  message) {
			char[] caracteres = message.toCharArray();
			caracteres[0] = Character.toUpperCase(caracteres[0]);
			for (int i = 0; i < message.length()- 2; i++) 
				  if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',')
			      caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
			  return new String(caracteres);
	}
	
	//Metodo usado para contar cuantas veces se repite una palabra 
	public String buscar(String message, int counter, String wordSearch) {
		
		StringTokenizer tok = new StringTokenizer(message);
		while(tok.hasMoreTokens()) {
			if(tok.nextElement().equals(wordSearch)) {
				counter++;
			}
		}
		return "en la frase: "+ message + " se repite: "+counter + " veces la palabra: " + wordSearch;
	}
	
	//Metodo usado para encriptar una cadena de caracteres
	public String encriptar(String message) {
	 char arrayEncryp[] = message.toCharArray();
		
		for (int i = 0; i < arrayEncryp.length; i++) {
		
			arrayEncryp[i] = (char)(arrayEncryp[i] +(char)2);
		}
		String encrypt = String.copyValueOf(arrayEncryp);
		return encrypt;
	}
	
	//Metodo usado para desencriptar una cadena de caracteres
	public String desencriptar(String encrypt) {

		char arrayDecrypt[] = encrypt.toCharArray();
		
		for (int i = 0; i < arrayDecrypt.length; i++) {
			arrayDecrypt[i]= (char)(arrayDecrypt[i]-(char)2);
		}
	
		String decrypt = String.copyValueOf(arrayDecrypt);
		
		return decrypt;
	}
	
	//Metodo usado para concatenar un careacter por izquierda o por derecha
	public String llenar() {
		return null;
	}
	
	//Metodo usado para borrar un caracter de una cadena
	public String borrar() {
		return null;
	}
	
	//Metodo usado para comparar dos cadenas y saber cuales caracteres se repiten
	public String interseccion(String message, String cadena) {
		String 	interseccion="";
		for(int i=0;i<message.length();i++){ 		     
			for(int j=0;j<cadena.length();j++){           
				if(message.charAt(i)==cadena.charAt(j)){  
					interseccion += message.charAt(i)+" ";  
               break;
           }  
       }  
}  
		return interseccion;
	}
	
	//Metodo usado para quietar los caracteres que se repiten en dos cadenas
	public String diferencia(String arregloUno[], String[] arregloDos) {
		for (int i = 0; i < arregloUno.length; i++) {
			boolean repetir=false;
			for (int j = 0; j < arregloDos.length; j++) {
				if (arregloUno[i].equals(arregloDos[j])) {
					arregloUno[i]="";
					repetir=true;
					break;
				}
				if (repetir=false) {
					break;
				}
				
				
			}
		}
		return llenarCadenaIzquierda(arregloUno);
		
	}
	public static  String llenarCadenaIzquierda(String[] arregloUno) {
		String resultado=new String();
		for (int i = 0; i < arregloUno.length; i++) {
			resultado+=arregloUno[i];	
		}
		return resultado;
	}
	
	//Metodo usado para borrar una carracter que este dentro de una cadena de caracteres 
	public String borrarIzqoDere(String[] arregloUno, String[] arregloDos) {

		for (int i = 0; i < arregloUno.length; i++) {
			boolean repetir=false;
			for (int j = 0; j < arregloDos.length; j++) {
				if (arregloUno[i].equals(arregloDos[j])) {
					arregloUno[i]="";
					repetir=true;
					break;
				}
				if (repetir==false) {
					break;
				}
			}
		}
		return llenarCadenaIz(arregloUno);

	}
	private static String llenarCadenaIz(String[] arregloUno) {
		String mensaje="";
		for (int i = 0; i < arregloUno.length; i++) {
			mensaje+=arregloUno[i];
		}
		return mensaje;
	}
	public static String borrarDerecha(String[] arregloUno, String[] arregloDos) {

		for (int i =arregloUno.length-1; i >=0; i--) {
			boolean repetir=false;
			for (int j = arregloDos.length-1; j >=0 ; j--) {
				if (arregloUno[i].equals(arregloDos[j])) {
					arregloUno[i]="";
					repetir=true;
					break;
				}
				if (repetir==false) {
					break;
				}
			}
		}
		return llenarCadenaDerecha(arregloUno);
	}
	private static String llenarCadenaDerecha(String[] arregloUno) {
		String mensaje="";
		for (int i = 0; i < arregloUno.length; i++) {
			mensaje+=arregloUno[i];
		}
		return mensaje;
	}
		
	
	//Metodo usado para manejo de fechas
	public Calendar covertirFecha(String fecha) {
        Calendar fechaCalendar;
		String fechaArray[]= fecha.split("/");
		fechaCalendar = new GregorianCalendar((Integer.parseInt(fechaArray[2])), Integer.parseInt(fechaArray[1]),Integer.parseInt(fechaArray[0]));
		System.out.println(fechaCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(fechaCalendar.get(Calendar.MONTH));
		System.out.println(fechaCalendar.get(Calendar.YEAR));
		
		return  fechaCalendar ;
	}
}
