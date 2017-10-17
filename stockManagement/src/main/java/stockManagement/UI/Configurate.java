package stockManagement.UI;

import java.util.Scanner;

import stockManagement.stockManagement.App;

/**
 * In dierser Klasse wird eine Benutzerabfrage gestartet, welche die gewünschte Spalten- und Zeilenzahl abfragt.
 * Mit diesen eingegebenen Werten wird die Größe des "Regals" geändert. 
 * 
 * @author Daniel
 * @version 1.0
 */

public class Configurate {

	private static Scanner scan = new Scanner(System.in);
	private int input = 0;

	public void configurateSize(){
		int column;
		int row;
		System.out.println("Geben Sie eine Spaltenzahl ein:");
		column = Integer.parseInt(scan.nextLine());
		System.out.println("Geben Sie eine Zeilenzahl ein:");
		row = Integer.parseInt(scan.nextLine());

		App.getStorage().configurateSize(column, row);
		
	}
}
