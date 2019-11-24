/* 
Napisati program koji proverava da li je uneti broj paran ili neparan. 
Ukoliko jeste, program treba da ispise poruku: Broj je paran! 
Ukoliko nije, program treba da ispise poruku: Broj je neparan! 
*/

package drugi;

import java.util.Scanner;

public class Zadatak_01_11122019 {

	public static void main(String[] args) {

		Scanner br = new Scanner(System.in);

		System.out.println("Unesite ceo broj");
		float broj = br.nextFloat();

		if (broj % 1 != 0) {
			System.out.println("Niste uneli ceo broj!");
		} else if (broj % 2 == 0) {
			System.out.println("Broj " + broj + " je paran");
		} else {
			System.out.println("Broj " + broj + " je neparan");
		}

	}

}
