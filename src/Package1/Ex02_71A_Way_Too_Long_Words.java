package Package1;
/*
 * Crear un programa por el que meteremos un int primero, que será la cantidad de 
 * lineas a introducir, después introducimos las palabras y pulsamos INTRO en cada 
 * una, el programa imprimirá las palabras introducidas y las palabras las cuales
 * s.length()>10 se abreviarán y se escribirá la primera letra y la última y entre ellas 
 * el número de letras que hay. Ejemplo: habitaciones = h10s
 */
import java.util.Scanner;

public class Ex02_71A_Way_Too_Long_Words {

	public static void TooLongWords() {
		Scanner sc=new Scanner(System.in);
		int cPalabras=sc.nextInt();
		int iPalabras=0;
		sc.nextLine();
		if (cPalabras>=1&&cPalabras<=100) {
			while (iPalabras!=cPalabras) {
				boolean minuscula=true;
				String palabra=sc.nextLine();
				for (int i=0;i<palabra.length();i++) {
					if (!Character.isLowerCase(palabra.charAt(i))) {
						minuscula=false;
						break;
					}
				}
				if (minuscula==true&&palabra.length()>=1&&palabra.length()<=100) {
					if (palabra.length()>10) {
						System.out.println((palabra.charAt(0))+""+(palabra.length()-2)+""+palabra.charAt(palabra.length()-1));
					} else System.out.println(palabra);
				}
				iPalabras++;
			}
		sc.close();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TooLongWords();
	}
}
/*
 * ERRORES COMETIDOS:
 * 
 * 1. Después de nextInt() se generaba una línea vacía, habia que consumirla con sc.nextLine();
 * 2. Por esa generación de la línea vacía antes del while, el propio while terminaba una palabra
 * antes de introducir las especificadas con el primer int, es decir, ponías 4 y te dejaba poner
 * tres palabras.
 */