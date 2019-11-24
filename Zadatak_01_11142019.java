/*
 Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana. 
(Vodite racuna o prestupnoj godini!) - za resavanje ovog zadatka koristiti switch
*/

package treci;

import java.util.Scanner;

public class Zadatak_01_11142019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite godinu u formatu YYYY");
		int god = sc.nextInt();

		System.out.println("Unesite mesec u formatu MM");
		int m = sc.nextInt();

		switch (m) {
		case 1:
			System.out.println("Mesec Januar " + god + "-e ima 31 dan");
			break;
		case 2:
			if (god % 4 == 0 && god % 100 != 0) {
				System.out.println("Mesec Februar " + god + "-e ima 29 dana jer je prestupna godina!");
				break;
			} else if (god % 400==0 ){ 
				System.out.println("Mesec Februar " + god + "-e ima 29 dana jer je prestupna godina!");
				break;
			}
			else {
				System.out.println("Mesec Februar " + god + "-e ima 28 dan");
				break;
			}
		case 3:
			System.out.println("Mesec Mart " + god + "-e godine ima 31 dan");
			break;
		case 4:
			System.out.println("Mesec April " + god + "-e godine ima 30 dana");
			break;
		case 5:
			System.out.println("Mesec Maj " + god + "-e godine ima 31 dan");
			break;
		case 6:
			System.out.println("Mesec Jun " + god + "-e godine ima 30 dana");
			break;
		case 7:
			System.out.println("Mesec Jul " + god + "-e godine ima 31 dan");
			break;
		case 8:
			System.out.println("Mesec Avgust " + god + "-e godine ima 31 dan");
			break;
		case 9:
			System.out.println("Mesec Septembar " + god + "-e godine ima 30 dana");
			break;
		case 10:
			System.out.println("Mesec Oktobar " + god + "-e godine ima 31 dan");
			break;
		case 11:
			System.out.println("Mesec Novembar " + god + "-e godine ima 30 dan");
			break;
		case 12:
			System.out.println("Mesec Decembar " + god + "-e godine ima 31 dan");
			break;
		default:
			System.out.println("Greska! Pogrešan unos!");
			break;
		}

	}

}
