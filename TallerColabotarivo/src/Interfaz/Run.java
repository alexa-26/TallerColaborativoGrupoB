package Interfaz;
import java.util.Scanner;
import java.util.StringTokenizer;
import Logica.Metodos;
 /**
  * Esta clase es el donde se ejecutan los metodos 
  * @author Alejandra - Geraldine - Daniela;
  *
  */
public class Run {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int counter=0;
		String wordSearch, cadena;
		String txt = "";
		String extraer = "";
		int caracteres = 0;
		int desde = 0, hasta = 0;	
		String message= "sogamoso ciudad del sol y del acero";
		Metodos mt=new Metodos();
		
		int op=0;
		while (op!=11) { System.out.println("*****MENU********" +
		"\n"+"1. Pasar a Nombre Propio Una Frase"
				 + "\n"+"2. Buscar Palabras Repetidas en la Frase"
				 + "\n"+"3. Encriptar la Cadena"
				 + "\n"+"4. Desencriptar la Cadena"
				 + "\n"+"6. Borrar Caracteres"
				 + "\n"+"7. Interseccion de Caracteres"
				 + "\n"+"8. Diferencia de Caracteres"
				 + "\n"+"9. Borrar De Izquierda o Derecha"
				 + "\n"+"10. Convertir a Fechas"
				 + "\n"+"11. Salir");
		 op= sc.nextInt();
		
		 switch (op) {
		case 1:
			System.out.println(mt.convertir(message));
			break;
		
		case 2:
			System.out.print("Introduce la palabra a buscar: ");
			wordSearch = sc.nextLine().toLowerCase();
			mt.buscar(message, counter, wordSearch=(sc.nextLine().toLowerCase()));
			System.out.println(mt.buscar(message, counter,wordSearch));
			
				break;

		case 3:
			System.out.println(mt.encriptar(message));
				
				break;
		case 4:
			System.out.println(mt.desencriptar(mt.encriptar(message)));
				break;
		
		case 6:
			System.out.println("Ingresar texto");
			txt= sc.nextLine();
			caracteres = txt.length();
			System.out.println(txt + " tiene " + caracteres + "caracteres");
			System.out.println("Extraer desde : ");
			desde = sc.nextInt();
			System.out.println("extraer hasta");
			hasta = sc.nextInt();
			extraer = txt.substring(desde, hasta);
			System.out.println(extraer);
			
			break;
		case 7: 
			System.out.print("Introduce la cadena: ");
			cadena = sc.nextLine().toLowerCase();
			mt.interseccion(message, cadena=(sc.nextLine().toLowerCase()));
			System.out.println(mt.interseccion(message, cadena));
			
			break;
		case 8:
			System.out.println("Escriba la cadena ");
	        String arregloUno[]=message.split("");
	        cadena=new String (sc.nextLine().toLowerCase());
	        String arregloDos[]=cadena.split("");
	        System.out.println(mt.diferencia(arregloUno, arregloDos));
			break;
		case 9:	
			System.out.println("Ingrese la cadena ");
			String cadenaDos=new String (sc.nextLine().toLowerCase());
			String [] arreglo1=message.split("");
			String [] arreglo2=cadenaDos.split("");
			System.out.println("Cadenas " + mt.borrarIzqoDere(arreglo1, arreglo2));
		
				break;
		case 10:
			System.out.println(mt.covertirFecha("25/10/2020").getTime());
			
			break;
		case 11:
			System.out.println("Gracias Por Usar Nuestros Servicios");
			break;
		default:
			break;
		
		 }
		}
			
	}
}