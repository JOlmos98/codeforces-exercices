package Package1;
/*
 * Hacer un programa al que introducir primero un int que será
 * el número de declaraciones posteriores, y después en cada línea
 * (en función del primer int metido) escribiremos X++ o ++X para incrementar la variable X o
 * X-- o --X para decrementar la variable X, sólo se pueden introducir esas cuatro declaraciones,
 * cualquier declaración distinta terminará el programa.
 * Ejemplo:
 * INPUT:
 * 3
 * X++
 * ++X
 * --X
 * OUTPUT:
 * 1
 */
import java.util.Scanner;

public class Ex04_282A_Bit_plus_plus {
	
	public static void bitPlusPlus(){
		Scanner sc=new Scanner(System.in);
		int lines=sc.nextInt();
		sc.nextLine();
		short counter=0;
		short result=0;
		boolean XXX=true;
		if (lines>=1&&lines<=150) {
			while (counter!=lines&&XXX) {
				boolean bitX=false;
				boolean bitPlus=false;
				boolean bitLess=false;
				String bit=sc.nextLine();
				if (bit.length()==3) {
					for (short i=0;i<bit.length();i++) {
						if (bit.charAt(i)=='X'||bit.charAt(i)=='-'||bit.charAt(i)=='+') {
							if (bit.startsWith("X")||bit.startsWith("++")||bit.startsWith("--")) {
								if (bit.startsWith("X")||bit.endsWith("X")) bitX=true;
								if (bit.startsWith("++")||bit.endsWith("++")) bitPlus=true;
								if (bit.startsWith("--")||bit.endsWith("--")) bitLess=true;
							} else XXX=false;
						} else XXX=false;
					} 
					if (bitPlus&&bitX) result++;
					if (bitLess&&bitX) result--;
				} else XXX=false;
				counter++;
			}
			if (XXX) System.out.println(result);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bitPlusPlus();
	}
}
/*
 * ERRORES COMETIDOS:
 * Ninguno, pero el ejercicio era más fácil de como
 * lo he planteado, se podía simplificar poniendo un if
 * que evaluase que la declaración introducida fuese
 * (bit.equals("X++")||bit.equals("++X")||bit.equals("X--")||bit.equals("--X"))
 * y me habría ahorrado creo que dos o tres if.
*/