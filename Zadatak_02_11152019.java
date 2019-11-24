/*2.	Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
Primer: ulaz     m=3, n=7;
*/

package cetvrti;

import java.util.Scanner;

public class Zadatak_02_11152019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float n = 1;
		float m = 1;

		System.out.println("Unesite proj kolona (prirodan broj)");
		n = sc.nextFloat();
		if (n % 1 != 0 || n <= 0) {
			System.out.println("Pogrešan unos!");

		} else {
			System.out.println("Unesite proj redova (prirodan broj)");
			m = sc.nextFloat();
		}
		if (m % 1 != 0 || m <= 0) {
			System.out.println("Pogrešan unos!");
		} else {
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print("* ");
					if (j % n == 0) {
						System.out.print("\n");
					}
				}
			}
		}
	}
}
