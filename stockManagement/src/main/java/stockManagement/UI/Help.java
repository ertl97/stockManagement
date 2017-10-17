package stockManagement.UI;

import java.util.Scanner;

/**
 * In der Help Klasse werden die einzelnen Befehle ausgeben. Der Benutzer kann weiters auf
 * die Befehle eingehen und bekommt mehr Informationen über den ausgewählten Befehl.
 *
 * @author Daniel
 * @verion 1.0
 *
 */

public class Help {

	private static Scanner scan = new Scanner(System.in);
	private String input = "";

	public void getHelp(){
		boolean exit =true;

		while(exit){
			System.out.println("____________Hilfe_____________");
			System.out.println("Die Befehle lauten:");
			System.out.println("konfigurieren");
			System.out.println("einlagern");
			System.out.println("auslagern");
			System.out.println("position");
			System.out.println("inventar");
			System.out.println("inhalt");
			System.out.println("Hilfe zu: ");

			input = scan.nextLine();


				switch(input){
				case "konfigurieren":
					System.out.println("Mit disem Befehl kann man die größe des Speichers definieren. "
							+ "Achtung! Nur Zahlen eingeben!");
					break;
				case "einlagern":
					System.out.println("Mit diesem Befehl kann man einen neuen Artikel in das System einlagern. "
							+ "Achtung! Die Artikelnummer darf nur einmalig sein.");
					break;
				case "auslagern":
					System.out.println("Mit diesm Befehl kann man einen bestimmten Artikel auslagern. "
							+ "Achtung! Der Artikel wird durch die Artikelnummer ausgelagert!");
					break;
				case "position":
					System.out.println("Mit disem Befehl kann man die Position eines bestimmten Artikels zurückgeben lassen.");
					break;
				case "inventar":
					System.out.println("Mit diesem Befehl kann man das gesammte Inventar ausgeben.");
					break;
				case "inhalt":
					System.out.println("Mit diesem Befehl kann man den Artikel einer bestimmten Position ausgeben.");
					break;
				case "beenden":
					exit = false;
					break;

				default:
					break;
				}
			}

	}
}
