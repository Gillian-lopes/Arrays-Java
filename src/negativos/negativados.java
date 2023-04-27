package negativos;

import java.util.Locale;
import java.util.Scanner;

public class negativados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Digite a quantidade de caixas");
		n = sc.nextInt();

		int[] numeros = new int[n];
		
		System.out.println("Digite os numeros inteiros:");
		
		for (int i = 0; i < n; i++) {
			numeros[i]= sc.nextInt();
		}
		System.out.println("Os numeros negativos são: ");
		for (int i=0; i<n; i++) {
			if (numeros[i]<0) {
				System.out.println(numeros[i]);
			}
		}
		
		
		sc.close();
	}

}
