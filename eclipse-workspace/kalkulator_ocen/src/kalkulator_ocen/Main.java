package kalkulator_ocen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ile miales punktow z testu:");
		int punkty = sc.nextInt();
		
		if (punkty >= 90) {
			System.out.println("ocena A");
		} else if (punkty > 80 && punkty < 89) {
			System.out.println("ocena B");
		} else if (punkty > 70 && punkty < 79) {
			System.out.println("ocena C");
		} else if (punkty > 60 && punkty < 69) {
			System.out.println("ocena D");
		} else if (punkty < 60) {
			System.out.println("ocena F");
		}

	}

}
