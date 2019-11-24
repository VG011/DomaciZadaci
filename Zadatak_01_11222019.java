/*
Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve metode(u mainu). Prva metoda vraca proizvod unetih brojeva. 
Druga metoda ispisuje najmanji od unesenih brojeva.
 */

package sedmi;

import java.util.Scanner;

public class Zadatak_01_11222019 {

	public static double proizvod(double a, double b, double c) {
		return a * b * c;
	}

	public static double min(double a, double b, double c) {

		double min = a;
		if (b < min) {
			min = b;
		} else if (c < min) {
			min = c;
		}
		return min;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prvi broj");
		double a = sc.nextDouble();
		System.out.println("Unesite drugi broj");
		double b = sc.nextDouble();
		System.out.println("Unesite treci broj");
		double c = sc.nextDouble();

		double proizvod = proizvod(a, b, c);
		System.out.println("Proizvod je " + proizvod);

		double min = min(a, b, c);
		System.out.println("Najmanji unet broj je " + min);
	}
}
