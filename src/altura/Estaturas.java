package altura;

import java.util.Locale;
import java.util.Scanner;

public class Estaturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, menores;
		double alturaTotal, alturaMedia, percentualMenores;

		System.out.println("Digite a quantidade de linhas");
		n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Entre com o nome, idade e altura do usuario " + i + ": ");
			System.out.print("Nome : ");
			nome[i] = sc.next();
			System.out.print("Idade : ");
			idade[i] = sc.nextInt();
			System.out.print("Altura : ");
			altura[i] = sc.nextDouble();
		}
		alturaTotal = 0;
		System.out.println("Media de altura entre Ususarios :");
		for (int i = 0; i < n; i++) {
	    alturaTotal = alturaTotal + altura[i];	
		   }
		alturaMedia = alturaTotal / n;
		System.out.printf("%.2f\s\n" , alturaMedia);
		

		System.out.println("Ususarios menores de dezesseis anos :");
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {				
				System.out.printf("%s\n", nome[i]);
			}
		}
		
		
		sc.close();

	}

}
