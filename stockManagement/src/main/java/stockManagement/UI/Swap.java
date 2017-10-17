package stockManagement.UI;

import java.util.Scanner;

import stockManagement.stockManagement.App;

/**
 * In dieser Klasse wird eine Benutzerabfrage gestartet welche die Artikelnummer
 * abfragt und anhand diser Nummer den Artikel auslagert.
 *
 * @author Daniel
 * @version 1.0
 *
 */

public class Swap {

	private static Scanner scan = new Scanner(System.in);
	private int input = 0;
	

	public void swapArticle(){

		System.out.println("Geben Sie die eindeutige Artikelnummer des auszulagernden Artikels an:");
		input = scan.nextInt();
		App.getStorage().swapArticle(input);
	}

}
