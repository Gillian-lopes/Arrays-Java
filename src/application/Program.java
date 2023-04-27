package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de posição do vetor: " );
		int n = sc.nextInt();	
		double[] vetor = new double[n];
		System.out.println();
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			System.out.println("Digite o valor da posição " + i +":");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];			
		}
		double media = soma / n;
		 System.out.printf("A media é %.2f%n ", media);

		sc.close();

	}

}
