package stockManagement.UI;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Die Klasse Menue stellt die einzelen Befehle bereit, die der Benutzer wählen kann.
 *
 * @author Daniel
 * @version 1.0
 *
 */


public class Menue {


	private static Scanner scan = new Scanner(System.in);
	private String input = "";

	public Menue(){
		start();
	}

	public void start(){

		boolean exit =true;



		while(exit){
		System.out.println("____________Lagerverwaltung_____________");
		System.out.println("Eingabe: ");

		input = scan.nextLine();


			switch(input){
			case "konfigurieren":
				new Configurate().configurateSize();
				break;
			case "einlagern":
				new Stock().stockArticle();
				break;
			case "auslagern":
				new Swap().swapArticle();
				break;
			case "position":
				new Position().articlePosition();
				break;
			case "inventar":
				new Inventory().getInventory();
				break;
			case "inhalt":
				new Content().positionContent();
				break;
			case "hilfe":
				new Help().getHelp();
				break;
			case "beenden":
				System.out.println("==>BEENDE PROGRAMM<==");
				exit = false;
				break;

			default:
				break;
			}
		}
		scan.close();
	}


}

