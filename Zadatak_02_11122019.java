/* 
 U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da li ce lift 
 
 
 bezbedno krenuti u zavisnostii od tezine koju treba da ponese. 
 Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift je pokrenut 
 (zahtevi zadatka namerno nisu dalje razradjivani jer 1) ostavljam vasoj masti na volju 
 2) zelim da budem upucena u vas tok razmisljanja).
 */

package drugi;

import java.util.Scanner;

public class Zadatak_02_11122019 {

	public static void main(String[] args) {
		Scanner lift = new Scanner(System.in);

		float tezina = 0;

		System.out.println("Ukupna nosivost lifta je 680kg ili 8 osoba - unesite tezinu prve osobe ili tezinu tereta");
		float o1 = lift.nextFloat();
		if (o1 < 0) {
			System.out.println("Pogrešan unos!");
		} else {
			tezina += o1;
		}
		if (tezina > 680) {
			System.out.println("Lift je preopterecen!");
		} else if (tezina < 680) {
			System.out.println("Ukupna opterecenost lifta je " + tezina + " kg");
		} else if (tezina == 680) {
			System.out.println("Lift je na granici opterecenosti");
		}
		if (tezina < 680) {
			System.out.println("Unesite tezinu druge osobe ili tezinu tereta");
			float o2 = lift.nextFloat();
			if (o2 < 0) {
				System.out.println("Pogrešan unos!");
			} else {
				tezina += o2;
			}
			if (tezina < 680) {
				System.out.println("Ukupna opterecenost lifta je " + tezina + " kg");
			} else if (tezina > 680) {
				System.out.println("Lift je preopterecen!");
			} else if (tezina == 680) {
				System.out.println("Lift je na granici opterecenosti");
			}
			if (tezina < 680) {
				System.out.println("Unesite tezinu trece osobe ili tezinu tereta");
				float o3 = lift.nextFloat();
				if (o3 < 0) {
					System.out.println("Pogrešan unos!");
				} else {
					tezina += o3;
				}
				if (tezina < 680) {
					System.out.println("Ukupna opterecenost lifta je " + tezina + " kg");
				} else if (tezina > 680) {
					System.out.println("Lift je preopterecen!");
				} else if (tezina == 680) {
					System.out.println("Lift je na granici opterecenosti");
				}
				if (tezina < 680) {
					System.out.println("Unesite tezinu cetvrte osobe ili tezinu tereta");
					float o4 = lift.nextFloat();
					if (o4 < 0) {
						System.out.println("Pogrešan unos!");
					} else {
						tezina += o4;
					}
					if (tezina < 680) {
						System.out.println("Ukupna opterecenost lifta je " + tezina + " kg");
					} else if (tezina > 680) {
						System.out.println("Lift je preopterecen!");
					} else if (tezina == 680) {
						System.out.println("Lift je na granici opterecenosti");
					}
					if (tezina < 680) {
						System.out.println("Unesite tezinu pete osobe ili tezinu tereta");
						float o5 = lift.nextFloat();
						if (o5 < 0) {
							System.out.println("Pogrešan unos!");
						} else {
							tezina += o5;
						}
						if (tezina < 680) {
							System.out.println("Ukupna opterecenost lifta je " + tezina + " kg");
						} else if (tezina > 680) {
							System.out.println("Lift je preopterecen!");
						} else if (tezina == 680) {
							System.out.println("Lift je na granici opterecenosti");
						}
						if (tezina < 680) {
							System.out.println("Unesite tezinu seste osobe ili tezinu tereta");
							float o6 = lift.nextFloat();
							if (o6 < 0) {
								System.out.println("Pogrešan unos!");
							} else {
								tezina += o6;
							}
							if (tezina < 680) {
								System.out.println("Ukupna opterecenost lifta je " + tezina + " kg");
							} else if (tezina > 680) {
								System.out.println("Lift je preopterecen!");
							} else if (tezina == 680) {
								System.out.println("Lift je na granici opterecenosti");
							}
							if (tezina < 680) {
								System.out.println("Unesite tezinu sedme osobe ili tezinu tereta");
								float o7 = lift.nextFloat();
								if (o7 < 0) {
									System.out.println("Pogrešan unos!");
								} else {
									tezina += o7;
								}
								if (tezina < 680) {
									System.out.println("Ukupna opterecenost lifta je " + tezina + " kg");
								} else if (tezina > 680) {
									System.out.println("Lift je preopterecen!");
								} else if (tezina == 680) {
									System.out.println("Lift je na granici opterecenosti");
								}
								if (tezina < 680) {
									System.out.println("Unesite tezinu osme osobe ili tezinu tereta");
									float o8 = lift.nextFloat();
									if (o8 < 0) {
										System.out.println("Pogrešan unos!");
									} else {
										tezina += o8;
									}
									if (tezina < 680) {
										System.out.println("Ukupna opterecenost lifta je " + tezina + " kg");
									}
									if (tezina == 0) {
										System.out.println("Lift je prazan!");
									} else if (tezina > 680) {
										System.out.println("Lift je preopterecen!");
									} else if (tezina == 680) {
										System.out.println("Lift je na granici opterecenosti");
									} else {
										System.out.println("Lift je pokrenut");
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
