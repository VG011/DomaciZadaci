/*
Zadatak: Napisi program koji ce racunati obim i povrsinu bazena (koristeci grananje), 
tako sto se stranice ucitavaju preko konzole.
*/

package drugi;

import java.util.Scanner;

public class Zadatak_03_11122019 {

	public static void main(String[] args) {

		Scanner bazen = new Scanner(System.in);

		System.out.println("Unesite duzinu bazena: ");
		double duzina = bazen.nextDouble();

		if (duzina <= 0) {
			System.out.println("Pogresna vrednost duzine");
		}

		System.out.println("Unesite sirinu bazena: ");
		double sirina = bazen.nextDouble();

		if (sirina <= 0) {
			System.out.println("Pogresna vrednost sirine");
		}

		System.out.println("Unesite dubinu bazena: ");
		double dubina = bazen.nextDouble();

		if (dubina <= 0) {
			System.out.println("Pogresna vrednost dubine");
		}

		if (duzina <= 0 || sirina <= 0) {
			System.out.println("Pogresan unos - nije moguce izracunati obim bazena!");
		} else {
			double obim = 2 * (duzina + sirina);

			System.out.println("Obim bazena je: " + obim + " metara");
		}
		if (duzina <= 0 || sirina <= 0 || dubina <= 0) {
			System.out.println("Pogresan unos - nije moguce izracunati povrsinu bazena!");
			System.out.println("Pogresan unos - nije moguce izracunati zapreminu bazena!");
		} else {
			double povrsina = duzina * sirina + 2 * (dubina * (duzina + sirina));
			double zapremina = duzina * sirina * dubina;

			System.out.println("Povrsina bazena je: " + povrsina + " metara kvadratinih");
			System.out.println("Zapremina bazena je: " + zapremina + " metara kubnih");
		}

	}

}
