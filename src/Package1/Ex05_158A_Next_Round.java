package Package1;
import java.lang.reflect.Array;
/*
 * n: Concursantes totales que participan.
 * k: Posición la cuál la puntuación es el límite para pasar a la siguiente ronda.
 * 
 */
import java.util.Scanner;

public class Ex05_158A_Next_Round {

	public static void nextRound() {
		Scanner sc=new Scanner(System.in);
		String datos=sc.nextLine();
		int nextround=0;
		if (datos.length()>=3&&datos.length()<=5&&datos.contains(" ")) {
			int participantes=Integer.parseInt(datos.substring(0, datos.lastIndexOf(" ")));
			int posicionlimite=Integer.parseInt(datos.substring(datos.lastIndexOf(" ")+1)); //Los que estén por encima de esta posición, y esta posición, avanzan a la siguiente ronda.
			
			if (participantes>=1&&participantes<=50&&posicionlimite>=1&&posicionlimite<=50&&participantes>=posicionlimite) {
				String puntuaciones=sc.nextLine();
				String[] puntuacionesseparadas=puntuaciones.split(" ");
				int[] puntuacionesint=new int[puntuacionesseparadas.length];
				if (puntuacionesseparadas.length==participantes) {
					for (int i=0;i<puntuacionesseparadas.length;i++) {
						puntuacionesint[i]=Integer.parseInt(puntuacionesseparadas[i]);
						System.out.println(puntuacionesseparadas[i]);
					}
					System.out.println(puntuacionesseparadas.length+" "+puntuacionesint.length);
					/*
					 * En este punto solo falta verificar de alguna forma que las puntuaciones
					 * se escriben por el input de mayor a menor y que el programa identifique 
					 * en la posicion adecuada el numero en cuestion y si de los restantes
					 * (que se quedarian fuera) alguna puntuacion es igual a la mencionada, 
					 * que tambien entre.
					 */
				}
			}
		}
		
		System.out.println("Programa terminado.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nextRound();
	}

}
