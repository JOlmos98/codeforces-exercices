package Package1;
/*
 * Crear un método que introduciendo por parámetro un int entre 1 y 100,
 * ambos inclusive, imprima por consola YES si divido entre dos da un 
 * número par o NO si no da par al divirlo entre dos.
 */
import java.util.Scanner;

public class Ex01_4A_Watermelon {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			if (n>=1&&n<=100) {
				if (n==2) System.out.println("NO");
				else if (n%2==0) System.out.println("YES");
				else System.out.println("NO");
			}
			sc.close();
	}
}

