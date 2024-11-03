package Package1;
/*
 * Tres chicas se presentan a concursos de programación, en ellos hay varios
 * problemas a resolver, presentarán la respuesta del problema en cuestión si
 * al menos dos de ellas están seguras de su respuesta (1 1 0, por ejemplo), 
 * crear un programa al que meteremos un int indicando los problemas a resolver,
 * por ejemplo 3, y meter tres lineas en las que se especifique si las chicas
 * tienen clara su respuesta o no en cada problema, el programa imprime
 * el número de problemas a los que han presentado respuesta. Ejemplo:
 * Input:
 * 3
 * 1 0 1
 * 1 1 1
 * 0 0 1
 * Output:
 * 2 
 */
import java.util.Scanner;

public class Ex03_231A_Team {
	
	public static void Team() {
		Scanner sc=new Scanner(System.in);
		int problems=sc.nextInt();
		int count=0;
		int correctProblems=0;
		boolean a=true;
		sc.nextLine();
		
		if (problems>=1&&problems<=1000) {
			while (count!=problems&&a==true) {
				int correctAnswer=0;
				String answers=sc.nextLine();
				if ((answers.charAt(0)=='1'||answers.charAt(0)=='0')&&(answers.charAt(2)=='1'||answers.charAt(2)=='0')&&(answers.charAt(4)=='1'||answers.charAt(4)=='0')) {
					if (answers.charAt(0)=='1') correctAnswer++;
					if (answers.charAt(2)=='1') correctAnswer++;
					if (answers.charAt(4)=='1') correctAnswer++;
					if (correctAnswer>=2) correctProblems++;
					count++;
				} else a=false;
			}
			if (a==true) System.out.println(correctProblems);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team();
	}
}
/*
 * ERRORES COMETIDOS:
 * 1. En el if que comprueba que los char son estrictamente 1 o 0,
 * había que insertar los x||y dentro de parentesis dejando fuera de
 * los paréntesis el &&, es decir (x||y)&&(a||b).
*/