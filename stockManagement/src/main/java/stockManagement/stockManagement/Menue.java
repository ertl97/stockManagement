package stockManagement.stockManagement;

import java.util.ArrayList;
import java.util.Scanner;

import stockManagement.IUserInterface.ConsoleUI;
import stockManagement.IUserInterface.IUserInterface;
import stockManagement.UI.Configurate;
import stockManagement.UI.Content;
import stockManagement.UI.Help;
import stockManagement.UI.Inventory;
import stockManagement.UI.Position;
import stockManagement.UI.Stock;
import stockManagement.UI.Swap;

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
	
	private IUserInterface ui = new ConsoleUI(); 

	public Menue(){
		start();
	}

	public void start(){

		boolean exit = true;



		while(exit){
		System.out.println("____________Lagerverwaltung_____________");
		System.out.println("Eingabe: ");

		input = scan.nextLine();


			switch(input){
			case "konfigurieren":
				configurateSize();
				break;
			case "einlagern":
				stockArticle();
				break;
			case "auslagern":
				swapArticle();
				break;
			case "position":
				articlePosition();
				break;
			case "inventar":
				getInventory();
				break;
			case "inhalt":
				positionContent();
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
	
	
	public void configurateSize() {
		int column;
		int row;
		column = (int) ui.askForNumber();
		row = (int) ui.askForNumber();
		App.getStorage().configurateSize(column, row);
		
	}
	
	public void stockArticle() {
		
		String articleName = ui.askForString(true);
		int articleNumber = (int) ui.askForNumber();
		int packageUnit = (int) ui.askForNumber();
		String distributor = ui.askForString(true);
		int price = (int) ui.askForNumber();
		
		App.getStorage().stockArticle(new Article(articleName,articleNumber,packageUnit,distributor,price));
	}
	
	public void swapArticle() {
		ui.displayMessage("Geben Sie die eindeutige Artikelnummer des auszulagernden Artikels an:");
		int articleNumber = (int) ui.askForNumber();
		App.getStorage().swapArticle(articleNumber);
	}
	
	public void articlePosition() {
		ui.displayMessage("Geben Sie den Namen des gewünschten Artikels an:");
		String articleName = ui.askForString(true);
		App.getStorage().articlePosition(articleName);
	}
	
	public void getInventory() {
		App.getStorage().inventory();
	}
	
	public void positionContent() {
		ui.displayMessage("Bitte geben Sie eine Spalten- und Zeilennummer ein.");
		int column = (int) ui.askForNumber();
		int row = (int) ui.askForNumber();
		
		App.getStorage().positionContent(column, row);
	}
	
	public void getHelp() {
		
		
		
	}


}

