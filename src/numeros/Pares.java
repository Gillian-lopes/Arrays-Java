package numeros;

import java.util.Locale;
import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, quantidadeInteiro, soma;

		System.out.println("Digite a quantidade de numeros para o vetor: ");
		n = sc.nextInt();

		int[] quantity = new int[n];

		System.out.println("Digite os valores inteiro:");
		for (int i = 0; i < n; i++) {
			quantity[i] = sc.nextInt();
		}
		System.out.print("Os numeros pares digitados são : ");
		soma = 0;
		for (int i = 0; i < n; i++) {
			if (quantity[i] % 2 == 0) {
				System.out.printf("%d  ", quantity[i]);
				soma++;
			}			
		}
		
		System.out.printf("\n\nA quantidade dos pares são = %d\n", soma);

		sc.close();
	}

}
