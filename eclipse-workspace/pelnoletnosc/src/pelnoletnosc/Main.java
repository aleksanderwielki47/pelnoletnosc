package pelnoletnosc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//otwiera scanner
		System.out.println("Podaj swoj wiek:");				//pyta o wiek
		int age = sc.nextInt();								//zbiera odpowiedz uzytkownika
		if(age < 18) {										//jezeli wiek jest mniejszy niz 18
			System.out.println("Jestes niepełnoletni");		//odpowiedz
		} else if(age >= 18) {								//jezeli wiek jest wiekszy lub rowny 18
			System.out.println("Jestes pełnoletni"); 		//odpowiedz	
		}

	}

}
