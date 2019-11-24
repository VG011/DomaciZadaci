/*1.	Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 
(ukljucujuci i njih) deljivih brojem 3.*/

package cetvrti;

public class Zadatak_01_11152019 {

	public static void main(String[] args) {

		int broj = 0;
		int j = 1;

		for (int i = 9; i <= 250; i++) {
			if (i % 3 == 0) {
				broj += j;	
			}
		}
		System.out.println("Izmedju 9 i 250 postoji " + broj + " brijeva deljivih sa 3");

	}

}
