/*3.	Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
(Na internetu istraziti sta je Fibonacijev niz!!!)
*/

package cetvrti;

import java.util.Scanner;

public class Zadatak_03_11152019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj N veci od nule");
		float n = sc.nextFloat();

		if (n % 1 != 0 || n <= 0) {
			System.out.println("Pogrešan unos!");
		} else {
			int a = 0;
			int b = 1;
			int c = 0;
			
			System.out.println("Fibonacijev niz " + n + " broja/eva je: ");

			for (int i = 0; i < n; i++) {

				System.out.print(a + ", ");
				c = a + b;
				a = b;
				b = c;
			}
		}
	}
}
