package peti;

import java.util.Scanner;

public class Zadatak_03_11192019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int br = 0;
		int pal = 0;
		String p = "";
		String t = "";

		System.out.println("Unesite duzine niza");
		int n = sc.nextInt();

		int[] brojevi = new int[n];

		if (n <= 0) {
			System.out.println("Pogresan unos");
		} else {
			for (int i = 0; i < n; i++) {
				System.out.println("Unesite " + (i + 1) + ". element niza");
				br = sc.nextInt();
				brojevi[i] = br;

				pal = br;
				p = "";
				t = "";
				t += br;

				while (pal != 0) {
					p += pal % 10;
					pal = pal / 10;
				}
				if ((t).equals(p)) {
					System.out.println("Broj " + br + " je palindrom");
				} else {
					System.out.println("Broj " + br + " nije palindrom");
				}
			}
		}
	}
}