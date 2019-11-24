/*
Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva 
od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju 
(ne jednu vrstu petlje, vec samo jednu petlju). 
 */

package treci;

import java.util.Scanner;

public class Zadatak_02_11142019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite N vrednost (pozitivan broj)");
		float n = sc.nextFloat();

		int zbir = 0;
		int proizvod = 1;

		if (n % 1 != 0) {
			System.out.println("Niste uneli ceo broj!");
		} else if (n <= 0) {
			System.out.println("Greska - unesite pozitivan broj!");
		} else {
			int i = 1;
			while (i <= n) {
				if (i % 2 == 0) {
					zbir += i;
				} else {
					proizvod *= i;
				}
				i++;
			}
			System.out.println("Ukupan zbir prvih " + n + " parnih brojeva je: " + zbir);
			System.out.println("Ukupan proizvod prvih " + n + " neparnih brojeva je: " + proizvod);
		}

	}

}
