/*
Napisati program koji ucitava niz od n celih brojeva i dve metode. Prva metoda vraca proizvod elemenata na neparnim pozicijama, 
a druga vraca zbir parnih elemenata niza.
*/

package sedmi;

import java.util.Scanner;

public class Zadatak_02_11222019 {

	public static int[] ucitajNiz(int n) {
		Scanner s = new Scanner(System.in);
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = s.nextInt();
		}
		return niz;
	}

	public static void ispisNiz(int[] brojevi) {
		for (int i = 0; i < brojevi.length; i++) {
			System.out.print(brojevi[i] + " ");
		}

	}

	public static int ispisProizvod(int[] niz) {
		int proizvod = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 == 1) {
				proizvod *= niz[i];
			}

		}
		return proizvod;
	}

	public static int ispisZbir(int[] niz) {
		int zbir = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				zbir += niz[i];
			}

		}
		return zbir;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite duzinu niza");
		int n = s.nextInt();

		if (n <= 0) {
			System.out.println("Greska! Unesite pozitivan broj!");
		} else {
			System.out.println("Unesite elemente niza");
			int niz[] = ucitajNiz(n);

			System.out.println("Uneti niz je: ");
			ispisNiz(niz);
			System.out.println();

			System.out.println("Proizvod elemenata na neparnim pozicijama je: " + ispisProizvod(niz));

			System.out.println("Zbir parnih elemenata niza je: " + ispisZbir(niz));
		}
	}
}
