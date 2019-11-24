/*
Napisati program koji ce na standarnom izlazu ispisati poruku �Niz je palindrom� 
ili �Niz nije palindrom� (u zavisnosti da li niz jeste ili nije palindrom)
*/

package peti;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_01_11192019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzine niza");
		int n = sc.nextInt();

		int[] brojevi = new int[n];
		int[] pal = new int[n];

		if (n <= 0) {
			System.out.println("Pogresan unos");
		} else {
			for (int i = 0; i < n; i++) {
				System.out.println("Unesite " + (i + 1) + ". element niza");
				int br = sc.nextInt();
				brojevi[i] = br;
				pal[(n - 1) - i] = br;
			}
			System.out.print("Niz je: ");
			for (int i = 0; i < n; i++) {
				System.out.print(brojevi[i]);
			}
			System.out.println();
			System.out.print("Obrnuti niz je: ");
			for (int i = 0; i < n; i++) {

				System.out.print(pal[i]);
			}
			System.out.println();
			if (Arrays.equals(brojevi, pal)) {
				System.out.println("Niz je palindrom");

			} else {
				System.out.println("Niz nije palindrom");
			}
		}
	}
}
