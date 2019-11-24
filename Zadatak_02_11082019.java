/*
Zadatak: Napisi program koji ce racunati obim i povrsinu bazena, 
tako sto se stranice ucitavaju preko konzole.
*/

package itbootcamp.qa.gen6;

import java.util.Scanner;

public class Zadatak_02_11082019 {

	public static void main(String[] args) {

		Scanner bazen = new Scanner(System.in);

		System.out.println("Unesite duzinu bazena: ");
		double duzina;
		duzina = bazen.nextDouble();

		System.out.println("Unesite sirinu bazena: ");
		double sirina;
		sirina = bazen.nextDouble();

		System.out.println("Unesite dubinu bazena: "); 
		double dubina; dubina =
		bazen.nextDouble();

		double obim = 2 * (duzina + sirina);
		double povrsina = duzina * sirina + 2 * (dubina * (duzina + sirina));
		// double zapremina = duzina * sirina * dubina;

		System.out.println("Obim bazena je: " + obim + " metara");
		System.out.println("Povrsina bazena je: " + povrsina + " metara kvadratinih");
		// System.out.println("Zapremina bazena je: " + zapremina + " metara kubnih");

	}

}
