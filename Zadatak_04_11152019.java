/*4.	Napisati program u kom korisnik unosi n za broj clanova Fibonacijevog niza, 
a ispisuje sve brojeve Fibonacijevog niza ciji je zbir cifara deljiv sa k 
(broj k se takodje ucitava preko tastature).*/

package cetvrti;

import java.util.Scanner;

public class Zadatak_04_11152019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int zbir = 0;

		System.out.println("Unesite broj N veci od nule");
		float n = sc.nextFloat();

		if (n % 1 != 0 || n <= 0) {
			System.out.println("Pogrešan unos!");
		} else {

			System.out.println("Unesite broj K veci od nule");
			float k = sc.nextFloat();

			if (k % 1 != 0 || k <= 0) {
				System.out.println("Pogrešan unos!");

			} else {
				int a = 0;
				int b = 1;
				int c = 0;
				int l = 0;

				System.out.println("Fibonacijev niz " + n + " broja/eva je: ");

				for (int i = -1; i < n; i++) {

					l = a;

					System.out.print(a + ", ");
					c = a + b;
					a = b;
					b = c;

					if (l % k == 0) {

						if (l % 1 == 0) {
							while (l != 0) {
								zbir += l % 10;
								l = l / 10;
							}
						}
					}
				}

				System.out.println("Ukupan zbir cifara deljivih sa " + k + " je " + zbir);

			}
		}
	}
}
