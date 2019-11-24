/*
Korisnik ucitava niz od N elemenata niza (koristiti posebnu metodu).
Napisati zasebno 2 metode
Prva metoda ispisuje elemente niza koji su deljivi sa 3
Druga metoda ispisuje elemente niza koji su deljivi sa 5

ili

Korisnik ucitava niz od N elemenata niza, kao i neki broj K za deljivost. Napisati metodu koja ispisuje elemente niza deljive brojem K.

*/

package sesti;

import java.util.Scanner;

public class Zadatak_01_11212019 {

	public static int[] ucitajNiz(int duzina) {
		int[] niz = new int[duzina];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			niz[i] = s.nextInt();
		}

		return niz;
	}

	public static void ispisiNiz(int[] brojevi) {
		for (int i = 0; i < brojevi.length; i++) {
			System.out.print(brojevi[i] + " ");
		}

		System.out.println();
	}

	public static void ispisiNizDeljivSaTri(int[] brojevi) {
		for (int i = 0; i < brojevi.length; i++) {
			if (brojevi[i] % 3 == 0) {
				System.out.print(brojevi[i] + " ");
			}
		}

		System.out.println();
	}

	public static void ispisiNizDeljivSaPet(int[] brojevi) {
		for (int i = 0; i < brojevi.length; i++) {
			if (brojevi[i] % 5 == 0) {
				System.out.print(brojevi[i] + " ");
			}
		}

		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu niza");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Greska! Unesite pozitivan broj!");
		} else {
			System.out.println("Unesite elemente niza");
			int[] niz = ucitajNiz(n);

			System.out.print("Uneti niz je: ");
			ispisiNiz(niz);
			System.out.print("Elementi niza deljivi sa 3: ");
			ispisiNizDeljivSaTri(niz);
			System.out.print("Elementi niza deljivi sa 5: ");
			ispisiNizDeljivSaPet(niz);

		}
	}
}
