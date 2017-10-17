package stockManagement.UI;

import java.util.Scanner;

import stockManagement.stockManagement.App;

/**
 * In dieser Klasse wird eine Benutzerabfrage gestartet, welche die Spaltennummer und die Zeilennummer
 * abfragt und den zu diser Position gehörenden Artikel ausgibt.
 * 
 * @author Daniel
 * @version 1.0
 *
 */

public class Content {

	private static Scanner scan = new Scanner(System.in);

	public void positionContent(){
		int column = 0;
		int row = 0;
		System.out.println("Bitte geben Sie die Spaltenummer ein:");
		column = scan.nextInt();
		System.out.println("Bitte geben Sie die Zeilennummer ein:");
		row = scan.nextInt();

		App.getStorage().positionContent(column, row);

	}

}
