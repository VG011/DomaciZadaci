/*
Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata niza 
koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
*/

package peti;

import java.util.Scanner;

public class Zadatak_02_11192019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float el = 0;
		float proizvod = 1;

		System.out.println("Unesite duzinu niza");
		int duzina = sc.nextInt();

		float[] brojevi = new float[duzina];

		if (duzina <= 0) {
			System.out.println("Pogresan unos");
		} else {
			for (int i = 0; i < duzina; i++) {
				System.out.println("Unesite " + (i + 1) + "." + " element niza");
				el = sc.nextFloat();
				brojevi[i] = el;
				if (el > i) {
					proizvod *= brojevi[i];
				}
			}
		}
		System.out.print("Niz je: ");
		for (int i = 0; i < duzina; i++) {
			System.out.print(brojevi[i] + ", ");

		}
		System.out.print("\n");
		System.out.println("Proizvod clanova niza koji su veci od svog indeksa je: " + proizvod);
	}
}
