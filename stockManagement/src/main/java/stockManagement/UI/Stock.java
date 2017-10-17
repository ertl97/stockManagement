package stockManagement.UI;

import java.util.Scanner;

import stockManagement.stockManagement.App;
import stockManagement.stockManagement.Article;

/**
 * In diser Klasse wird eine Benutzereingabe gestartet, welche die einzelnen Parameter 
 * zur Erstellung des Artikels abfragt. Anschließend wird ein Artikel erstellt.
 * 
 * @author Daniel
 * @version 1.0
 */

public class Stock {

	private static Scanner scan = new Scanner(System.in);
	private String input = "";

	public void stockArticle(){
		String articleName = "";
		int articleNumber = 0;
		int packageUnit = 0;
		String distributor = "";
		int price = 0;

		System.out.println("Geben Sie einen Namen für den Artikel ein:");
		articleName = scan.nextLine();
		System.out.println("Geben Sie eine Artikelnummer ein:");
		articleNumber = Integer.parseInt(scan.nextLine());
		System.out.println("Geben Sie eine Verpackungseinheit ein:");
		packageUnit = Integer.parseInt(scan.nextLine());
		System.out.println("Geben Sie den Lieferanten an:");
		distributor = scan.nextLine();
		System.out.println("Geben Sie den Preis des Artikels ein:");
		price = Integer.parseInt(scan.nextLine());



		App.getStorage().stockArticle(new Article(articleName,articleNumber,packageUnit,distributor,price));
	}

}
