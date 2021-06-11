
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int menor10=0;
		int multiplo6=0;
		int num=0;
		int sumanum=0;
		do {
			System.out.println("Ingrese un numero:");
			num =scanner.nextInt();
			sumanum = sumanum+num;
			if (num%6==0) {
				multiplo6 = multiplo6+1;
			}
			if (num<=10 && num>0) {
				menor10 = menor10+1;
			}
		} while (sumanum<1000);
		System.out.println("Multiplos de 6: "+multiplo6);
		System.out.println("Suma de numeros entre 1 y 10: "+menor10);
	}


}

