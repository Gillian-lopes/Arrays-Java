package soma;

import java.util.Locale;
import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.println("Entre com a quantidade de numeros");
		n = sc.nextInt();

		double[] number = new double[n];

		System.out.println("Entre com os valores");				

		for (int i = 0; i < n; i++) {
			number[i] = sc.nextDouble();			
		}
		soma = 0;	
		
		for (int i = 0; i < n; i++) {
			soma = number[i] + soma;
		}
		System.out.println("A soma total é = " + soma);
		
		media = soma / n;
						
		System.out.println("A média é = " + media);		
		System.out.print("Os valores digitados foram : ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf(" %.1f ", number[i]);
		}
		

		sc.close();

	}

}
