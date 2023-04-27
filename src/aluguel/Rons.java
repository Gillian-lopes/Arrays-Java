package aluguel;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluguel;

public class Rons {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluguel[] aluguel = new Aluguel[10];

		System.out.print("Quantos quartos alugados : ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("aluguel #" + i + ": ");
			System.out.print("nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email : ");
			String email = sc.nextLine();
			System.out.print("Quarto : ");
			int quarto = sc.nextInt();

			aluguel[quarto] = new Aluguel(nome, email);

		}
		System.out.printf("\nQuartos alugados\n\n");
		for (int i = 0; i < 10; i++) {
			if (aluguel[i] != null) {
				System.out.println("Quarto: " + i + ", " + aluguel[i]);
			}
		}

		sc.close();

	}

}
